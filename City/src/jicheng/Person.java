package jicheng;

public class Person {
    private String name;
    private int age;

    public Person(String s, int age) {
        this.name = s;
        this.age = age;
    }

    public void print_Information() {
        System.out.println("name: " + this.name);
        System.out.println("age: " + this.age);
    }

    public String getName() {
        return this.name;
    }
}
