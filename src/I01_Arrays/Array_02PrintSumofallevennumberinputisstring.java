package I01_Arrays;

public class Array_02PrintSumofallevennumberinputisstring {
public static void main(String[] args) {
	String num="12345";
	char[] ch=num.toCharArray();
	int sum=0;
	for(char i=0;i<=num.length()-1;i++)
	{
	sum=Integer.parseInt(num.charAt(i)+"")+sum;
	
	}
	System.out.println(sum);
}

}
