package aggregate;

import iterator.Iterator;

/**
 * 集合接口（Aggregate）,定义了创建迭代器的接口方法
 */
public interface Aggregate {
    /**
     * 创建迭代器
     *
     * @return
     */
    Iterator iterator();
}
