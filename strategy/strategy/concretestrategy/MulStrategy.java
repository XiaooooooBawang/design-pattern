package strategy.concretestrategy;

import strategy.Strategy;

/**
 * 具体策略类（Concrete Strategy）:相乘策略，实现了抽象策略定义的接口，提供该策略的具体算法实现
 */
public class MulStrategy implements Strategy {
    @Override
    public int doOperation(int num1, int num2) {
        return num1 * num2;
    }
}
