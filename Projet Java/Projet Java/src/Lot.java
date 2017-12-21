
public class Lot extends Article {
private int pourcentage;

	public Lot()
	{
		System.out.println("LOT");
	}

	public Lot(String ref, String description, Marque marque, int prix, int pourcentage)
	{
		super(ref,description,marque,prix);
		this.pourcentage=pourcentage;
		
	}
	public int getPourcentage()
	{
		return this.pourcentage;
	}
	public void setPourcentage(int pourcentage)
	{
		this.pourcentage=pourcentage;
	}
}
