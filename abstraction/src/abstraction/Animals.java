package abstraction;

abstract class Demo {
	abstract void cats();
	abstract void dogs();
	
}
 class Animals extends Demo{
	 void cats() {
		 System.out.println("meow meow");
	 }
	 void dogs() {
		 System.out.println("bow bow");
	 }
   public static void main(String args[]) {
	   Animals A = new Animals();
	   A.cats();
	   A.dogs();
   }
	
}
