package C202_02_10单例模式;

public class test {
    public static void main(String[] args) {
//        Chairman jiang = new Chairman("江泽民","1990-2000");
//        Chairman hu = new Chairman("胡景涛","2000-2010");
        Chairman xi = Chairman.getInstance("习近平","2010-?");
//        System.out.println(jiang);
//        System.out.println(hu);
        System.out.println(xi);
    }
}
