package C202_02_09静态;

public class Student {
    private static String classname;
    private static int start;
    private String id;//学号
    private String name;//姓名

    /*静态代码块*/
    static{
        classname = "A1911";
        start = 1;
    }
    //静态方法里没有this，因为静态意味着它属于类而不是对象
    //this
    //静态方法不能访问非静态成员
    //id，name
    public static void setClassname(String name){
        classname = name;
        start = 1;
    }



    public Student(String name) {
        this.id = String.format("%s%02d",classname,start);
        this.name = name;
        start++;
    }

    @Override
    public String toString() {
        return String.format("学号:%s\t姓名:%s\t",id,name);
    }
}
