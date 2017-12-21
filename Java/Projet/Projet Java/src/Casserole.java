
public class Casserole extends Article  {


private int TempsMax;

	public Casserole()
	{
	System.out.println("CASSEREOLE");
	}
	
	public Casserole( String ref, String description, Marque marque, int prix, int TempsMax)
	{
		super(ref, description, marque, prix);
		this.TempsMax = TempsMax;
			
	}
	
	public int getTempMax()
	{
		return this.TempsMax;
	}
	
	public void setTempMax(int TempMax)
	{
		this.TempsMax = TempsMax;
	}
	
	
	
	
	
	

}
