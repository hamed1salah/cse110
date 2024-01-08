
public class Aver {

	public static double calculateAverage(double[] arr) {
        if (arr.length == 0) {
            return 0.0; 
        }

        double sum = 0.0;

        
        for (double num : arr) {
            sum += num;
        }

        return sum / arr.length;
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
