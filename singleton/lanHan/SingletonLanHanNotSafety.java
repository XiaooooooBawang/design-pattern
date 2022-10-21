package lanHan;

/**
 * 懒汉式非线程安全写法实现单例模式，
 * 线程不安全，
 * 懒加载（延迟加载），
 * 不能用！！！
 */
public class SingletonLanHanNotSafety {
    //将构造方法私有化，外部不能实例化
    private SingletonLanHanNotSafety(){}

    //静态实例
    private static SingletonLanHanNotSafety instance;

    //getter方法获取唯一实例
    public static SingletonLanHanNotSafety getInstance() {
        if (instance == null) {  //写法1：这里很明显线程不安全，连锁都没有
            instance =  new SingletonLanHanNotSafety();
        }
//        if (instance == null) {  //写法2：同样线程不安全，虽然有锁，但加错地方了，锁的粒度太小了，只要能线程能进入if就能创建实例
//            synchronized (SingletonLanHanNotSafetyHolder.class) {
//                return new SingletonLanHanNotSafetyHolder();
//            }
//        }
        return instance;
    }
}
