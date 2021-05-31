package abstraction;

public class Allmembers{
	  public static void main(String args[]) {
		  Son S = new Son();
		  Daughter D =new Daughter();
		  S.details();
		  D.details();
		  
		  
	  }
}


abstract class Family {
	 abstract void details() ;

}

class Son extends Family{

	void details() {
		System.out.println("ajith");
		
	}
}
class Daughter extends Family{

	void details() {
		System.out.println("aryani");
		
	}
}

