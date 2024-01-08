
public class app {

	public static int calculateSum(int[] arr) {
        int sum = 0;

        
        for (int num : arr) {
            sum += num;
        }

        return sum;
    }
	
	public static double calculateAverage(double[] arr) {
        if (arr.length == 0) {
            return 0.0; 
        }

        double average= 0.0;

        
        for (double num : arr) {
            average+= num;
        }

        return average / arr.length;
    }
	
	public static int findMaximum(int[] arr) {
        if (arr.length == 0) {
            throw new IllegalArgumentException("Array is empty");
        }

        int maximum = arr[0];

        // Iterate through the array to find the maximum value
        for (int num : arr) {
            if (num > maximum) {
                maximum = num;
            }
        }

        return maximum;
    }

	public static int findMin(int[] arr) {
        if (arr.length == 0) {
            throw new IllegalArgumentException("Array is empty");
        }

        int minumam = arr[0];

        // Iterate through the array to find the maximum value
        for (int num : arr) {
            if (num < minumam) {
                minumam = num;
            }
        }

        return minumam;
    }
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 int[] numbers = {2, 4, 6, 8, 10};

	        
	        int sum = calculateSum(numbers);
	        double average = calculateAverage(numbers);
        int maximum = findMaximum(numbers);
	        System.out.println("The sum of the array elements is: " + sum);
	}

}
