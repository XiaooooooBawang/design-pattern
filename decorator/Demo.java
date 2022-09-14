import component.MilkTea;
import component.concretecomponent.ChocolateMilkTea;
import component.concretecomponent.QqMilkTea;
import decorator.concretedecorator.Coconut;
import decorator.concretedecorator.Pudding;

/**
 * 装饰器模式（Decorator Pattern）是一种结构型设计模式，允许向一个现有的对象添加新的功能，同时又不改变其结构。
 *
 * 跟桥接模式很相似。
 *
 * @author 小霸王
 */
public class Demo {
    public static void main(String[] args) {
        MilkTea chocolateMilkTea = new ChocolateMilkTea();
        MilkTea coconutChocolateMilkTea = new Coconut(chocolateMilkTea);
        String description = coconutChocolateMilkTea.getDescription();
        double price = coconutChocolateMilkTea.getPrice();
        System.out.println(description + "的价格是：" + price);

        MilkTea qqMilkTea = new QqMilkTea();
        MilkTea puddingQqMilkTea = new Pudding(qqMilkTea);
        description = puddingQqMilkTea.getDescription();
        price = puddingQqMilkTea.getPrice();
        System.out.println(description + "的价格是：" + price);
    }
}
