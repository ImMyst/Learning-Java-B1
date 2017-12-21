public class Parti implements IFinanceurDeCampagne
{
    private PartiePolitique nom;

    Parti()
    {

    }

    Parti(PartiePolitique nom)
    {
        this.nom = nom;
    }

    public void Parti(PartiePolitique ThisParti)
    {
        this.nom = ThisParti;
    }

    public void AddMembre(PoliticienVereux newMembre)
    {
        
    }

    public void FinancementOcculte(PoliticienVereux Politicien, double somme)
    {
        Politicien.alimenteCompte(somme);
    }
}