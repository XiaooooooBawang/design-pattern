import publisher.concretepublisher.AppleStore;
import subscriber.concretesubscriber.Li;
import subscriber.concretesubscriber.Wang;

/**
 * 观察者模式是一种行为设计模式， 允许你定义一种订阅机制， 可在对象事件发生时通知多个 “观察” 该对象的其他对象。
 *
 * @author 小霸王
 */
public class Demo {
    public static void main(String[] args) {
        AppleStore appleStore = new AppleStore();

        appleStore.addSubscriber(new Li());
        Wang wang = new Wang();
        appleStore.addSubscriber(wang);
        appleStore.removeSubscriber(wang);

        appleStore.newPhonesArrive();
    }
}
