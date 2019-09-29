package C202_03_01继承与多态;

public class Person {
    private String id;//身份证号码
    private String name;//姓名
    private String sex;//性别

    public Person(String id, String name, String sex) {
        this.id = id;
        this.name = name;
        this.sex = sex;
    }

    public void print(){
        System.out.println(id);
        System.out.println(name);
        System.out.println(sex);
    }
}

