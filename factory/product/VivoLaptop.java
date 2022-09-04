package product;

import product.abs.Laptop;

public class VivoLaptop implements Laptop {
    @Override
    public void boot() {
        System.out.println("vivo laptop");
    }
}
