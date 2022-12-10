package task2;

public class Worker implements TitleOfThePosition {
    private String name;
    private int age;

    public Worker(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String print() {

        return "worker";
    }

    @Override
    public String toString() {
        return "Name: " + name +
                "; Age: " + age + "; Position: " + print() + ";";
    }

}
