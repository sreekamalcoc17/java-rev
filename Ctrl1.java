public class Ctrl1{
	public static void main(String[] args){
		int a=10;
		int i;
		int w=0;
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
		System.out.println("even numbers are:\n");
		while(w<a){
			if(w%2==0){
				System.out.println(w);
				
			}
			else{
				w++;
				continue;

			}
			w++;
		}
		System.out.println("\nodd numbers are:\n");
		for(int num = 0;num<a;num++){
			if(num%2!=0){
				System.out.println(num);
			}
		}
	}
}
