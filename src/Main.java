import exercises.Cat;

public class Main {
    public static void main(String[] args) {
        Cat myCat = new Cat();
        myCat.setName("Baby");
        myCat.setAge(20);

        System.out.println(myCat.getName());
        System.out.println(myCat.getAge());

    }
}