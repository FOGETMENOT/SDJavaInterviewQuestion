package I01_Arrays;

public class Array_04printallevennumberfollowedbyodd {
public static void main(String[] args) {
	int[] num= {1,2,3,4,5,6,7,8,45,23,89,12};
	for(int i=0;i<num.length;i++)
	{
		if(num[i]%2==0)
		{
			System.out.println("even number:"+num[i]);
		}
	}
	for(int i=0;i<num.length;i++) {
		if(num[i]%2!=0)
		{
			System.out.println(" odd number:"+num[i]);
		}
	}
}
}
