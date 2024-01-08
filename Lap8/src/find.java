
public class find {

	int binarySearch(int a[], int n, int target)
	{
	   int first= 0;
	   int last= n - 1;
	   int mid;
	   while (first <= last) 
	        {
	            mid = (first + last)/2;
		if (target == a[mid])
	       	            return mid;
	      	else if (target < a[mid])
	         	            last = mid - 1;
	      	else // must be that target > a[mid]
	         	            first = mid + 1;
	            }
	   return -1; //use -1 to indicate item not found
	   
	   
	}
		
	}
public static void main(String[] args) {
	
	int array[] = (1,2,3,4,5,6,7);
	int search=10;
	int x = binarysearch (array,search);
	if(x!=-1)
	System.out.println("exist"+search);
	else
		System.out.println("the number doesnt exist");
	
	
	
}	
}
