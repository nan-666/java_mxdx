package C202_02_11内部类;

public class computer {
    private Memory m = new Memory();//内存条
    private CPU cpu = new CPU();//CPU

    public void start(){
        cpu.start();
    }
}
