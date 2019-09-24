package C202_02_08堆栈;

public class Stack {
    private int top;//栈顶指针
    private int capacity;//栈堆容量
    private int []data;//储存数据的类型

    public Stack(int capacity) {
        this.top = -1;
        this.capacity = capacity;
        this.data = new int[capacity];
    }

    /**
     *
     * @return
     */
    public boolean isEmpty(){
        return this.top==-1;
    }

    /**
     *
     * @return
     */
    public boolean isFull(){
        return this.top==this.capacity-1;
    }

    /**
     * 进栈函数
     * @param num 进栈的数据
     * @return  true 为成功 false 为失败
     */
    public boolean putStack(int num){
        if(isFull()){
            return false;
        }
        top++;
        data[top] = num;
        return true;
    }

    /**
     * 出栈函数
     * @return 0为失败，成功返回该出栈的数据
     */
    public Integer out(){
        if(isEmpty()){
            return null;
        }
        Integer d = data[top];
        top--;
        return d;
    }

    @Override
    public String toString() {
        String s = "[";
        for (int i = 0; i <= top; i++) {
            s += String.format("%4d",data[i]);
        }
        s += "]";
        return s;
    }
}
