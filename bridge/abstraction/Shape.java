package abstraction;

import implementation.DrawApi;

/**
 * 抽象部分（Abstraction）提供高层控制逻辑，依赖于完成底层实际工作的实现对象。
 *
 * @author 小霸王
 */
public abstract class Shape {
    /**
     * drawApi 引用，抽象部分可以调用这个实例的方法来将所有工作委派给这个具体对象，达到抽象部分与实现部分交互的效果，
     * 这个过程就是桥接过程.
     */
    protected DrawApi drawApi;

    protected Shape(DrawApi drawApi) {
        this.drawApi = drawApi;
    }

    /**
     * 画图形的抽象方法
     */
    public abstract void draw();
}
