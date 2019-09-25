package E202_02_06_身份证验证;

public class IDVar {
    private String id;
    public static final String TESTSUM = "10X98765432";
    private char sex;
    private String birthday;

    public IDVar( String id){
        this.id = id;
        this.sex = (id.charAt(16)%2==1)?'男':'女';
        this.birthday = id.substring(6,14);
    }
    public boolean var(){
        int sum = (id.charAt(0)-48)*7+(id.charAt(1)-48)*9+(id.charAt(2)-48)*10+(id.charAt(3)-48)*5+(id.charAt(4)-48)*8+(id.charAt(5)-48)*4+(id.charAt(6)-48)*2+(id.charAt(7)-48)*1+(id.charAt(8)-48)*6+(id.charAt(9)-48)*3+(id.charAt(10)-48)*7+(id.charAt(11)-48)*9+(id.charAt(12)-48)*10+(id.charAt(13)-48)*5+(id.charAt(14)-48)*8+(id.charAt(15)-48)*4+(id.charAt(16)-48)*2;
        int num = sum%11;
        if(id.charAt(17)==TESTSUM.charAt(num)){
            return true;
        }
        return false;
     }
     public void show(){
         System.out.printf("性别：%s\t生日：%s",sex,birthday);
     }

}
