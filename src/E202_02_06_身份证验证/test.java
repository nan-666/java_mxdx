package E202_02_06_身份证验证;

import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        System.out.printf("请输入身份证号：\n");
        Scanner scan = new Scanner(System.in);
        String id = scan.nextLine();

        IDVar id1 = new IDVar(id);
        if(!id1.var()){
            System.out.printf("身份证非法");
        }else{
            id1.show();
        }
    }
}
