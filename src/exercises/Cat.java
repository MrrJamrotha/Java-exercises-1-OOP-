package exercises;

public class Cat {
    private String name;
    private int age;

    public Cat(){
        this.age = 0;
        this.name = "Unknown";
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
