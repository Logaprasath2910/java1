/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
int a=0,b=1;
int n,c,i;
Scanner sc=new Scanner(System.in);
n=sc.nextInt();
System.out.println(a);
System.out.println(b);
for(i=0;i<=n;i++) {
c=a+b;
System.out.println(c);
a=b;
b=c;
}
}
}
