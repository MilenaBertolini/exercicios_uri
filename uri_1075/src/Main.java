import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int N = s.nextInt();
		
		if(N<10000) {
			for(int i=1; i<10000; i++) {
				
				if(i%N == 2) {
					System.out.println(i);
				}
			}
		}
		
		s.close();

	}

}
