package jicheng;

public class Main {
    public static void main(String[] args) {
        Liana liana1 = new Liana("李华", 18);
        Liana liana2 = new Liana("李华", 18);

        System.out.println(liana1.equals(liana2));
    }
}
