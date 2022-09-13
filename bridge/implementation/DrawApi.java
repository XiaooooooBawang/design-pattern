package implementation;

/**
 * 实现部分（Implementation）为所有具体实现声明通用接口。抽象部分仅能通过在这里声明的方法与实现对象交互。
 *
 * @author 小霸王
 */
public interface DrawApi {
    /**
     * 画具体尺寸大小的圆
     *
     * @param radius 半径
     * @param x 横坐标
     * @param y 纵坐标
     */
    void drawCircle(int radius, int x, int y);
}
