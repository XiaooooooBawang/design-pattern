package facade;

import complexsubsystem.Circle;
import complexsubsystem.Rectangle;
import complexsubsystem.Square;

/**
 * 外观（Facade）类，提供了一种访问特定子系统功能的便捷方式，其了解如何重定向客户端请求，知晓如何操作一切活动部件。
 *
 * @author 小霸王
 */
public class ShapeMaker {
    private Rectangle rectangle;
    private Circle circle;
    private Square square;

    public ShapeMaker() {
        this.rectangle = new Rectangle();
        this.circle = new Circle();
        this.square = new Square();
    }

    public void drawCircleAndSquare() {
        circle.draw();
        square.draw();
    }

    public void drawCircleAndRectangle() {
        circle.draw();
        rectangle.draw();
    }
    public void drawRectangleAndSquare() {
        rectangle.draw();
        square.draw();
    }
}
