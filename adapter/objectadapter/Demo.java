package objectadapter;

import classadapter.adaptee.Adaptee;
import classadapter.adaptee.AmericanCharger;
import objectadapter.adapter.Adapter;

/**
 * 适配器模式是一种结构型设计模式， 它能使接口不兼容的对象能够相互合作。
 * 当我们有动机地修改一个正常运行的系统的接口，这时应该考虑使用适配器模式。
 *
 * @author 小霸王
 */
public class Demo {
    public static void main(String[] args) {
        //美国的充电器，没法直接用（220V）
        Adaptee americanCharger = new AmericanCharger();
        //适配器
        Adapter adapter = new Adapter(americanCharger);
        //用适配器实现220V充电
        adapter.chargeBy220V();
    }
}
