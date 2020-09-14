package lessons_5;

public class Lec1 {

	public static void main(String[] args) {
		
		int finalscore=calculateHighScorePosition(1500);
		displayHighScorePosition("Amiatv", finalscore);
		finalscore=calculateHighScorePosition(900);
		displayHighScorePosition("sakil", finalscore);
		finalscore=calculateHighScorePosition(400);
		displayHighScorePosition("Abhijit", finalscore);
		finalscore=calculateHighScorePosition(50);
		displayHighScorePosition("Amit", finalscore);
		finalscore=calculateHighScorePosition(1000);
		displayHighScorePosition("Amit", finalscore);

	}

	public static void displayHighScorePosition(String name,int position) {
		System.out.println(name +" managed to get into position "+ position +" on high score table ");
	}
	public static int calculateHighScorePosition(int score) {
		if (score>=1000) {
			return 1;
		}
		else if(score >=500 ) {
			return 2;
		}
		else if(score>=100 ) {
			return 3;
		}
		else {
			return 4;
		}
			
	}
}
