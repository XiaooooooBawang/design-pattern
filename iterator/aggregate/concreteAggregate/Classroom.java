package aggregate.concreteAggregate;

import aggregate.Aggregate;
import iterator.concretelterator.ClassroomIterator;
import iterator.Iterator;
import object.Student;


/**
 * 具体集合（ConcreteAggregate），用于实现集合接口，他会创建出具体的Iterator
 */
public class Classroom implements Aggregate {

    private Student[] students;
    private int length = 0;
    private int maxSize;

    public Classroom(int maxSize) {
        this.maxSize = maxSize;
        students = new Student[maxSize];
    }

    /**
     * 创建具体的迭代器，对于具体的 Classroom 集合就创建具体的 ClassroomIterator 迭代器
     *
     * @return
     */
    @Override
    public Iterator iterator() {
        return new ClassroomIterator(this);
    }

    public Student getStudent(int index) {
        return students[index];
    }

    public void addStudent(Student student) {
        if (length >= maxSize) {
            return;
        }
        students[length] = student;
        length++;
    }

    public int getLength() {
        return length;
    }
}
