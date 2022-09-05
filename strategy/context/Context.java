package context;

import strategy.Strategy;

/**
 * 上下文类（context），持有一个策略类的引用，最终给客户端调用
 */
public class Context {

    private Strategy strategy;

    public Context(Strategy strategy) {
        this.strategy = strategy;
    }

    //让不同策略的对象实现不同版本的算法
    public int executeStrategy(int num1, int num2) {
        return strategy.doOperation(num1, num2);
    }
}
