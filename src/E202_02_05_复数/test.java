package E202_02_05_复数;

public class test {
    public static void main(String[] args) {
        Complex c1 = new Complex(3,2);
        Complex c2 = new Complex(6,5);

        System.out.println(c1.add(c2));
        System.out.println(c2.sub(c1));
    }
}
