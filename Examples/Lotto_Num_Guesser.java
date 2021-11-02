/*******************
Name: Austin C Arledge

Date: 13 Jan 2021

Note: This program randomly generates numbers while attempting to guess a pre-defined lotto number. 
*******************/

public class LottoWinner {
	
	public static void main(String[] args) {
		
		// Create the actual winning lotto numbers
		int[] winningLotto = {22, 88, 52, 94};
		
		// Create the variable to guess the lotto numbers
		int[] attemptedLotto = {0, 0, 0, 0};

		// Create some variables to alter
		int a1 = attemptedLotto[0];
		int a2 = attemptedLotto[1];
		int a3 = attemptedLotto[2];
		int a4 = attemptedLotto[3];
		
		// Run the program to guess the lotto numbers
		while (attemptedLotto != winningLotto) {

			if (a1 != winningLotto[0]) {
				
				a1 = (int) Math.ceil(Math.random() * 99);
				attemptedLotto[0] = a1;
			}
			
			else if (a1 == winningLotto[0]) {
				
				attemptedLotto[0] = a1;
				System.out.println("Position 1 Found");
			}
			
			if (a2 != winningLotto[1]) {
				
				a2 = (int) Math.ceil(Math.random() * 99);
				attemptedLotto[1] = a2;
			}
			
			else if (a2 == winningLotto[1]) {
				
				attemptedLotto[1] = a2;
				System.out.println("Position 2 Found");
			}
			
			if (a3 != winningLotto[2]) {
				
				a3 = (int) Math.ceil(Math.random() * 99);
				attemptedLotto[2] = a3;
			}
			
			else if (a3 == winningLotto[2]) {
				
				attemptedLotto[2] = a3;
				System.out.println("Position 3 Found");
			}
			
			if (a4 != winningLotto[3]) {
				
				a4 = (int) Math.ceil(Math.random() * 99);
				attemptedLotto[3] = a4;
			}
			
			else if (a4 == winningLotto[3]) {
				
				attemptedLotto[3] = a4;
				System.out.println("Position 4 Found");
			}
			
         for (int i = 0; i < 4; i++) {
         
            System.out.println(String.valueOf(attemptedLotto[i]));
         }
			// Check for a matching number
			if (attemptedLotto[0] == winningLotto[0])
				if (attemptedLotto[1] == winningLotto[1])
					if (attemptedLotto[2] == winningLotto[2])
						if (attemptedLotto[3] == winningLotto[3]) {
				
							System.out.println("You have figured out the winning lotto");
							break;
						}
      }
      
      System.out.print("Winning Numbers are: ");
      
      for(int i = 0; i < 4; i++) {
         
    	  System.out.println(attemptedLotto[i]);
      }
      
	}
}
