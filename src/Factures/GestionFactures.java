package Factures;

import java.util.Optional;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class GestionFactures implements IGestionFacture {
	private IDAOFactures idaoFactures;
	
	//or this constructor
	/*public GestionFactures (IDAOFactures dao) {
		this.idaoFactures=dao; //this.idaoFactures=idaoFactures; but the variable in the parameter idaoFactures
	}*/
	
	public void enregistrer (Facture f) {
		
		Optional<Facture> d = idaoFactures.findByNumber(f.getNumero());
		if(d.isPresent()) {
			System.out.println("facture deja exist");
		}
		else {
			idaoFactures.save(f);
			System.out.println("saver");
		}
	}
}
