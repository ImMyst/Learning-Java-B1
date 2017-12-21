class Deck 
	
	{
	    private int nombreCartes;
	    private Carte[] cartes;
	 
	    public Deck(int nb) 
	    
	    {
	        nombreCartes = nb;
	        cartes = new Carte[nb];
	        System.out.println("Création de deck.");
	    }
	 

	    public void joue() 
	    
	    {
	        System.out.println("Je joue une carte...");
	        int i = 0;
	        while ((cartes[i] == null) && i < nombreCartes) 
	        
	        {
	            i++;
	        }
	        
	        if ((i < nombreCartes) && (cartes[i] != null)) 
	        
	        {
	           
	            cartes[i].afficher();
	            cartes[i] = null;
	        } 
	        
	        else 
	        
	        {
	            System.out.println("Plus de cartes");
	        }
	    }
	 

	    public void piocher(Carte carte) 
	    
	    {
	        int i = 0;
	        while ((i < nombreCartes) && (cartes[i] != null)) 
	        
	        {
	            i++;
	        }
	        
	        if (i < nombreCartes) 
	        
	        {
	            cartes[i] = carte;
	        }
	    }
	 
	    public void afficher() 
	    
	    {
	        for (int i = 0; i < nombreCartes; ++i) 
	        
	        {
	            if (cartes[i] != null) 
	            
	            {
	                cartes[i].afficher();
	            }
	        }
	   }
	}