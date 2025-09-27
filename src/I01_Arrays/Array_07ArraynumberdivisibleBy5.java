package I01_Arrays;

public class Array_07ArraynumberdivisibleBy5 {
public static void main(String[] args) {
	int[] num= {1,5,10,20,48,37,21};
	for(int i=0;i<num.length;i++)
	{
		if(num[i]%5==0)
		{
			System.out.println("number divisible by 5 :"+num[i]);
		}
	}
	
}
}
