package forceproxy;

/**
 * 代理真正租房类的代理类，也就是中介。
 */
public class IntermediaryProxy implements IRentHouse {

    //包含一个指向被代理对象的引用成员变量
    private IRentHouse rentHouse;

    public IntermediaryProxy(IRentHouse rentHouse) {
        this.rentHouse = rentHouse;
    }

    @Override
    public void payRent() {
        rentHouse.payRent();
    }

    @Override
    public IRentHouse getProxy() {
        return this;
    }
}
