package iterator;

/**
 * 迭代器接口（Iterator）：定义访问和遍历集合元素的接口，一般包含next()和hasNext()方法。
 */
public interface Iterator {
    /**
     * 获取下一个元素
     *
     * @return
     */
    Object next();

    /**
     * 判断是否还有下一个元素
     *
     * @return
     */
    boolean hasNext();
}
