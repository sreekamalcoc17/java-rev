import java.util.*;
public class Inp1{
	public static void main(String[] args){
		Scanner var1 = new Scanner(System.in);
		String firstName = var1.nextLine();
		String lastName = var1.nextLine();
		int age = var1.nextInt();

		System.out.println("name: "+firstName+" "+lastName+"\n "+"age:"+age);
	}
}