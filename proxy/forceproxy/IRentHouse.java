package forceproxy;

/**
 * 租房的接口，在强制代理中多加一个获取代理对象的方法，必须要获取代理对象，找代理对象才能成功办事
 */
public interface IRentHouse {
    void payRent();
    IRentHouse getProxy();
}
