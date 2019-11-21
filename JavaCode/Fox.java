
public class Fox extends Consumer{
	public Fox()
	{
		this.name = "Fox";
		this.specification = "Secondary Consumer";
		this.type = "Mammal";
	}
	
	public void activity()
	{
		System.out.println("What does the fox say?");
	}
}
