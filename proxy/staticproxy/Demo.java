package staticproxy;

/**
 * 代理模式能控制着对于原对象的访问，可以在不修改被代理对象的基础上，通过扩展代理类，进行一些功能的附加与增强。
 */
public class Demo {
    public static void main(String[] args) {
        //真正的租房对象
        IRentHouse real = new RentHouse();
        //代理对象，要租房就可以找代理对象
        IntermediaryProxy proxy = new IntermediaryProxy(real);
        //通过代理对象租房
        proxy.payRent();
    }
}
