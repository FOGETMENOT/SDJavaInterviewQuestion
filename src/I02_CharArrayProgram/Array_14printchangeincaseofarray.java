package I02_CharArrayProgram;

public class Array_14printchangeincaseofarray {
public static void main(String[] args) {
	String str="no26 Automation Java";
	char[] ch=str.toCharArray();
	String changecasetolower="";
	String changecasetoupper="";
	for(int i=0;i<ch.length;i++)
	{
		if(Character.isUpperCase(ch[i]))
		{
			changecasetolower=changecasetolower+ch[i];
			
		}
		if(Character.isLowerCase(ch[i]))
		{
			changecasetoupper=changecasetoupper+ch[i];
			
		}
	}
	System.out.println("uppercase array:"+changecasetoupper);
	System.out.println("lower array:"+changecasetolower);

}

}
