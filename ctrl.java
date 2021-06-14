public class Ctrl{
	public static void main(String[] args){
		int a=10;
		int i;
		if(a%2==0){
			i = 0;
		}
		else{
			i =1;
		}
		switch(i){
			case 0:
				System.out.println("a is even");
				break;
			case 1:
				System.out.println("a is odd");
				break;
			default:
				System.out.println("this is default");
				break;
		}
	}
}
