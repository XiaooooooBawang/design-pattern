import context.Context;
import strategy.concretestrategy.AddStrategy;
import strategy.concretestrategy.DivStrategy;
import strategy.concretestrategy.MulStrategy;
import strategy.concretestrategy.SubStrategy;

/**
 * 策略模式的主要优点如下。
 * 1.多重条件语句不易维护，而使用策略模式可以避免使用多重条件语句，如 if...else 语句、switch...case 语句。
 * 2.策略模式提供了一系列的可供重用的算法族，恰当使用继承可以把算法族的公共代码转移到父类里面，从而避免重复的代码。
 * 3.策略模式可以提供相同行为的不同实现，客户可以根据不同时间或空间要求选择不同的。
 * 4.策略模式提供了对开闭原则的完美支持，可以在不修改原代码的情况下，灵活增加新算法。
 * 5.策略模式把算法的使用放到上下文类中，而算法的实现移到具体策略类中，实现了二者的分离。
 *
 * 其主要缺点如下。
 * 1.客户端必须理解所有策略算法的区别，以便适时选择恰当的算法类。
 * 2.策略模式造成很多的策略类，增加维护难度。
 */
public class Demo {
    public static void main(String[] args) {
        int num1 = 6;
        int num2 = 3;
        
        Context context = new Context(new AddStrategy());
        System.out.println(num1 + " + " + num2 + " = " + context.executeStrategy(num1, num2));

        context = new Context(new SubStrategy());
        System.out.println(num1 + " - " + num2 + " = " + context.executeStrategy(num1, num2));

        context = new Context(new MulStrategy());
        System.out.println(num1 + " * " + num2 + " = " + context.executeStrategy(num1, num2));

        context = new Context(new DivStrategy());
        System.out.println(num1 + " / " + num2 + " = " + context.executeStrategy(num1, num2));
    }
}
