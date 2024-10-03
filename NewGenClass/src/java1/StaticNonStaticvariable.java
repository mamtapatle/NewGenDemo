package java1;

public class StaticNonStaticvariable {

	static String name="Mamta";
	public void test1()
	{
		System.out.println(name);
	}
	public void test2()
	{
		name="method name";
		System.out.println(name);
	}
	public static  void test3()
	{
		System.out.println(name);
	}
	public void test4()
	{
		System.out.println(StaticNonStaticvariable.name);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StaticNonStaticvariable d=new StaticNonStaticvariable();
		d.test1();
		d.test2();
		StaticNonStaticvariable.test3();
		d.test4();
		
	}

}
