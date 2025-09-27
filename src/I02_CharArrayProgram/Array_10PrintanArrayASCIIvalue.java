
package I02_CharArrayProgram;

public class Array_10PrintanArrayASCIIvalue {
public static void main(String[] args) {
	String str="No26 soundH";
	String upperletter="";
	char[] ch=str.toCharArray();
	for(int i=0;i<ch.length;i++)
	{
		if(Character.isUpperCase(ch[i]))
		{
			System.out.println("upper case :"+ch[i]);
			upperletter=upperletter+ch[i];
		}
	}
	
	System.out.println("All Uppercase letter :"+upperletter);

}
}
