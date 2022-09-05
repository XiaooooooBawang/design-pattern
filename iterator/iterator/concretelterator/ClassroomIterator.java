package iterator.concretelterator;

import aggregate.concreteAggregate.Classroom;
import iterator.Iterator;
import object.Student;

/**
 * 具体迭代器（ConcreteIterator）,用于实现迭代器接口，迭代器的核心遍历逻辑在这里实现
 */
public class ClassroomIterator implements Iterator {

    private Classroom classroom;
    private int index = 0;

    public ClassroomIterator(Classroom classroom) {
        this.classroom = classroom;
    }

    @Override
    public Object next() {
        Student student = classroom.getStudent(index);
        index++;
        return student;
    }

    @Override
    public boolean hasNext() {
        return index < classroom.getLength();
    }
}
