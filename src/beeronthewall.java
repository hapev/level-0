
public class beeronthewall {
public static void main(String[] args) {
	

	for(int i=396;i>0;i--){
		int l = 1;	

		if (l ==1||l==2||l==4){
			System.out.print(i/4+" bottles of beer");
			if (l == 1){
			System.out.print(" on the wall");
				l = 2; }
			if (l == 2){
				System.out.print(i/4+" bottles of beer,");
				l = 3; }	
			if (l == 4){ 
				System.out.print(" on the wall.");
				l = 1; }
		}
		
		if (l ==3){
			System.out.println("You take one down and pass it around,");
			l = 4;
			
		}
	
	
	
	
}
}
}
