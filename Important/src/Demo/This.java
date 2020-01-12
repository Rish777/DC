package Demo;

public class This {

	public static void main(String[] args) {
	This t=new This("this is second constructor");
	
		

	}
	public This(int a)
	{
		System.out.println("this is first constructor"+a);
		
	}
	
	public This(String a)
	{
		this(100);
		System.out.println(a);
	}

}
