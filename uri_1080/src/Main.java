import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int maior = 0, position = 0;
		
		for(int i=1; i<=10; i++) {
			int N = s.nextInt();
			
			if(maior<N) {
				maior = N;
				position = i;
			}
						
			
		}
		
		System.out.println(maior);
		System.out.println(position);
		
		s.close();

	}

}
