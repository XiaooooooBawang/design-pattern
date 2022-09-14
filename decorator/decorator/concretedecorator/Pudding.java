package decorator.concretedecorator;

import component.MilkTea;
import decorator.Ingredients;

/**
 * 具体装饰类（Concrete Decorators）定义了可动态添加到部件的额外行为。
 * 具体装饰类会重写装饰基类的方法，并在调用父类方法之前或之后进行额外的行为。
 *
 * 装饰器类：布丁类
 * @author 小霸王
 */
public class Pudding extends Ingredients {
    /**
     * 该配料的描述
     */
    private String description = "加了布丁";

    /**
     * 该配料的价格
     */
    private double price = 2;

    public Pudding(MilkTea milkTea) {
        super(milkTea);
    }

    @Override
    public String getDescription() {
        return super.getDescription() + description;
    }

    @Override
    public double getPrice() {
        return super.getPrice() + price;
    }
}
