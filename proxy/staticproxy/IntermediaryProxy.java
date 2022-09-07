package staticproxy;

/**
 * 代理真正租房类的代理类，也就是中介。
 * 代理模式可以在不修改被代理对象的基础上，通过扩展代理类，进行一些功能的附加与增强。
 */
public class IntermediaryProxy implements IRentHouse{

    //包含一个指向被代理对象的引用成员变量
    private IRentHouse rentHouse;

    public IntermediaryProxy(IRentHouse rentHouse) {
        this.rentHouse = rentHouse;
    }

    @Override
    public void payRent() {
        //交中介费和中介负责后续管理就是代理类对被代理类的拓展，进行功能的附加与增强，spring aop就是用代理实现的
        System.out.println("交中介费");
        //代理对象代理真正的对象完成一定的任务
        rentHouse.payRent();
        System.out.println("中介负责后续管理");
    }
}
