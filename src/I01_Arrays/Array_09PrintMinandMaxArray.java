package I01_Arrays;

public class Array_09PrintMinandMaxArray {
public static void main(String[] args) {
	int[] num= {1,2,3,4,5,67,34,57,78,92};
	int max=num[0];
	int min=num[0];
	for(int i=0;i<num.length;i++)
	{
		if(min>num[i])
		{
		min=num[i];	
		}
	}
	System.out.println("Min number in Array :"+min);
	for(int i=0;i<num.length;i++)
	{
		if(max<num[i])
		{
		max=num[i];	
		}
	}
	System.out.println("Max number in Array :"+max);

}
}
