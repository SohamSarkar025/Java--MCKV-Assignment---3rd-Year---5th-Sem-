package Pacakage1;

public class addString implements addmul {
    String a,b,sum;
    public addString(String a,String b){
        this.a=a;
        this.b=b;
    }
    @Override
    public void add(){
        sum=a+b;
    }
    @Override
    public void show(){
        System.out.println("The sum of two String is: "+sum);
    }
}
