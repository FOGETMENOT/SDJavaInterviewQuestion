package I02_CharArrayProgram;

public class Array_16CountofvowelsinString {
public static void main(String[] args) {
	String str="java program automation 112345";
	char[] ch=str.toCharArray();
	String vowels="";
	int count=0;
	for(int i=0;i<ch.length;i++)
	{
		if(ch[i]=='a'||ch[i]=='e'||ch[i]=='i'||ch[i]=='o'||ch[i]=='u')
			{
			System.out.println("vowels in string:"+ch[i]);
			count++;
			vowels=vowels+ch[i]+",";
			}}
	
	System.out.println("vowels in string :"+vowels);
	System.out.println("vowels count::"+count);
}
}
