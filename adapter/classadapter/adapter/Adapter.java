package classadapter.adapter;

import classadapter.adaptee.AmericanCharger;
import classadapter.target.Target;

/**
 * 类适配器，通过继承现有接口的实现类（AmericanCharger）来完成对现有接口的扩展，并使其能满足客户端的要求（Target）
 * 类适配器应该是同时继承两个接口，这种方式仅能在支持多重继承的编程语言中实现，例如 C++，所以Java只能用继承实现类和实现接口来达到相似的效果
 *
 * @author 小霸王
 */
public class Adapter extends AmericanCharger implements Target {
    @Override
    public void chargeBy220V() {
        //现有功能
        super.chargeBy120V();

        //对现有功能的扩展
        System.out.println("适配器，输入120V，输入220V");
    }
}
