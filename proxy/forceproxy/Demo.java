package forceproxy;

/**
 * 强制代理
 */
public class Demo {
    public static void main(String[] args) {
        //真正的租房对象
        IRentHouse real = new LandLord();
        //不找代理对象办不到事儿
        real.payRent();  //请找中介租房

        //代理对象，要租房必须要找代理对象
        IRentHouse proxy = real.getProxy();
        //通过代理对象租房
        proxy.payRent(); //找了中介租了间房
    }
}
