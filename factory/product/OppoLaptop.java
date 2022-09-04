package product;

import product.abs.Laptop;

public class OppoLaptop implements Laptop {
    @Override
    public void boot() {
        System.out.println("oppo laptop");
    }
}
