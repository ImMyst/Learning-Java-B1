
 public class Couvert extends Article {

private Matiere matiere;

	public Couvert()
	{
		System.out.println("Couvert");
	}

	public Couvert( String ref, String description, Marque marque, Matiere matiere, int prix)
	{
		super(ref, description, marque, prix);
		this.matiere = matiere;
	}
	

	public Matiere getMatiere()
	{
		return this.matiere;
	}
	
	public void setMatiere(Matiere matiere)
	{
		this.matiere = matiere;
	}
	
}
