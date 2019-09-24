package E202_02_04_三角形;

public class Triangle {
    private Point p1;//点1
    private Point p2;//点2
    private Point p3;//点3
    private double b1;//边1
    private double b2;//边2
    private double b3;//边3

    /**
     * 构造三角形，给定三个点并计算三边的长
     * @param p1 点1
     * @param p2 点2
     * @param p3 点3
     */
    public Triangle(Point p1,Point p2,Point p3){
        this.p1 = p1;
        this.p2 = p2;
        this.p3 = p3;
        this.b1 = p1.distance(p2);
        this.b2 = p1.distance(p3);
        this.b3 = p2.distance(p3);
    }

    /**
     * 三角形周长函数
     * @return 周长
     */
    public double perimeter(){
        return b1+b2+b3;
    }

    /**
     * 三角形面积函数
     * @return 面积
     */
    public double area(){
        double p = perimeter()/2;//半周长
        return Math.sqrt(p*(p-b1)*(p-b2)*(p-b3));
    }

    /**
     * 三角形类型函数
     * @return 类型 1.锐角 2.直角 3.钝角
     */
    public int type(){
        double cos1 = (b2*b2+b3*b3-b1*b1)/(2*b2*b3);
        double cos2 = (b1*b1+b3*b3-b2*b2)/(2*b1*b3);
        double cos3 = (b2*b2+b1*b1-b3*b3)/(2*b2*b1);

        double maxCos = Math.min(cos1,Math.min(cos2,cos3));//比较出最大的角对应的cos值

        if(Double.compare(maxCos,0)==0){
            return 2;
        }
        if(maxCos>1){
            return 1;
        }
        return 2;
    }

    /**
     * 计算最大边
     * @return 最大边的值
     */
    public double bmax(){
        return Math.max(b1,Math.max(b2,b3));
    }

    /**
     * 最小边
     * @return
     */
    public double bmin(){
        return Math.min(b1,Math.min(b2,b3));
    }

    /**
     * 边的中间值
     * @return
     */
    public double bmid(){
        return (b1+b2+b3)-bmax()-bmin();
    }

    /**
     * 判断两个三角形是否相似
     * @param t2 第二个三角形
     * @return 真为相似，假为相似
     */
    public boolean similar(Triangle t2){
        if(this.bmax()/t2.bmax()==this.bmin()/t2.bmin()){
            return true;
        }
        return false;
    }




}
