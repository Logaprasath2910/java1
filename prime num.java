/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
public class Main



 {
	public static void main(String[] args) {
	int i;
	int n,flag=0;
	n=97;
	for(i=2;i<=n/2;i++) {
		if(n%i==0)
			flag=1;
		break;
		
	}
	if(flag==0)
		System.out.println("prime");
		
	else {
		System.out.println("not prime");
	}
}
}




