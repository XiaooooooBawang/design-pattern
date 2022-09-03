package inner;

/**
 * 静态内部类实现单例模式
 * 线程安全
 * 懒加载（延迟加载）
 * 性能高
 * 推荐用！！！
 */
public class SingletonInner {
    //将构造方法私有化，外部不能实例化
    private SingletonInner(){}

    /*
    静态内部类。
    与饿汉模式一样，也是利用了类加载机制，因此不存在线程安全问题.
    只要应用中不使用内部类，JVM就不会去加载这个单例类，也就不会创建单例对象，从而实现懒汉式的延迟加载。
    也就是说这种方式可以同时保证延迟加载和线程安全。
     */
    private static class SingletonInnerHolder {
        private static SingletonInner instance = new SingletonInner();
    }
    //getter方法获取唯一实例
    public static SingletonInner getInstance() {
        return SingletonInnerHolder.instance;
    }
}
