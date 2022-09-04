package factorymethod;

import product.OppoPhone;
import product.abs.Phone;

public class OppoFactory implements AbsFactory {
    @Override
    public Phone makePhone() {
        return new OppoPhone();
    }
}
