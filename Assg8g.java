// Write a Java program in which interface is given by name MeanInterface. Method mean() is defined in this
// interface that calculates the mean of the given numbers arranged in an array. This interface is then extended and
// the method is defined in this interface that calculates the deviation from the mean value evaluated for each of the
// numbers.


interface meanInterface{
    double mean(int[] number);
}

interface Deviation extends meanInterface{

    void deviation(int[] number);
}

class Statistic implements Deviation{
    @Override
    public double mean(int[] number){
        if(number==null || number.length==0){
            throw new IllegalArgumentException("Array cannot be null or empty");
        }
        double sum=0;
        for(int num:number){
            sum += num;
        }
        return sum / number.length;
    }
    @Override
    public double[] deviation(int[] number){
        double meanValue = mean(number);
        double[] deviations = new double[number.length];
        for(int i=0;i<number.length;i++){
            deviations[i] = number[i]- meanValue;
        }
        return deviations;
    }
}






public class Assg8g {
    public static void main(String[] args) {
        Statistic ob = new Statistic();

        int[] number = {10,20,30,40,50};
        System.out.println("Mean:"+ob.mean(number));


        double[] deviations =ob.deviation(number);
        for(int i=0;i<number.length;i++){
            System.out.println()
        }
    }
}
