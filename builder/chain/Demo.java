package chain;

/**
 * 这是建造者模式的变体写法，与传统的写法相比没有了指导者类，客户端可自行决定建造顺序，并支持链式调用
 */
public class Demo {
    public static void main(String[] args) {
        Car car = new Car.Builder()
                .setBrand("宝马")
                .setWheel("车轮")
                .setEngine("引擎")
                .setShell("车壳")
                .setSteeringWheel("方向盘")
                .build();
        System.out.println(car);
    }

}
