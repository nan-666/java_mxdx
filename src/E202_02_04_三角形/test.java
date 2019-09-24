package E202_02_04_三角形;

public class test {
    public static void main(String[] args) {
        Point p1 = new Point(0,0);
        Point p2 = new Point(0,3);
        Point p3 = new Point(4,0);
        Point p4 = new Point(0,0);
        Point p5 = new Point(6,0);
        Point p6 = new Point(0,8);

        Triangle t1 = new Triangle(p1,p2,p3);
        Triangle t2 = new Triangle(p4,p5,p6);

        System.out.printf("t1三角形周长为%f\n",t1.perimeter());
        System.out.printf("t1三角形面积为%f\n",t1.area());
        System.out.printf("t1三角形类型为%d\n",t1.type());
        System.out.println("ti和t2"+(t1.similar(t2)?"相似":"不相似"));
    }
}
