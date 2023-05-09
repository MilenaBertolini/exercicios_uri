import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int N = s.nextInt();
		
		
		if(N<10000) {
		    for(int i=0; i<N; i++) {
			
			    int X = s.nextInt();
			
			    if(X<0 && (X%2==0)) {
				   System.out.println("EVEN NEGATIVE");
			    }else if(X<0 && (X%2!=0)) {
				   System.out.println("ODD NEGATIVE");
			    }else if(X>0 && (X%2==0)) {
				   System.out.println("EVEN POSITIVE");
			    }else if(X>0 && (X%2!=0)) {
				   System.out.println("ODD POSITIVE");
			    }else if(X==0) {
				  System.out.println("NULL");
			    } 
		    }
		}
		
		s.close();
	}

}
