package C202_04_02形状;

import E202_02_04_三角形.Point;

public  class Circular extends Shape{
    private Point p;
    private double r;

    public Circular(Point p, double r) {
        this.p = p;
        this.r = r;
    }



    @Override
    public double length() {
        return 2*Math.PI*r;
    }

    @Override
    public double area() {
        return Math.PI*r*r;
    }
}
