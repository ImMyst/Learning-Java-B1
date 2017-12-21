import java.util.ArrayList;

public class SitFic {

		public static void main(String[] args) throws CloneNotSupportedException
		{
		ArrayList<IFinanceurCampagne> financeurs = new ArrayList<IFinanceurCampagne> ();
		
		financeurs.add (new PuissanceEtrangere (RegimePolitique.Theocratie, "AS"));
		financeurs.add (new PuissanceEtrangere (RegimePolitique.Dictature, "CN"));
		
		PoliticienVereux ff = new PoliticienVereux ();
		
		ff.setPrenom("Caroll");
		ff.setNom("FIONSINF");
		ff.ajouteAssistants(3);
		
		Parti parti = new Parti (PartiPolitique.LesRipoux);
		parti.addMembre(ff);
		
		System.out.println ("AVANT financement occulte, compte de campagne : " + ff.getCompteCampagne());
		
		
		for (IFinanceurCampagne financeur : financeurs)
			
		{
			financeur.financementOcculte(ff, 2000000);
		}
		
		System.out.println ("APRES financement occulte, compte de campagne : " + ff.getCompteCampagne());
		
		}
	}


