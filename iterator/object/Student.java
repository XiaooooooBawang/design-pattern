package object;


/**
 * 学生类，具体容器中的具体对象
 */
public class Student {
    private String name;

    public Student(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
