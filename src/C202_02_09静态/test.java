package C202_02_09静态;

public class test {
    public static void main(String[] args) {
        Student stu1 = new Student("张三");
        Student stu2 = new Student("李四");
        System.out.println(stu1);
        System.out.println(stu2);
        Student.setClassname("A1912");
        Student stu3 = new Student("王二");
        Student stu4 = new Student("麻子");
        System.out.println(stu3);
        System.out.println(stu4);
    }
}
