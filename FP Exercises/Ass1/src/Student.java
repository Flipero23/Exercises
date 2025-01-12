public class Student {
    protected String name;
    protected int indexNo;
    protected int age;

    public Student(String name, int indexNo, int age) {
        this.name = name;
        this.indexNo = indexNo;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getIndexNo() {
        return indexNo;
    }

    public int getAge() {
        return age;
    }
}
