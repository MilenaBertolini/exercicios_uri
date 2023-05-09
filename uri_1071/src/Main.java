import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int X = s.nextInt();
		int Y = s.nextInt();
		
		if(X>Y) {
			
			int intervalo = Y + 1, somaIntervalo = 0;
			
			for(int i=intervalo; i<X; i++) {
				//System.out.println(i);
				if(i%2 !=0) {
					somaIntervalo = somaIntervalo + i;
				}
			}
			System.out.println(somaIntervalo);
		}else {
			
			int intervalo = X + 1, somaIntervalo = 0;
			
			for(int i=intervalo; i<Y; i++) {
				
				if(i%2 !=0) {
					somaIntervalo += i;
				}
			}
			System.out.println(somaIntervalo);
		}
		
			
		/*if(X>Y) {
			
			int somaInt = 0;
			
			for(int i=Y; i<X; i++) {
				//System.out.println(i);
				
				int intervalo = i+1;
				
				System.out.println(intervalo);
				
				if(intervalo % 2 != 0) {
					somaInt =+ intervalo;
				}
				
			}
			//System.out.println(somaInt);
		}else {
			int somaInterv = 0;
			for(int j=X; j<=Y; j++) {
				int interv = j+1;
				
				if(interv%2 != 0) {
					somaInterv =+ interv;
				}
				
		
			}
			
			System.out.println(somaInterv);
		}*/
		
		s.close();

	}

}
