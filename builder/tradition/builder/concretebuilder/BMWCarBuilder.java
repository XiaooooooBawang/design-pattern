package tradition.builder.concretebuilder;

import tradition.builder.CarBuilder;
import tradition.product.Car;

/**
 * 具体的汽车建造者类，提供建造产品过程中的不同实现
 */
public class BMWCarBuilder implements CarBuilder {
    private Car car = new Car();

    @Override
    public void buildBrand() {
        car.setBrand("宝马车");
    }

    @Override
    public void buildWheel() {
        car.setWheel("车轮");
    }

    @Override
    public void buildShell() {
        car.setShell("车壳");
    }

    @Override
    public void buildEngine() {
        car.setEngine("8缸发动机");
    }

    @Override
    public void buildSteeringWheel() {
        car.setSteeringWheel("方向盘");
    }

    @Override
    public Car getCar() {
        return car;
    }
}
