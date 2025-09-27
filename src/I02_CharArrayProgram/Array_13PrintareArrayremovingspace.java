package I02_CharArrayProgram;

public class Array_13PrintareArrayremovingspace {
public static void main(String[] args) {
	
	String str="no 26 java program";
	char[] ch=str.toCharArray();
	String strwithoutspace="";
	for(int i=0;i<ch.length;i++)
	{
		if(!Character.isSpace(ch[i]))
				{
			strwithoutspace=strwithoutspace+ch[i];
				}
	}
	System.out.println(strwithoutspace);
}
}
