package I02_CharArrayProgram;

public class Array_15FindaCountofuppercaseinarray {
public static void main(String[] args) {
	String str="Java program Automation";
	char[] ch=str.toCharArray();
	String uppercaseletter="";
	int count=0;
	for(int i=0;i<ch.length;i++)
	{
		if(Character.isUpperCase(ch[i]))
		{
			uppercaseletter=uppercaseletter+ch[i];
			count++;
		}
	}
	System.out.println("count of upper case letter:"+count);
	System.out.println("uppercase leter in string:"+uppercaseletter);
}
}
