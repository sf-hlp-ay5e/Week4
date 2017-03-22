
public class BestCat extends Cat {
	String breed;
	
	public BestCat(String name, String breed) {
		super("Pasha");
		this.breed = breed;
		System.out.println("There is a 'Best' cat named " + this.name + " of breed " + this.breed);
	}
}
