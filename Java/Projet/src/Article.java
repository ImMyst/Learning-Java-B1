
public class Article {
	
	private String ref;
	private String description;
	private Marque marque;
	private int prix;
	public static int count;
	
	public Article() {
		
	}
	public Article(String ref, String description, Marque marque, int prix)
	{
		++count;
		this.description = description;
		this.marque = marque;
		this.prix = prix;
		this.ref = ref;
	}
	public int getPrix()
	{
		return this.prix;
	}
	
	public void setPrix(int prix)
	{
		this.prix = prix ;
	}
	
	public Marque getMarque()
	{
		return this.marque;
	}
	
	public void setMarque(Marque marque)
	{
		this.marque = marque;
	}
	
	public String getDescription()
	{
		return this.description;
	}
	
	public void setDescription(String description)
	{
		this.description = description;
	}
	
	public String getRef()
	{
		return this.ref;
	}
	
	public void setRef(String ref)
	{
		this.ref = ref;
	}
	public int getCount()
	{
		return this.count;
	}
	
	
}
