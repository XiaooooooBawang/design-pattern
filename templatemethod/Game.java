/**
 *  抽象类（AbstractClass），声明作为算法步骤的方法， 以及依次调用它们的实际模板方法。
 *  算法步骤可以被声明为抽象类型， 也可以提供一些默认实现。
 */
public abstract class Game {
    abstract void initialize();
    abstract void startPlay();
    abstract void endPlay();

    /**
     * 模板方法 template method ，规定整个算法需要各个方法实现的具体顺序，
     * 注意，为防止恶意操作，一般模板方法都加上 final 关键词，禁止其子类重新该方法
     */
    public final void play() {
        initialize();
        startPlay();
        endPlay();
    }
}
