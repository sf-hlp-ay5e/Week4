import java.util.Date;


public class Playground {

	public static void main(String[] args) {
		
		Playground play = new Playground();
		Playground play2 = new Playground();
		System.out.println(play == play2);
				
		String firstString = "Java is fun!";
		String secondString = "Java is fun!";
		boolean isEqualEqual = (firstString == secondString);
		System.out.println(isEqualEqual);
		boolean[] smoker = new boolean[7];
		System.out.println(smoker[4]);
		
		byte x = 4;
		switch(x){
		case 0: case 1: case 2:
			System.out.print("1");
		case 3: case 4: case 5:
			System.out.print("2");
		case 6: case 7: case 8:
			System.out.print("3");
		}
		
	}

}
