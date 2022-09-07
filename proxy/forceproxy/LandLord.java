package forceproxy;

/**
 * 真正的租房类
 */
public class LandLord implements IRentHouse {

    //当前对对象的代理对象
    private IRentHouse proxy = null;

    @Override
    public void payRent() {
        //要找代理对象才能实现租房
        if (isProxy()) {
            System.out.println("找了中介租了间房");
        } else {
            System.out.println("请找中介租房");
        }

    }

    @Override
    public IRentHouse getProxy() {
        proxy = new IntermediaryProxy(this);
        return proxy;
    }

    private boolean isProxy() {
        return proxy != null;
    }
}
