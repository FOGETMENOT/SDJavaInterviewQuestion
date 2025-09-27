package I01_Arrays;

public class Array_05Printalltwodigitnumberinarray {
public static void main(String[] args) {
	int[] num= {1,2,4,8,99,77,55,44,23,88,556,986,100,101};
	for(int i=0;i<num.length;i++) {
		if(num[i]>9 && num[i]<100)
		{
			System.out.println(num[i]);
		}
	}
}
}
