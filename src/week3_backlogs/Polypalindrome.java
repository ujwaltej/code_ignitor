package week3_backlogs;

public class Polypalindrome {
public static void main(String[] args) {
	int temp=0;
	for(int i=1;i<=99;i++)
	{
		for(int j=1;j<=99;j++)
		{
		 temp=i*j;
	if(temp>0){
StringBuffer a=new StringBuffer();

String c="";
c=a.append(temp).toString();
String b="";
b=a.reverse().toString();

if(c.equals(b))
	{
	System.out.println(c);
	}
}}}}
}


