package tradition;

import tradition.builder.CarBuilder;
import tradition.builder.concretebuilder.BMWCarBuilder;
import tradition.director.CarDirector;
import tradition.product.Car;

/**
 * 建造者模式是一种创建型设计模式， 使你能够分步骤创建复杂对象。 该模式允许你使用相同的创建代码生成不同类型和形式的对象。
 * 使用建造者模式可避免 “重叠构造函数 （telescoping constructor）” 的出现。
 * 建造者模式与工厂模式的区别是：建造者模式更加关注与零件装配的顺序，所以出现了指导者角色。
 */
public class Demo {
    public static void main(String[] args) {
        CarBuilder builder = new BMWCarBuilder();
        CarDirector director = new CarDirector(builder);
        Car car = director.build();
        System.out.println(car);
    }
}
