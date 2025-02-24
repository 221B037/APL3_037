/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
public class Singleton
{
	private static Singleton uniqueInstance=new Singleton(); 
	private Singleton(){}
	public static Singleton getInstance()
	{
	    return uniqueInstance;
	}
	
}
class Eager{
    public static void main(String[] args){
        Singleton S1= new Singleton();
    }
}
