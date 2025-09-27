package I01_Arrays;

public class Array_02printonlyevennumberinArray {

	public static void main(String[] args) {
		int[] num= {1,2,3,4,5,6,7,8,9,24,46,68};
		int count=0;
		for(int i=0;i<num.length;i++)
		{
			if(num[i]%2==0)
			{
			System.out.println("Even number :"+num[i]);
			count++;
			}
			
		}
		System.out.println("length of array     :"+num.length);
		System.out.println("count of even number: "+count);
	}
}
