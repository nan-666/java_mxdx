package 第二章.类与对象.C202_02_01_Point;

public class test {
    public static void main(String[] args) {
        Point p1 = new Point(0,0);
        Point p2 = new Point(2,2);

        System.out.println(p1.hashCode());
        System.out.println(p2.hashCode());
        double d = p1.distance(p2);
        System.out.println(d);

    }
}
