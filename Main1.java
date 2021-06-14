class Calculations2{
	public static int add(int a,int b){
		return a+b;
	}
	public static int sub(int a, int b){
	 	return a-b;
	 }
	public static int mul(int a , int b){
		return a*b;
	}
	public static float div(float a , float b){
		return a/b;
	}
}
public class Main1{
	public static void main(String[] args){
		Calculations2 obj1 = new Calculations2();
		System.out.println("addition of 2 and 3 are:"+obj1.add(2,3));
		System.out.println("subtraction of 2 and 3 are:"+obj1.sub(2,3));
		System.out.println("multiplication of 2 and 3 are:"+obj1.mul(2,3));
		System.out.println("division of 2 and 3 are:"+obj1.div(3,2));
	}
}