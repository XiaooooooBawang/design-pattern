package dcl;

/**
 * 双检锁（DCL, Double-checked locking）实现单例模式
 * 线程安全
 * 懒加载（延迟加载）
 * 性能好
 * 推荐用！！！
 */
public class SingletonDcl {
    //将构造方法私有化，外部不能实例化
    private SingletonDcl(){}

    /*
    双检锁仍存在隐患，是因为JVM的指令重排优化机制（在不改变原语义、不影响最终结果的情况下（但这只对单线程设计，多线程不能保证），通过调整指令的执行顺序让程序运行的更快，），
    会存在对象还没被初始化就被另一个线程 getInstance 获取了（因为指令执行的顺序不确定），这个对象就不是正确的，双检锁失效。
    所以要为 instance 加上 volatile 禁止指令重排序优化，保证下一个读取操作会在前一个写操作之后发生。

    new一个对象时，正常的底层执行顺序是三步：
    (1) 给Singleton类的实例instance分配内存，获得了分配的内存地址
    (2) 调用实例instance的构造函数来初始化成员变量
    (3) 将instance指向分配的内存地址
    指令重排后可能会1,3,2的顺序

     */
    private static volatile SingletonDcl instance;

    //getter方法获取唯一实例

    //双检锁
    public static SingletonDcl getInstance() {
        if (instance == null) {  //这一层，实例创建后大多数的 getInstance 都能直接返回唯一实例，性能好
            synchronized (SingletonDcl.class) {
                if (instance == null) { //再此检查，防止多个线程能同时通过上一层if
                    instance =  new SingletonDcl();
                }
            }
        }
        return instance;
    }
}
