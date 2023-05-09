import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int X = s.nextInt();
		int prox = 0;
		
		/*for(int i=0; i<=6; i++) {
			
			if(X%2 != 0) {
				prox = X + 1;
			}
		}*/
		
		if(X%2 != 0) {
			System.out.println(X);
			int impar = X;
			
			for(int i=0; i<5; i++) {
				impar += 2;
				System.out.println(impar);
				
			}
		}else {
			int odd = X+1;
			System.out.println(odd);
			
			for(int j=0; j<5; j++) {
				odd += 2;
				System.out.println(odd);
				
			}
		}
		
		s.close();

	}

}
