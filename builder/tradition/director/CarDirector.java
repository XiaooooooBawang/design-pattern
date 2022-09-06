package tradition.director;

import tradition.builder.CarBuilder;
import tradition.product.Car;

/**
 * 指导者类，定义调用构造步骤的顺序
 */
public class CarDirector {
    private CarBuilder carBuilder;

    public CarDirector(CarBuilder carBuilder) {
        this.carBuilder = carBuilder;
    }

    //建造产品的方法，规定了建造产品的各个步骤的顺序
    public Car build() {
        carBuilder.buildBrand();
        carBuilder.buildEngine();
        carBuilder.buildShell();
        carBuilder.buildWheel();
        carBuilder.buildSteeringWheel();
        return carBuilder.getCar();
    }
}
