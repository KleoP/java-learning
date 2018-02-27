import java.util.Scanner;

public class RudeQuestions {
	public static void main( String[] args ) {
		String name;
		int age;
		double weight, income;
		
		Scanner myAcersKeyboard = new Scanner(System.in);
		
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.print( "Hello, there! I'm Alice. What's your name?");
		name = myAcersKeyboard.next();
		
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.print( "Hi, " + name + "! How ya doing? Oh, btw, how old are you?");
		age = myAcersKeyboard.nextInt();
		
		System.out.println();
		System.out.println( "So, you're " + age + "years old, are you?" );
		
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.print( "And how about telling me how much you weigh?" );
		weight = myAcersKeyboard.nextDouble();
		
		System.out.println();
		System.out.println( weight + " pounds? Or kilograms?");
		System.out.println();
		System.out.println( "I forgot to ask you, but it's a rude question anyhow, so we'll just move on.");
		
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.print( "Finally, 'since I'm being rude already, how much money do you make each year?" );
		income = myAcersKeyboard.nextDouble();
		
		System.out.println();
		System.out.println( income + " pounds or dollars?" );
		System.out.println();
		System.out.println( "I forgot to include units, again. I'm just no good at this rudeness!");
		
		System.out.println();
		System.out.println();
		System.out.print( "Well, thanks for answering my rude questions, " );
		System.out.println( name + " !");
		
		System.out.println();
		System.out.println();
	}
}