package testNG;



import java1.parent;

public class Child1 extends parent {
	
	int bonus=1000;
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Child1 c=new Child1();
		System.out.println("salary is :"+c.salary);
		System.out.println("bonus is :"+c.bonus);
		c.methods1();
		
	}
	
	public void childmethod()
	{
		System.out.println("child method");
	}
	
	

}
