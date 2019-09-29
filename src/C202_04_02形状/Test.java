package C202_04_02形状;

import E202_02_04_三角形.Point;

public class Test {
    public static void main(String[] args) {
        Point p1 = new Point(0,0);
        Point p2 = new Point(3,0);
        Point p3 = new Point(0,4);

        Triangle t1 = new Triangle(p1,p2,p3);
        Circular c1 = new Circular(p1,5);
        calc(t1);
        calc(c1);

    }

    private static void calc(Shape s) {
        System.out.printf("面积为%f\n",s.area());
        System.out.printf("周长为%f\n",s.length());
    }
}
