import java.util.ArrayList;

public class Test {


	public static Facture GenerateFacture(ArrayList<Article> articles, ArrayList<Lot> lots, String NomClient, String Date )
	{

		Facture facture = new Facture(articles, lots, NomClient, Date);
		return facture;
	}


}
