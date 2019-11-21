
public class Wolf extends Consumer
{
	public Wolf()
	{
		this.name = "Wolf";
		this.specification = "Secondary Consumer";
		this.type = "Mammal";
	}
	
	public void activity()
	{
		System.out.println("Growl");
	}
}
