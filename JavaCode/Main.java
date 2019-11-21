import java.util.Random;

public class Main {

	static int row = 20;
	static int column = 20;
	
	public static void main(String[] args) 
	{
		
		Producers[] producer = new Producers[3];
		
		producer[0] = new Tree();
		producer[1] = new Shrubs();
		producer[2] = new Grass();
		
		Consumer[] consumer = new Consumer[10];
		
		consumer[0] = new Caterpillar();
		consumer[1] = new Bluejay();
		consumer[2] = new Hawk();
		consumer[3] = new Grasshopper();
		consumer[4] = new Mouse();
		consumer[5] = new Fox();
		consumer[6] = new Squirrel();
		consumer[7] = new Rabbit();
		consumer[8] = new Deer();
		consumer[9] = new Wolf();

		int[][] platform;
		platform = new int[row][column];
		Random rand = new Random();
		
		for (int r = 0; r < row; r++)
		{
			for (int c = 0; c < column; c++)
			{
				platform[r][c] = rand.nextInt(2);
				
				int randNum = rand.nextInt(13);
				
				if (platform[r][c] == 1 && randNum < 10)
				{
					consumer[randNum].activity();
					System.out.println("at [" + r +  "] " + "[" + c + "]\n");
				}
				
				else if (platform[r][c] == 1 && randNum >= 10)
				{
					randNum = randNum - 10;
					System.out.println(producer[randNum].name);
					System.out.println("at [" + r +  "] " + "[" + c + "]\n");
				}
			}
		}
	}

}
