package E202_02_05_复数;

public class Complex {
    private double real;//实部
    private double empty;//虚部

    /**
     * 构造函数
     * @param x 实部参数
     * @param y 虚部参数
     */
    public Complex(double x,double y){
        real = x;
        empty = y;

    }

    /**
     * 复数加法
     * @param c2 第二个复数
     * @return 和
     */
    public Complex add(Complex c2){
        Complex c3 = new Complex(0,0);
        c3.empty = this.empty+c2.empty;
        c3.real = this.real+c2.real;
        return c3;
    }

    /**
     * 复数减法
     * @param c2 第二个复数
     * @return 差
     */
    public Complex sub(Complex c2){
        Complex c3 = new Complex(0,0);
        c3.empty = this.empty-c2.empty;
        c3.real = this.real-c2.real;
        return c3;
    }

    @Override
    public String toString() {
        return String.format("%2f+%2fi",this.real,this.empty);
    }
}
