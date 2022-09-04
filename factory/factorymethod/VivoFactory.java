package factorymethod;

import product.VivoPhone;
import product.abs.Phone;

public class VivoFactory implements AbsFactory {
    @Override
    public Phone makePhone() {
        return new VivoPhone();
    }
}
