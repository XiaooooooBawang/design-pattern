package staticproxy;

/**
 * 租房的接口，代理必须遵循该接口才能伪装成服务对象。
 * 代理类和被代理类应该共同实现一个接口，或者是共同继承某个类。
 */
public interface IRentHouse {
    void payRent();
}
