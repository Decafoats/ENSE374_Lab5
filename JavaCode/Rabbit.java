
public class Rabbit extends Consumer
{
	public Rabbit()
	{
		this.name = "Rabbit";
		this.specification = "Primary Consumer";
		this.type = "Mammal";
	}
	
	public void activity()
	{
		System.out.println("Big Hop");
	}
}
