package 第二章.类与对象.C202_02_01_Point;

public class Point {
    private double x;
    private double y;

    /**
     * 初始化
     * @param x 横坐标初始值
     * @param y 纵坐标初始值
     */
    public  Point(double x,double y){
        this.x = x;
        this.y = y;
    }

    /**
     * 计算两点之间的距离
     * @param p
     * @return 距离值
     */
    public double distance(Point p){
        return Math.sqrt(Math.pow((this.x - p.x),2)+Math.pow((this.y - p.y),2));
    }
}
