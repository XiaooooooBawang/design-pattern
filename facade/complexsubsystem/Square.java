package complexsubsystem;

/**
 * 方形实现类，复杂子系统中的其中一个类
 *
 * @author 小霸王
 */
public class Square implements Shape{
    @Override
    public void draw() {
        System.out.println("Square::draw()");
    }
}
