package C202_05_01泛型;

public class Main {
    public static void main(String[] args) {
        Queue <Integer> d1 = new Queue<Integer>(5);

        System.out.println("入队演示");
        for (int d = 10; d < 20; d++) {
            if(!d1.push(d)){
                break;
            }
            System.out.println(d1);
        }

        System.out.println("出队演示");
        for (int i = 0; i < 100; i++) {
            Integer d = d1.pop();
            if (d == null){
                break;
            }
            System.out.printf("%d出队后的队列为%s\n",d,d1);
        }

        Queue <Double> d2 = new Queue<>(5);
        System.out.println("入队演示");
        for (double d = 1.1; d < 2; d += 0.1) {
            if(!d2.push(d)){
                break;
            }
            System.out.println(d2);
        }

        System.out.println("出队演示");
        for (int i = 0; i < 100; i++) {
            Double d = d2.pop();
            if (d == null){
                break;
            }
            System.out.printf("%d出队后的队列为%s\n",d,d2);
        }
    }
}
