import facade.ShapeMaker;

/**
 * 外观模式是一种结构型设计模式， 能为程序库、 框架或其他复杂类提供一个简单的接口。
 *
 * @author 小霸王
 */
public class Demo {
    public static void main(String[] args) {
        ShapeMaker shapeMaker = new ShapeMaker();

        shapeMaker.drawCircleAndRectangle();
        shapeMaker.drawCircleAndSquare();
        shapeMaker.drawRectangleAndSquare();
    }
}
