package subscriber;

/**
 * 订阅者（观察者）接口，声明了通知接口。
 * 在绝大多数情况下，该接口仅包含一个 update更新方法（这里是buyPhone方法），
 * 该方法可以拥有多个参数，使发布者能在更新时传递事件的详细信息。
 *
 * @author 小霸王
 */
public interface Subscriber {
    /**
     * 买手机
     */
    void buyPhone();
}
