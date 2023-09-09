package OtherPractice.Wildcards.Case1;

import java.security.cert.CollectionCertStoreParameters;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

class Student {
    private int age;
    private int height;
    private boolean fromAlmaty;

    @Override
    public String toString() {
        return "Student{" +
                "age=" + age +
                ", height=" + height +
                ", fromAlmaty=" + fromAlmaty +
                '}';
    }

    public Student(int age, int height, boolean fromAlmaty) {
        this.age = age;
        this.height = height;
        this.fromAlmaty = fromAlmaty;
    }

    public Student() {
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public boolean isFromAlmaty() {
        return fromAlmaty;
    }

    public void setFromAlmaty(boolean fromAlmaty) {
        this.fromAlmaty = fromAlmaty;
    }
}