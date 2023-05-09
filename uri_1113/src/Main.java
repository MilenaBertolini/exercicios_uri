import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int X = s.nextInt();
		int Y = s.nextInt();
		
		while(X!=Y) {
			if(X>Y) {
				System.out.println("Decrescente");
			}else {
				System.out.println("Crescente");
			}
			
			X = s.nextInt();
			Y = s.nextInt();
		}
		
		//System.out.println("Acabou");
		
		s.close();
	}

}
