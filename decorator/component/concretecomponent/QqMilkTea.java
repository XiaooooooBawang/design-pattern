package component.concretecomponent;

import component.MilkTea;

/**
 * ConcreteComponent 被装饰类，实现装饰接口
 *
 * QQ奶茶
 *
 * @author 小霸王
 */
public class QqMilkTea implements MilkTea {
    /**
     * 该奶茶的描述
     */
    private String description = "QQ奶茶";

    /**
     * 该奶茶的价格
     */
    private double price = 13;

    @Override
    public String getDescription() {
        return description;
    }

    @Override
    public double getPrice() {
        return price;
    }
}
