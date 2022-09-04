package simplefactory;

import product.OppoPhone;
import product.abs.Phone;
import product.VivoPhone;

/**
 * 简单工厂模式的手机工厂类，一个工厂负责生产多种产品。
 * 生产产品的行为封装在一个方法中，根据参数的类型进行实例化，不存在抽象接口
 */
public class PhoneFactory {

    public Phone makePhone(String phoneType) {
        if (phoneType == null) {
            return null;
        }
        if ("oppo".equals(phoneType)) {
            return new OppoPhone();
        } else if ("vivo".equals(phoneType)) {
            return new VivoPhone();
        }
        return null;
    }
}
