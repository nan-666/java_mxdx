package E202_02_01计算教师工资;

public class test {
    public static void main(String[] args) {
        Wages lisi = new Wages("lisi",6,2);
        System.out.println(lisi.getName()+"工资是"+lisi.calWages()+"元");
    }
}
