
public class Casserole extends Article  {


private int TempMax;

	public Casserole()
	{
	System.out.println("Casserole");
	}
	
	public Casserole( String ref, String description, Marque marque, int prix, int TempMax)
	{
		super(ref, description, marque, prix);
		this.TempMax = TempMax;
			
	}
	
	public int getTempMax()
	{
		return this.TempMax;
	}
	
	public void setTempMax(int TempMax)
	{
		this.TempMax = TempMax;
	}
	
	
	
	
	
	

}
