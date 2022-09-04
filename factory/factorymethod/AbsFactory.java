package factorymethod;

import product.abs.Phone;

/**
 * 工厂方法模式的抽象工厂，通过实现不同的工厂方法来创建不同的产品，一个方法通常对应一个产品，
 * 这种方式相较于简单工厂模式扩展性更高，在需求增加时完全符合开闭原则和依赖倒置原则
 */
public interface AbsFactory {
    Phone makePhone();
}
