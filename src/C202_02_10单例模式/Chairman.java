package C202_02_10单例模式;

public class Chairman {
    public static Chairman man;
    private String name;//姓名
    private String period;//任期

    private Chairman(String name, String period) {
        this.name = name;
        this.period = period;
    }
    public static Chairman getInstance(String name,String period){
        man = new Chairman(name,period);
        return man;

    }


    @Override
    public String toString() {
        return String.format("姓名：%s\t任期：%s\t",name,period);
    }
}
