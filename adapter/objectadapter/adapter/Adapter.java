package objectadapter.adapter;

import classadapter.adaptee.Adaptee;
import objectadapter.adaptee.AmericanCharger;
import objectadapter.target.Target;

/**
 * 对象适配器配，可以同时与客户端和服务交互，它在实现客户端接口的同时封装了服务对象。
 *
 * @author 小霸王
 */
public class Adapter implements Target {
    /**
     * 封装服务对象
     */
    Adaptee adaptee;

    public Adapter(Adaptee adaptee) {
        this.adaptee = adaptee;
    }

    @Override
    public void chargeBy220V() {
        //现有功能
        adaptee.chargeBy120V();
        //对现有功能的扩展
        System.out.println("适配器，输入120V，输入220V");
    }
}
