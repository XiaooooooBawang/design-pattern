package complexsubsystem;

/**
 * 形状接口，复杂子系统中的一个接口。
 * 复杂子系统（Complex Subsystem）由数十个不同对象构成。
 * 如果要用这些对象完成有意义的工作，你必须深入了解子系统的实现细节，比如按照正确顺序初始化对象和为其提供正确格式的数据。
 *
 *
 * 子系统类不会意识到外观的存在，它们在系统内运作并且相互之间可直接进行交互。
 *
 * @author 小霸王
 */
public interface Shape {
    /**
     * 画图形
     */
    void draw();
}
