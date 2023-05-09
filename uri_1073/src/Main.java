import java.util.Scanner;
//import java.lang.Math;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int N = s.nextInt();
		
		
		if(N>5 && N<2000) {
			
		    for(int i=1; i<=N; i++) {
			    
		    	int quadrado=0;
			
			    if(i%2 == 0) {
				    quadrado = i*i;
				    System.out.println(i + "^" + "2 = " + quadrado);
			    }
			  
		    }
		}
		
		s.close();
	}

}
