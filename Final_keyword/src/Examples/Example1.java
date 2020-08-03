package Examples;

public class Example1 {
	final int speed=90;
	void run()
	{
		//speed=100;
		System.out.println("final keyword");
	}
	public static void main(String args[])
	{
		Example1 ob=new Example1();
		ob.run();
	}
}
