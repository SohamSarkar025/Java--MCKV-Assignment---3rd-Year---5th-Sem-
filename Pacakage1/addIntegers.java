package Pacakage1;

public class addIntegers implements addmul {
    int a,b,sum;
    public addIntegers(int a,int b){
        this.a=a;
        this.b=b;
    }
    @Override
    public void add(){
        sum=a+b;
    }
    @Override
    public void show(){
        System.out.println("The sum of two integer is: "+sum);
    }
}
