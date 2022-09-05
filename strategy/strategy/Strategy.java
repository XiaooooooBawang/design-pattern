package strategy;

/**
 * 抽象策略接口（Strategy）,声明了某个算法各个不同策略间所共有的操作。上下文会使用该接口来调用有具体策略定义的算法。
 */
public interface Strategy {
    int doOperation(int num1, int num2);
}
