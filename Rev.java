import java.util.*;
public class Rev{
public static void main(String ag[]){
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
String s1=String.valueOf(n);
StringBuffer sb=new StringBuffer(s1);
sb.reverse();
String s2=sb.toString();
int a=Integer.parseInt(s2);
System.out.println(a);
}
}
