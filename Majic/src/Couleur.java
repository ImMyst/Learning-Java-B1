class Couleur 
		
		{
		
	    private char valeur;
	 
	    public Couleur(char c)
	    
	    {
	        valeur = c;
	    }
	 
	    public void afficher()
	    
	    	{
	        switch (valeur) 
	        
	        {
	        case 'B':
	            System.out.println("blanc");
	            break;
	        case 'b':
	            System.out.print("bleu");
	            break;
	        case 'n':
	            System.out.print("noir");
	            break;
	        case 'r':
	            System.out.print("rouge");
	            break;
	        case 'v':
	            System.out.print("vert");

	         }
	            
	           
	        }
	    
	}
	
	 