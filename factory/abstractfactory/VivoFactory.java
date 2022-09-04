package abstractfactory;

import product.VivoLaptop;
import product.VivoPhone;
import product.abs.Laptop;
import product.abs.Phone;

public class VivoFactory implements AbstractFactory {
    @Override
    public Phone makePhone() {
        return new VivoPhone();
    }

    @Override
    public Laptop makeLaptop() {
        return new VivoLaptop();
    }
}
