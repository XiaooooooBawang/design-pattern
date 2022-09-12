package classadapter.adaptee;

/**
 *现有接口的具体实现类，美国供电器
 *
 * @author 小霸王
 */
public class AmericanCharger implements Adaptee{
    @Override
    public void chargeBy120V() {
        System.out.println("美国的充电器，提供120V电压");
    }
}
