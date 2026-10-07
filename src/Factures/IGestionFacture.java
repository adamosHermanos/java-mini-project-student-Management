package Factures;

import java.util.Optional;

public interface IGestionFacture {
	
		public void enregistrer(Facture f);
		public Optional<Facture> chercherParNumero(String nemero);
		public void afficheReg(Facture f);
}
