package java1;

public class FinalVariable {
//	//Final Variable restricted to user.
//	. Final keyword is used to declare the Variable.
//	. Final method can’t be override.
//	. Final class can’t be extended.


	//final variable
	
	final int a=50;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
FinalVariable f=new FinalVariable();
// a=40;
System.out.println(f.a);
		
	}
	
	
	final void test()
	{
		System.out.println("final method");
	}

}
