package jicheng;

public class Liana extends Person {
    public Liana(String s, int age) {
        super(s, age);
    }

    @Override
    public void print_Information() {
        System.out.println("Hello World");
    }

    @Override
    public boolean equals(Object obj) {
        Liana liana = (Liana)obj;
        return this.getName().equals(((Liana) obj).getName());
    }
}
