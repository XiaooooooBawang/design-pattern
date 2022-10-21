package lanHan;

/**
 * 懒汉式线程安全写法实现单例模式
 * 线程安全
 * 懒加载（延迟加载）
 * 性能差
 * 不推荐用！！！
 */
public class SingletonLanHan {
    //将构造方法私有化，外部不能实例化
    private SingletonLanHan(){}

    //静态实例
    private static SingletonLanHan instance;

    //getter方法获取唯一实例

    /*
    线程是安全的，加了锁，但锁的粒度有点大，
    每个线程还没执行 getInstance（即还没加载 SingletonLanHanHolder 类）前都在阻塞等待锁的释放，
    如果多次调用 getInstance 获取实例，累积的性能损耗就比较大了，不推荐用！
    */
    public static synchronized SingletonLanHan getInstance() {
        if (instance == null) {
            instance =  new SingletonLanHan();
        }
        return instance;
    }
}
