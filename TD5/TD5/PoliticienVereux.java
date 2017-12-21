import java.util.ArrayList;

public class PoliticienVereux
{
    private double compteCampagne;
    public String nom;
    public String prenom;
    private static AssistantParlementaire prototype;
    private ArrayList<AssistantParlementaire> lesA = new ArrayList<AssistantParlementaire>();

    public PoliticienVereux()
    {

    } 

    public PoliticienVereux(double compteCampagne, String nom, String prenom, AssistantParlementaire prototype)
    {
        this.compteCampagne = compteCampagne;
        this.nom = nom;
        this.prenom = prenom;
        this.prototype = prototype;
    }

    public double GetCompteCampagne()
    {
        return this.compteCampagne;
    }

    public void alimenteCompte(double newSomme)
    {
        this.compteCampagne += newSomme;
    }

    public void setNom(String newNom)
    {
        this.nom = newNom;
    }

    public void setPrenom(String newPrenom)
    {
        this.prenom = newPrenom;
    }

    public void ajouteAssistants(int nbAssistante)
    {
        int i;
        i = 1;

        while (i <= nbAssistante)
        {
            lesA.add(prototype.clone());
            i++;
        }
    }

    public ArrayList<AssistantParlementaire> getAssistants()
    {
        return this.lesA;
    }
}