import java.util.Scanner ;

public class Voter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner userinput = new Scanner(System.in);
		int age = userinput.nextInt();
		if(age >= 18)
		{System.out.println("You are eligible to vote");
		}
		
		else
		{ System.out.println("You are not eligible to vote");
		
		}

	}

}
