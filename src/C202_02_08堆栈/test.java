package C202_02_08堆栈;

public class test {
    public static void main(String[] args) {
        Stack s = new Stack(5);
        System.out.printf("进栈演示\n");
        for (int d = 10; d < 20; d++) {
            if(!s.putStack(d)){
                break;
            }
            System.out.println(s);
        }
        System.out.printf("出栈演示\n");
        for (int i = 0; i < 100; i++) {
            Integer d = s.out();
            if(d==null){
                break;
            }
            System.out.printf("%d出栈后的栈堆%s\n",d,s);
        }
    }
}
