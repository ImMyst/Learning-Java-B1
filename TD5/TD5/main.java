import java.util.*;

public class main
{
    public static void main(String[] args)
    {
        ArrayList<IFinanceurDeCampagne> financeurs = new ArrayList<IFinanceurDeCampagne>();
        financeurs.add(new PuissanceEtrangere(RegimePolitique.Theocratie, "AS"));
        financeurs.add(new PuissanceEtrangere(RegimePolitique.Dictature, "CN"));

        PoliticienVereux ff = new PoliticienVereux(1000, "ff", "fd", new AssistantParlementaire());
        ff.setPrenom("Caroll");
        ff.setNom("FIONSINF");
        ff.ajouteAssistants(3);
        Parti parti = new Parti(PartiePolitique.LesRipoux);
        parti.AddMembre(ff);

        System.out.println("Avant financement occulte, compte de campagne : " + ff.GetCompteCampagne());

        for (IFinanceurDeCampagne financeur : financeurs)
        {
            financeur.FinancementOcculte(ff, 2000000);
        }
        for (IFinanceurDeCampagne financeur : ff.getAssistants())
        {
            financeur.FinancementOcculte(ff, 10000);
        }
        System.out.println("Apres financement occulte, compte de campagne : " + ff.GetCompteCampagne());
    }
}
