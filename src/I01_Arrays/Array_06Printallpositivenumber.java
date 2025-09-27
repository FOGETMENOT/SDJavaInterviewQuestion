package I01_Arrays;

public class Array_06Printallpositivenumber {
public static void main(String[] args) {
	int[] num= {1,2,3,4,5,6,-1,2,-45,-7,0};
	for(int i=0;i<num.length;i++)
	{
		if(num[i]>0)
		{
			System.out.println("number is positive :"+num[i]);
		}
	}
}
}
