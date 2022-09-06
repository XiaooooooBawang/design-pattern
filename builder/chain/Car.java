package chain;

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

    private Car (Builder builder) {
        brand = builder.brand;
        wheel = builder.wheel;
        shell = builder.shell;
        engine = builder.engine;
        steeringWheel = builder.steeringWheel;
    }

    public static class Builder {
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

        public Builder setBrand(String brand) {
            this.brand = brand;
            return this;
        }

        public Builder setWheel(String wheel) {
            this.wheel = wheel;
            return this;
        }

        public Builder setShell(String shell) {
            this.shell = shell;
            return this;
        }

        public Builder setEngine(String engine) {
            this.engine = engine;
            return this;
        }

        public Builder setSteeringWheel(String steeringWheel) {
            this.steeringWheel = steeringWheel;
            return this;
        }

        public Car build() {
            return new Car(this);
        }
    }
}
