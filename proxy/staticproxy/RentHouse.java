package staticproxy;

/**
 * 真正的租房类
 */
public class RentHouse implements IRentHouse{

    @Override
    public void payRent() {
        System.out.println("交房租，租了间房");
    }
}
