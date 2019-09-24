package E202_02_01计算教师工资;

public class Wages {
    private String name;//姓名
    private int ageWork;//工龄
    private int title;//职称 1.初级 2.中级 3.高级

    /**
     * 构造函数
     * @param name
     * @param ageWork
     * @param title
     */
    public Wages(String name,int ageWork,int title){
        this.name = name;
        this.ageWork = ageWork;
        this.title = title;
    }

    /**
     * 计算工资
     * @return 工资
     */
    public int calWages(){
        if(this.title==1){
            return 2000+this.ageWork*100;
        }
        if(this.title==2){
            return 3000+this.ageWork*100;
        }
        if(this.title==3){
            return 5000+this.ageWork*100;
        }
        return 0;
    }

    public String getName() {
        return name;
    }
}
