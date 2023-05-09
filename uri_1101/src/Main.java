import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		
		int M = s.nextInt();
		int N = s.nextInt();
		
		int soma = 0, i = 0;
		
		while(M>0 && N>0) {
			if(M<N) {
				i = M;
				while(i>=M && i<=N) {
					System.out.print(i + " ");
					soma += i;
					i++;
				}
				System.out.println("Sum=" + soma);
			}else {
				i = N;
				while(i>=N && i<=M) {
					System.out.print(i + " ");
					soma += i;
					i++;
				}
				System.out.println("Sum=" + soma);
			}
			
			M = s.nextInt();
			N = s.nextInt();
			
			soma = 0;
		}
		
		System.out.println("Terminou");
		s.close();	

	}

}
