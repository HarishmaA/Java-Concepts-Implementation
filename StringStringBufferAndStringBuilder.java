
public class StringStringBufferAndStringBuilder {
	public static boolean referenceEquality(String str,String str1)
	{
		return str==str1;
	
	}
	public static boolean referenceEquality(StringBuilder str,StringBuilder str1)
	{
		return str==str1;
	
	}
	public static boolean contentEquality(String str,String str1)
	{
		return str.equals(str1);
	
	}
	public static boolean contentEquality(StringBuilder str,StringBuilder str1)
	{
		return str.equals(str1);
	
	}
	
public static void main(String[] args)
{
	String str="Harishma";
	String str1="Harishma";
	String str2=new String("Harishma");
	String str3=new String("Harishma");
	StringBuilder strBf1=new StringBuilder("Harishma");
	StringBuilder strBf2=new StringBuilder("Harishma");
	// for reference equality
	System.out.println(referenceEquality(str,str1));
	System.out.println(referenceEquality(str1,str2));
	System.out.println(referenceEquality(str2,str3));
	//System.out.println(referenceEquality(str3,strBf1));
	System.out.println(referenceEquality(strBf1,strBf2));
	
	
	//for content equality
	System.out.println(contentEquality(str,str1));
	System.out.println(contentEquality(str1,str2));
	System.out.println(contentEquality(str2,str3));
	//System.out.println(contentEquality(str3,strBf1));
	System.out.println(contentEquality(strBf1,strBf2));
	
	
}
}
