public class maxmin2d {
        public static void main(String[] args) {
            int[][] array = {
                {3, 5, 1},
                {8, 2, 7},
                {4, 6}
            };
    
            int max = Integer.MIN_VALUE;
            int min = Integer.MAX_VALUE;
    
            for (int i = 0; i < array.length; i++) {
                for (int j = 0; j < array[i].length; j++) {
                    if (array[i][j] > max) {
                        max = array[i][j];
                    }
                    if (array[i][j] < min) {
                        min = array[i][j];
                    }
                }
            }
    
            System.out.println("Maximum value: " + max);
            System.out.println("Minimum value: " + min);
        }
    }

