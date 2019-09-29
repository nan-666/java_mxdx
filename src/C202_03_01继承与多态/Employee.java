package C202_03_01继承与多态;

public class Employee {
    private String id;
    private String name;
    private String sex;
    private int salary;//工资

    public Employee(String id, String name, String sex, int salary) {
        this.id = id;
        this.name = name;
        this.sex = sex;
        this.salary = salary;
    }

    public void print(){
        System.out.println(id);
        System.out.println(name);
        System.out.println(sex);
        System.out.println(salary);
    }
}

