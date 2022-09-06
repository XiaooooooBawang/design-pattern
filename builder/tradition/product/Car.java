package tradition.product;

/**
 * 产品类，即车的实体类
 */
public class Car {
    //品牌
    private String brand;
    //车轮
    private String wheel;
    //外壳
    private String shell;
    //发动机
    private String engine;
    //方向盘
    private String steeringWheel;

    public String getWheel() {
        return wheel;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setWheel(String wheel) {
        this.wheel = wheel;
    }

    public String getShell() {
        return shell;
    }

    public void setShell(String shell) {
        this.shell = shell;
    }

    public String getEngine() {
        return engine;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }

    public String getSteeringWheel() {
        return steeringWheel;
    }

    public void setSteeringWheel(String steeringWheel) {
        this.steeringWheel = steeringWheel;
    }

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", wheel='" + wheel + '\'' +
                ", shell='" + shell + '\'' +
                ", engine='" + engine + '\'' +
                ", steeringWheel='" + steeringWheel + '\'' +
                '}';
    }
}
