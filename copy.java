// Interface for calculating mean
interface MeanInterface {
    double mean(int[] numbers); // Method to calculate mean
}

// Extended interface for calculating deviation
interface DeviationInterface extends MeanInterface {
    double[] deviation(int[] numbers); // Method to calculate deviation
}

// Class implementing the DeviationInterface
class Statistics implements DeviationInterface {
    
    // Implement the mean method
    @Override
    public double mean(int[] numbers) {
        if (numbers == null || numbers.length == 0) {
            throw new IllegalArgumentException("Array cannot be null or empty");
        }
        
        double sum = 0;
        for (int num : numbers) {
            sum += num;
        }
        return sum / numbers.length; // Calculate mean
    }

    // Implement the deviation method
    @Override
    public double[] deviation(int[] numbers) {
        double meanValue = mean(numbers); // Get mean value
        double[] deviations = new double[numbers.length];
        
        for (int i = 0; i < numbers.length; i++) {
            deviations[i] = numbers[i] - meanValue; // Calculate deviation
        }
        
        return deviations;
    }
}

// Main class to test the implementation
public class copy {
    public static void main(String[] args) {
        Statistics stats = new Statistics(); // Create an instance of Statistics
        
        int[] numbers = {10, 20, 30, 40, 50}; // Example array
        
        // Calculate mean
        double meanValue = stats.mean(numbers);
        System.out.println("Mean: " + meanValue);
        
        // Calculate deviations
        double[] deviations = stats.deviation(numbers);
        System.out.print("Deviations from Mean: ");
        for (double deviation : deviations) {
            System.out.print(deviation + " ");
        }
    }
}
