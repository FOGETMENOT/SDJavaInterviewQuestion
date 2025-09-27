package I01_Arrays;

public class Array_02PrintSumofallevennumberinArray {
public static void main(String[] args) {
	int[] num= {1,2,3,4,5,6,7,8};
	double sum=0;
	for(int i=0;i<num.length;i++)
	{
		if(num[i]%2==0)
		{
		System.out.println(num[i]);
		sum=sum+num[i];
		
		}
	}
	System.out.println("Total sum od array:"+sum);
}
}
