package E202_03_01圆柱体;

import C202_02_03圆类.Circle;
import C202_02_03圆类.Point;

public class Cylinder extends Circle {
    private int h;

    public Cylinder(Point p, double r, int n) {
        super(p, r);
        this.h = n;
    }

    public Cylinder(double x, double y, double r, int n) {
        super(x, y, r);
        this.h = n;
    }

    /**
     * 计算表面积
     * @return
     */
    public double area(){
        return super.area()*2+super.length()*h;
    }
    public double volume(){
        return super.area()*h;
    }
}
