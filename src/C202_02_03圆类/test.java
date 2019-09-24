package C202_02_03圆类;

public class test {
    public static void main(String[] args) {
        Point point1 = new Point(0,0);
        Point point2 = new Point(0,0);
        System.out.println(point1==point2);
        Circle circle1 = new Circle(point1,5);
        Circle circle2 = new Circle(6,0,4);

//        circle1.init(point1,5);
//
//        circle2.init(6,0,4);
        System.out.printf("circle1的周长=%f\n",circle1.length());
        System.out.printf("circle1的面积=%f\n",circle1.area());
        System.out.printf("circle1的位置关系=%d\n",circle1.restion(circle2));
    }
}
