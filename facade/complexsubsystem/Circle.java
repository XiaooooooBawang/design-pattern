package complexsubsystem;

/**
 * 圆形实现类，复杂子系统中的其中一个类
 *
 * @author 小霸王
 */
public class Circle implements Shape{
    @Override
    public void draw() {
        System.out.println("Circle::draw()");
    }
}
