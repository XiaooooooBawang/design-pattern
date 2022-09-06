package tradition.builder;

import tradition.product.Car;

/**
 * 建造者类，接口声明了建造产品的各个步骤
 */
public interface CarBuilder {
    //牌子
    void buildBrand();
    //造车轮的方法，因为实际上车轮可能是一个复杂对象
    void buildWheel();
    //造外壳的方法
    void buildShell();
    //造引擎的方法
    void buildEngine();
    //造方向盘的方法
    void buildSteeringWheel();

    // 得到造好的车
    Car getCar();

}
