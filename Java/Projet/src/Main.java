import java.util.ArrayList;

public class Main {

	public static void main(String[] args)
	{
	
		Couvert couvert = new Couvert();
		Couvert couvert1 = new Couvert("COUV001", "couteau à poisson", Marque.FishAye, Matiere.inox, 12); 		
		Couvert couvert2 = new Couvert("COUV002", "Fourchette à une dent", Marque.ToutCassé, Matiere.acier, 2);
		System.out.println("Reference :" + couvert1.getRef()+"/Descriptif :"+couvert1.getDescription()+"/Marque :"+couvert1.getMarque()+"/Matiere :"+couvert1.getMatiere()+"/Prix :"+couvert1.getPrix()+"€");
		Casserole casserole = new Casserole();
		Casserole casserole1 = new Casserole("CASS001", "casserole haute king size", Marque.TFale, 45, 250);
		System.out.println("Reference :" + casserole1.getRef()+"/Descriptif :"+casserole1.getDescription()+"/Marque :"+casserole1.getMarque()+"/Prix :"+casserole1.getPrix()+"€"+"/Température maximal:"+casserole1.getTempMax()+"°C");
		Lot lot = new Lot();
		Lot lot1 = new Lot("LOT001","Lot de 12 casserole haute King size",Marque.TFale, 486, 10);
		System.out.println("Reference :" + lot1.getRef()+"/Descriptif :"+lot1.getDescription()+"/Marque :"+lot1.getMarque()+"/Prix :"+lot1.getPrix()+"€"+"/Pourcentage :"+lot1.getPourcentage()+"%");

		
		ArrayList<Article>articles = new ArrayList<Article>();
		ArrayList<Lot>lots = new ArrayList<Lot>();
		articles.add(couvert1);
		articles.add(casserole1);
		lots.add(lot1);
		
		
		Facture facture = Test.GenerateFacture(articles, lots, "bob", "25 décembre 2018");
		Facture facture1 = Test.GenerateFacture(articles, lots, "ry", "2 février 2019");
		facture.AfficherArticles();
		facture1.AfficherArticles();
	}
	
}
