package interview;

public class PrintEvenNumber {

	public static void main(String[] args) {
		System.out.println("Even numbers between 1 to 100 are: ");
		for(int number=0; number<100; number++){
			
			if(number%2==0){
				System.out.print(number+" ");
			}
		}
	}

}
