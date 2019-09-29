package C202_03_05多态;

public class Test {
    public static void main(String[] args) {


        Dog d = new Dog();
        Cat c = new Cat();

        hit(d);
        hit(c);
    }

    private static void hit(Animal a){
        a.shout();
    }
}
