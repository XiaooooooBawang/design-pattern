package simplefactory;

import product.abs.Phone;

public class Demo {
    public static void main(String[] args) {
        PhoneFactory phoneFactory = new PhoneFactory();
        Phone vivo = phoneFactory.makePhone("vivo");
        Phone oppo = phoneFactory.makePhone("oppo");
        vivo.boot();
        oppo.boot();
    }
}
