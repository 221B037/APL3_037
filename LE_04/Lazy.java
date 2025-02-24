public class Singleton
{
	private static Singleton uniqueInstance; 
	private Singleton(){}
	public static Singleton getInstance()
	{
	    if(uniqueInstance==null){
	        uniqueInstance =new Singleton();
	    }
	    return uniqueInstance;
	}
	
}
class Lazy{
    public static void main(String[] args){
        Singleton S1= new Singleton();
    }
}