package Pacakage1;

public class addDouble implements addmul {
    double a,b,sum;
    public addDouble(double a,double b){
        this.a=a;
        this.b=b;
    }
    @Override
    public void add(){
        sum=a+b;
    }
    @Override
    public void show(){
        System.out.println("The sum of two Double is: "+sum);
    }
}
