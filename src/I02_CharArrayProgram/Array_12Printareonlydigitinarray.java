package I02_CharArrayProgram;

public class Array_12Printareonlydigitinarray {
public static void main(String[] args) {
	String str="no 39847 kjhfsof SASKDJFHDJ";
	char[] ch=str.toCharArray();
	int count=0;
	String digit="";
	for(int i=0;i<ch.length;i++)
	{
		if(Character.isDigit(ch[i])){
		System.out.println(ch[i]);
		digit=ch[i]+digit;
		count++;
	}}
	System.out.println("digit in string:"+digit);

	System.out.println("count of digit in string:"+count);
}
}
