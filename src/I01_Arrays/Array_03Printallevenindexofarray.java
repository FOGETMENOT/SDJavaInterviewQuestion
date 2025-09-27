package I01_Arrays;

public class Array_03Printallevenindexofarray {

	public static void main(String[] args) {
		int[] num= {21,52,23,74,54,63,74,80,92};
// index are from  0   1   2  3 4  5  6   7 8
		for(int i=0;i<num.length;i++)
		{
			if(i%2==0)
			{
				System.out.println(num[i]);
			}
		}
	}
}
