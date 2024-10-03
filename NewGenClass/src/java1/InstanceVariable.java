package java1;

public class InstanceVariable {

	String name;
	boolean bool;
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		InstanceVariable i=new InstanceVariable();
		i.test1("mamta");
		i.test1("ggdj");
		i.getTrueOrFalse(true);
		
	}
	
	
	public void test1(String getName) {
		name=getName;
		System.out.println(name);
	}
	
	public void test2(String getName) {
		name=getName;
		System.out.println(name);
	}
	
	public void getTrueOrFalse(boolean getBool)
	{
		bool=getBool;
		String name1="rohit";
		String name2="Rohit";
		
		if(name1==name2)
		{
			System.out.println("true");
		}
		
		else
			System.out.println("false");
	}
	

}
