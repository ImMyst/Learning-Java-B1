public class PuissanceEtrangere implements IFinanceurDeCampagne
{
    private RegimePolitique typeRegime;
    private String nom;

    public PuissanceEtrangere()
    {

    }

    public PuissanceEtrangere(RegimePolitique typeRegime, String nom)
    {
        this.typeRegime = typeRegime;
        this.nom = nom;
    }

    public void FinancementOcculte(PoliticienVereux Politicien, double somme)
    {
        Politicien.alimenteCompte(somme);
    }
}