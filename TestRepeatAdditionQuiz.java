//U10416005ªL«Ø¦t
import java.util.Scanner;

public class TestRepeatAdditionQuiz{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		RepeatAdditionQuiz og = new RepeatAdditionQuiz(72,0);
		System.out.println("What is 9 * 8? ");
		og.setAns(input.nextInt());
		while(og.getAns() != og.getA()){
			if(og.contains() == true){
				System.out.println("You already entered " + og.getAns());
				og.setAns(input.nextInt());
			}
			else{
				System.out.println("Wrong answer. Try again. What is 9*8? ");
				og.setAns(input.nextInt());
			}
		}
		System.out.println("You got it!");
	}
}
