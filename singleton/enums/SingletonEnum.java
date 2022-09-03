package enums;

/**
 * 很简洁的一种实现方式，提供了序列化机制，保证线程安全，绝对防止多次实例化，即使是在面对复杂的序列化或者反射攻击的时候。
 * 线程安全
 * 推荐用！！！
 */
public enum SingletonEnum {
    INSTANCE;
    public void whateverMethod() {

    }
}
