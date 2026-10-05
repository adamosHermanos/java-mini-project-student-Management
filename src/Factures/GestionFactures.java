package Factures;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class GestionFactures implements IGestionFacture {
	private IDAOFactures idaoFactures;
	
	//or this constructor
	/*public GestionFactures (IDAOFactures dao) {
		this.idaoFactures=dao; //this.idaoFactures=idaoFactures; but the variable in the parameter idaoFactures
	}*/
	
	public void enregistrer (Facture f) {
		
		
	}
}
