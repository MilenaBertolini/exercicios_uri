import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int X = s.nextInt();
		int Y = s.nextInt();
		
		while(X!=0 && Y!=0) {
			
			if(X>0 && Y>0) {
				System.out.println("primeiro");
			}else if(X<0 && Y>0) {
				System.out.println("segundo");
			}else if(X<0 && Y<0) {
				System.out.println("terceiro");
			}else if(X>0 && Y<0) {
				System.out.println("quarto");
			}
			
			X = s.nextInt();
			Y = s.nextInt();
		}
		
		s.close();

	}

}
