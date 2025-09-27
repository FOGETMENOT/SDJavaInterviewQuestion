package I02_CharArrayProgram;

public class Array_11printonlylowerarray {
public static void main(String[] args) {
	String str="DGF aUTOMATION pro76";
	char[] ch=str.toCharArray();
	String sum=" ";
	 int count=0;
	for(int i=0;i<ch.length;i++)
		
	{
		if(Character.isLowerCase(ch[i]))
		{
			System.out.println("Lower case letter: "+ch[i]);
			sum=ch[i]+sum;
			count++;
		}
	}
	System.out.println(sum);
	System.out.println("count of lowercaseletter:"+count);
}
}
