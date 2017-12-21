public class AssistantParlementaire extends EmploiFictif implements IFinanceurDeCampagne
{
    public AssistantParlementaire()
    {

    }

    public void FinancementOcculte(PoliticienVereux Politicien, double somme)
    {
        Politicien.alimenteCompte(somme);
    }

    public AssistantParlementaire clone()
    {
        return this;
    }
}