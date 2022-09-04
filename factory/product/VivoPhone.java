package product;

import product.abs.Phone;

/**
 *  vivo 手机类，产品1
 */
public class VivoPhone implements Phone {

    @Override
    public void boot() {
        System.out.println("vivo phone");
    }
}
