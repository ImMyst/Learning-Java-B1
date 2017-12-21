class main1 {
	    public static void main(String[] args) {
	    	// TODO Auto-generated method stub
	    	
	        Deck maMain = new Deck(10);
	 
	        maMain.piocher(new Terrain('b'));
	        maMain.piocher(new Creature(10, "C'thun", 6, 6));
	        maMain.piocher(new Sortilege(4, "Balayage",
	                "Inglige 4 points de dégâts à un adversaire et 1 point de dégât à tous les autres adversaires"));
	 
	        System.out.println("Contenu de ma main : ");
	        maMain.afficher();
	        maMain.joue();
	    }
}
 
	