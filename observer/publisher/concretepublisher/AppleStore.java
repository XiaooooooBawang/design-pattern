package publisher.concretepublisher;

import publisher.AbstractPublisher;

/**
 * 具体的发布者
 *
 * @author 小霸王
 */
public class AppleStore extends AbstractPublisher {
    /**
     * 新事件产生，并通知所有订阅者
     */
    @Override
    public void newPhonesArrive() {
        System.out.println("新iPhone到店了，大家快来买");
        notifySubscribers();
    }
}
