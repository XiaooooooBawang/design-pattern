package eHan;

/**
 * 静态内部类实现单例模式
 * 线程安全
 * 饥饿加载，耗内存
 * 性能好
 * 不推荐用！
 */
public class SingletonEHan {
    //将构造方法私有化，外部不能实例化
    private SingletonEHan(){}

    //创建静态实例，当类被加载的时候就创建了实例，不会出现线程安全问题，但占内存
    private static SingletonEHan instance = new SingletonEHan();

    //getter方法获取唯一实例
    public static SingletonEHan getInstance() {
        return instance;
    }

}
