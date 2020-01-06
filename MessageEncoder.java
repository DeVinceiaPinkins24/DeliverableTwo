import java.util.Scanner;
public class MessageEncoder {

	public static void main(String[] args) {
		
		Scanner scnr = new Scanner(System.in);
		System.out.print("Hello, what is your message?");
		String input = scnr.nextLine();
		
		String input2 = input.toUpperCase();
		
		System.out.print("\nThe encoded message is ");
		
		//initializing message
		int [] message = new
		//getting input length
		int[input2.length()];
		
		int numCode = 0;
		int wordUnicode = 65;
		int checkedSum = 0;
		for(int i=0;i<message.length;i++) {
			message[i] = input2.charAt(i);
			checkedSum = checkedSum + message[i]
					;
			numCode = (message[i] - wordUnicode
					)+1;
			
			if ( i == message.length -1) {
				System.out.print(numCode);
			}
			else {System.out.print(numCode + "-"
					);
		}		

	}
		System.out.println();
		System.out.println("The message is " +checkedSum
				);
	}
