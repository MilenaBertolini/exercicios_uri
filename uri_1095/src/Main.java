
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		/*for(int I = 1, J = 60; J==0; I+=3 , J-=5) {
			System.out.println("I=" + I);
			System.out.println("J=" + J);
		}*/
		
		int I = 1;
		
		for(int J=60; J>=0; J-=5) {
			System.out.println("I=" + I + " J=" + J);
			I += 3;
		}
		

	}

}
