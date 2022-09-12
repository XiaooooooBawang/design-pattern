package classadapter.adaptee;

/**
 * 现有接口(实际拥有的接口)
 *
 * @author 小霸王
 */
public interface Adaptee {
    /**
     * 只能通过110V电压充电
     */
    void chargeBy120V();
}
