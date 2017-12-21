public class EmployeMunicipal extends EmploiFictif
{
    public String mairie;

    public EmployeMunicipal()
    {

    }

    public EmployeMunicipal(String mairie)
    {
        this.mairie = mairie;
    }

    public EmployeMunicipal clone()
    {
        return this;
    }
}