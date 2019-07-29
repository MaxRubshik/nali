package nali.Static;

public class StaticTest {
    public static void main(String[] args) {
        Human.description = "Nice";
        Human h1 = new Human("Bob", 44);
        Human h2 = new Human("Bill", 33);
        h1.getAllVars();
        h2.getAllVars();
        h1.setName("Tommy");
        Human.description = "Bad";
        //Human.getDescription();
        h1.getAllVars();
        h2.getAllVars();



    }
}

class Human {
    private String name;
    private int age;

    public static String description;

    public Human(String name, int age) {
        System.out.println("Hi from 1st constructor.");
        this.name = name;
        this.age = age;
    }

    public Human(String name) {
        System.out.println("Its 2nd constructor");
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public static void getDescription(){
        System.out.println(description);
    }
    public void getAllVars() {
        System.out.println(name+" "+age+" "+description);
    }

}
