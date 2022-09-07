/**
 * 具体类 （ConcreteClass） 可以重写所有步骤，自定义每个方法步骤的具体实现， 但不能重写模板方法自身
 */
public class Csgo extends Game{
    @Override
    void initialize() {
        System.out.println("CSGO Game Initialized! Start playing.");
    }

    @Override
    void startPlay() {
        System.out.println("CSGO Game Started. Enjoy the game!");
    }

    @Override
    void endPlay() {
        System.out.println("CSGO Game Finished!");
    }
}
