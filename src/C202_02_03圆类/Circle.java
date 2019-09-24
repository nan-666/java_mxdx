package C202_02_03圆类;

public class Circle {
    private Point p;//圆心
    private double r;//半径

    public Circle(Point p,double r){
        this.p = p;
        this.r = r;
    }

    public Circle(double x,double y,double r){
        Point p1 = new Point(x,y);
        p = p1;
        this.r = r;
    }
    /**
     * 计算圆的周长
     * @return len 周长
     */
    public double length(){
        double len = 2*Math.PI*this.r;
        return len;
    }

    /**
     * 计算圆的面积
     * @return area1 面积
     */
    public double area(){
        double area1 = Math.PI*this.r*this.r;
        return area1;
    }

    /**
     * 计算两个圆的位置关系
     * @param c2 第二个圆
     * @return 位置关系（1外离 2外切 3相交 4内切 5内含）
     */
    public int restion(Circle c2){
        double d = this.p.distance(c2.p);
        double sum = this.r+ c2.r;
        if (Double.compare(d,sum)==0){
            return 2;
        }
        if (d>sum){
            return 1;
        }
        double sub = Math.abs(this.r-c2.r);
        if (Double.compare(d,sub)==0){
            return 4;
        }
        if (d>sub){
            return 3;
        }
        return 5;

    }


}
