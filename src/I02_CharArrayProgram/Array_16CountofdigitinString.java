package I02_CharArrayProgram;

public class Array_16CountofdigitinString {
public static void main(String[] args) {
	
	String str="no26 java program";
	char[] ch=str.toCharArray();
	String digit="";
	int count=0;
	for(int i=0;i<ch.length;i++) {
		if(Character.isDigit(ch[i]))
		{
			System.out.println(ch[i]);
			digit=digit+ch[i]+",";
			count++;
		}
	}
	System.out.println("digit present instring: "+digit);
	System.out.println("count of digit present: "+count);
}
}

