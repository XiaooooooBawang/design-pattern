package abstractfactory;

import product.abs.Laptop;
import product.abs.Phone;

/**
 *抽象工厂模式的抽象工厂。
 * 抽象工厂模式是工厂方法模式的升级版，后者面向单个产品，而前者面向的的是一个产品族。
 * 抽象工厂的存在是为了面向开闭原则，出现新的工厂和产品后不需要修改高层逻辑就可以实现修改。为了限制新工厂的行为。
 */
public interface AbstractFactory {
    Phone makePhone();
    Laptop makeLaptop();
}
