package product;

import product.abs.Phone;

/**
 *  oppo 手机类，产品2
 */
public class OppoPhone implements Phone {

    @Override
    public void boot() {
        System.out.println("oppo phone");
    }
}
