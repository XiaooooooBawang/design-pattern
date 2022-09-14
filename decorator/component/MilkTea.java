package component;

/**
 * Component 装饰接口：装饰接口定义了装饰的顶层抽象行为，一般定义被装饰者和装饰者的公用行为
 *
 * @author 小霸王
 */
public interface MilkTea {
    /**
     * 获取奶茶描述
     *
     * @return
     */
    String getDescription();

    /**
     * 获取奶茶价格
     *
     * @return
     */
    double getPrice();
}
