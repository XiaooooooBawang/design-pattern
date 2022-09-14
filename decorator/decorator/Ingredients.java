package decorator;

import component.MilkTea;

/**
 * 装饰（Decorator）类拥有一个指向被封装对象的引用成员变量。
 * 该变量的类型应当被声明为通用部件接口，这样它就可以引用具体的部件和装饰。
 * 装饰基类会将所有操作委派给被封装的对象。
 *
 * 调料类
 *
 * @author 小霸王
 */
public abstract class Ingredients implements MilkTea {
    private MilkTea milkTea;

    public Ingredients(MilkTea milkTea) {
        this.milkTea = milkTea;
    }

    @Override
    public String getDescription() {
        return milkTea.getDescription();
    }

    @Override
    public double getPrice() {
        return milkTea.getPrice();
    }
}
