package factorymethod;

import product.abs.Phone;

public class Demo {
    public static void main(String[] args) {
        AbsFactory oppoFactory = new OppoFactory();
        AbsFactory vivoFactory = new VivoFactory();
        Phone oppo = oppoFactory.makePhone();
        Phone vivo = vivoFactory.makePhone();
        vivo.boot();
        oppo.boot();
    }
}
