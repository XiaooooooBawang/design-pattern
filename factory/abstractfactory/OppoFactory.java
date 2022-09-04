package abstractfactory;

import product.OppoLaptop;
import product.OppoPhone;
import product.abs.Laptop;
import product.abs.Phone;

public class OppoFactory implements AbstractFactory {
    @Override
    public Phone makePhone() {
        return new OppoPhone();
    }

    @Override
    public Laptop makeLaptop() {
        return new OppoLaptop();
    }
}
