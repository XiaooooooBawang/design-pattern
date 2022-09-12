package publisher;

import subscriber.Subscriber;

import java.util.LinkedList;
import java.util.List;

/**
 * 抽象的发布者（被观察者）会向其他对象发送值得关注的事件。
 * 事件会在发布者自身状态改变或执行特定行为后发生。
 * 发布者中包含一个允许新订阅者加入和当前订阅者离开列表的订阅构架。
 *
 * @author 小霸王
 */
abstract public class AbstractPublisher {
    /**
     * 订阅者集合
     */
    private List<Subscriber> subscribers = new LinkedList<>();

    /**
     * 添加新订阅者
     *
     * @param subscriber 新订阅者
     */
    public void addSubscriber(Subscriber subscriber) {
        subscribers.add(subscriber);
    }

    /**
     * 离开订阅者列表
     *
     * @param subscriber 要离开的订阅者
     */
    public void removeSubscriber(Subscriber subscriber) {
        subscribers.remove(subscriber);
    }

    /**
     * 当新事件发生时，发布者会遍历订阅列表并调用每个订阅者对象的通知方法。
     */
    public void notifySubscribers() {
        for (Subscriber s : subscribers) {
            s.buyPhone();
        }
    }

    /**
     * 新事件发生的抽象方法
     */
    public abstract void newPhonesArrive();
}
