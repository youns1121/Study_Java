package java8.designpattern.factorymethod;

public class Main {
    public static void main(String[] args) {
        Factory factory = new IDCardFactory();
        Product card1 = factory.create("이한솔");
        Product card2 = factory.create("손미정");
        card1.use();
        card2.use();


    }
}
