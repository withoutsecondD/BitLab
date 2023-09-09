package OtherPractice.Wildcards.Case1;

class Worker {
    private int age;
    private int height;
    private String speciality;

    @Override
    public String toString() {
        return "Worker{" +
                "age=" + age +
                ", height=" + height +
                ", speciality='" + speciality + '\'' +
                '}';
    }

    public Worker(int age, int height, String speciality) {
        this.age = age;
        this.height = height;
        this.speciality = speciality;
    }

    public Worker() {
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

    public String getSpeciality() {
        return speciality;
    }

    public void setSpeciality(String speciality) {
        this.speciality = speciality;
    }
}
