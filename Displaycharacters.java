import java.util.Scanner;
public class Displaycharacters{
public static void main(String[]arg) {
Scanner sc=new Scanner(System.in);
int num;
char ch;
int i=0;
System.out.println("enter the digits");
while(i<4) {
num=sc.nextInt();
ch=(char)num;
System.out.println(num+"-"+ch);
i++;
}
}
}

