package nali.Queue;

public class Test {
    public static void main(String[] args) {
        Person p1 = new Person(1);

    }
}

class Person {
    private int id;

    public Person(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Person id = " + id;
    }
}