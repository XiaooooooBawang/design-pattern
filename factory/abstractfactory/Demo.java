package abstractfactory;

import product.abs.Laptop;
import product.abs.Phone;

public class Demo {
    public static void main(String[] args) {
        AbstractFactory oppoFactory = new OppoFactory();
        AbstractFactory vivoFactory = new VivoFactory();
        Phone oppoPhone = oppoFactory.makePhone();
        Phone vivoPhone = vivoFactory.makePhone();
        Laptop oppoLaptop = oppoFactory.makeLaptop();
        Laptop vivoLaptop = vivoFactory.makeLaptop();
        oppoLaptop.boot();
        vivoLaptop.boot();
        oppoPhone.boot();
        vivoPhone.boot();
    }
}
