
public class FunctionEx 
{

	static int add(int a , int b)
	{
		int c;
		
		c= a+b;
		
		return c;
	}
	public void addMethod(){
		System.out.println("IM trying to edit your program file by adding this method");
	}
	
	
}// class FunctionEx ends



class TestFunction
{
	public static void main(String[] args) {
		
		int result=FunctionEx.add(10,20); // static methods are called using class name
		
		System.out.println(result);
		FunctionEx obj = new FunctionEx();
		obj.addMethod();
	}
}
