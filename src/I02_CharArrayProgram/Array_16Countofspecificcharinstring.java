package I02_CharArrayProgram;

public class Array_16Countofspecificcharinstring {
	public static void main(String[] args) {
		String str="aaabbbccc";
		char[] ch=str.toCharArray();
		int count=0;
		for(int i=0;i<ch.length;i++)
		{
			if(ch[i]=='r'||ch[i]=='a')
			{
				System.out.println(ch[i]);
				count++;
				
			}
		}
		System.out.println(count);
	}
}
