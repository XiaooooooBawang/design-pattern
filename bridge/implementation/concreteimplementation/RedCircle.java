package implementation.concreteimplementation;

import implementation.DrawApi;

/**
 * 实现部分的接口的具体实现，红色的圆
 *
 * @author 小霸王
 */
public class RedCircle implements DrawApi {
    @Override
    public void drawCircle(int radius, int x, int y) {
        System.out.println("Circle[color: red, radius: " + radius + ", " + "x: " + x + ", " + "y: " + y + "]");
    }
}
