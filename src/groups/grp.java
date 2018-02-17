package groups;
//adding my comment
//adding my second comment
//adding my third comment
//adding forth comment



// adding my final comment
import org.testng.annotations.Test;

public class grp {

		 @Test (groups = { "Car" },invocationCount=3)
		 
		  public void Car1() {
		 
			  System.out.println("Batch Car - Test car 1");
		 
		  }
		 
		  @Test (groups = { "Car" },enabled=false)
		 
		  public void Car2() {
		 
			  System.out.println("Batch Car - Test car 2");
		 
		  }
		 
		  @Test (groups = { "Scooter" })
		 
		  public void Scooter1() {
		 
			  System.out.println("Batch Scooter - Test scooter 1");
		 
		  }
		 
		  @Test (groups = { "Scooter" },enabled=false)
		 
		  public void Scooter2() {
		 
			  System.out.println("Batch Scooter - Test scooter 2");
		 
		  }
		 
		  @Test (groups = { "Car", "Sedan Car" })
		 
		  public void Sedan1() {
		 
			  System.out.println("Batch Sedan Car - Test sedan 1");
		 
		  }

}
