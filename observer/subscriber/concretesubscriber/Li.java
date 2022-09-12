package subscriber.concretesubscriber;

import subscriber.Subscriber;

/**
 * 具体的订阅者：小李
 * 可以执行一些操作来回应发布者的通知。
 * 所有具体订阅者类都实现了同样的接口， 因此发布者不需要与具体类相耦合。
 *
 * @author 小霸王
 */
public class Li implements Subscriber {
    @Override
    public void buyPhone() {
        System.out.println("小李要去买苹果手机");
    }
}
