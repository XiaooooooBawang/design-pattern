package abstraction.refinedabstraction;

import abstraction.Shape;
import implementation.DrawApi;

/**
 * 精确抽象（Refined Abstraction）提供控制逻辑的变体。与其父类一样，它们通过通用实现接口与不同的实现进行交互。
 *
 * @author 小霸王
 */
public class Circle extends Shape {
    private int x, y, radius;

    public Circle(DrawApi drawApi, int x, int y, int radius) {
        super(drawApi);
        this.x = x;
        this.y = y;
        this.radius = radius;
    }

    @Override
    public void draw() {
        drawApi.drawCircle(radius, x ,y);
    }
}
