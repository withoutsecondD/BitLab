package OtherPractice.Wildcards.Case1;

import java.util.ArrayList;
import java.util.Collection;

public class Wildcards {
    static <T> void printCollection(Collection<T> c) {
        for (Object e : c)
            System.out.println(e);
    }

    static <T> Collection<T> copyCollection(Collection<T> c) {
        Collection<T> newCollection = new ArrayList<>();
        newCollection.addAll(c);
        return newCollection;
    }

    public static void main(String[] args) {
        Student student1 = new Student(90, 177, true);
        Student student2 = new Student(17, 185, true);
        Student student3 = new Student(17, 180, false);

        ArrayList<Student> studentList = new ArrayList<>();
        studentList.add(student1);
        studentList.add(student2);
        studentList.add(student3);
        ArrayList<Student> copiedStudentList = (ArrayList<Student>) copyCollection(studentList);

        printCollection(copiedStudentList);
        System.out.println();

        Worker worker1 = new Worker(35, 180, "P");
        Worker worker2 = new Worker(40, 183, "A");
        Worker worker3 = new Worker(36, 179, "A");

        ArrayList<Worker> workerList = new ArrayList<>();
        workerList.add(worker1);
        workerList.add(worker2);
        workerList.add(worker3);

        printCollection(workerList);
        System.out.println();

        NISStudent nis1 = new NISStudent(17, 180, true, 1);
        NISStudent nis2 = new NISStudent(20, 177, true, 2);
        NISStudent nis3 = new NISStudent(19, 182, true, 3);

        ArrayList<NISStudent> NISList = new ArrayList<>();
        NISList.add(nis1);
        NISList.add(nis2);
        NISList.add(nis3);

        printCollection(NISList);
    }
}

