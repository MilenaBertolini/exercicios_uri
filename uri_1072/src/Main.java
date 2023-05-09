import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int N = s.nextInt();
		int in=0, out=0;
		
		for(int i=0; i<N; i++) {
			int X = s.nextInt();
			
			if(X>=10 && X<=20) {
				in++;
			}else {
				out++;			
			}
		}
		
		System.out.println(in + " in");
		System.out.println(out + " out");
		
		s.close();
	}

}
