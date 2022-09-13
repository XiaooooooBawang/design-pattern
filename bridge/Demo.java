import abstraction.refinedabstraction.Circle;
import abstraction.Shape;
import implementation.concreteimplementation.GreenCircle;
import implementation.concreteimplementation.RedCircle;

/**
 * 桥接模式是一种结构型设计模式，可将一个大类或一系列紧密相关的类拆分为抽象和实现两个独立的层次结构，从而能在开发时分别使用。
 *
 * 一句话秒懂：将m*n个实现类转换为m+n个实现类。
 *
 * 类比场景：
 * - 抽象部分： 程序的 GUI 层。
 * - 实现部分： 操作系统的 API。
 * 无需改动与 API 相关的类就可以修改 GUI 类。
 *
 * @author 小霸王
 */
public class Demo {
    public static void main(String[] args) {
        Shape redCircle = new Circle(new RedCircle(), 10, 10, 20);
        Shape greenCircle = new Circle(new GreenCircle(), 5, 5, 20);

        redCircle.draw();
        greenCircle.draw();
    }
}
