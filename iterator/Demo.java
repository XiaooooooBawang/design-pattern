import aggregate.concreteAggregate.Classroom;
import iterator.Iterator;
import object.Student;


/**
 * 迭代器模式最大的作用是将遍历和具体实现分开，以这段代码为例，遍历时我们始终只用到了iterator对象，而没有用到classroom，
 * 这就意味着对于其他类型的具体集合，我们可以完全复用这段代码实现遍历。
 * 另一方面，如果我们发现在classroom里使用数组存储student，后续无法扩容，想改为List集合，这个时候我们只需要修改Classroom这个具体实现即可，
 * 而不用对使用中的代码做任何修改，就比如这里的遍历代码不需要任何变动。如果用的是for循环或者while循环，就意味着所有用到循环的地方都需要修改代码。
 *
 */
public class Demo {
    public static void main(String[] args) {
        Classroom classroom = new Classroom(3);
        classroom.addStudent(new Student("张三"));
        classroom.addStudent(new Student("李四"));
        //获取 classroom 集合的迭代器
        Iterator iterator = classroom.iterator();
        //用迭代器直接遍历集合元素
        while (iterator.hasNext()) {
            Student student = (Student) iterator.next();
            System.out.println(student.getName());
        }
    }
}