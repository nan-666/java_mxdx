package C202_02_11内部类;

public class computer_Inner {
    private Memory m = new Memory();//内存条
    private CPU cpu = new CPU();//CPU

    public void start(){
        cpu.start();
    }
    public class CPU {
        public void start() {
            m.read();
        }
    }
    public class Memory {
        public void read(){
            System.out.printf("读取数据");
        }
    }

}

