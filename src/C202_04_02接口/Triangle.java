package C202_04_02接口;

import E202_02_04_三角形.Point;

public class Triangle implements Computable {
    private Point p1;
    private Point p2;
    private Point p3;

    public Triangle(Point p1, Point p2, Point p3) {
        this.p1 = p1;
        this.p2 = p2;
        this.p3 = p3;
    }

    @Override
    public double length() {
        double a = p1.distance(p2);
        double b = p1.distance(p3);
        double c = p3.distance(p2);
        return a+b+c;
    }

    @Override
    public double area() {
        double a = p1.distance(p2);
        double b = p1.distance(p3);
        double c = p3.distance(p2);
        double s = (a+b+c)/2;

        return Math.sqrt(s*(s-a)*(s-b)*(s-c));
    }
}
