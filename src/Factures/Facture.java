package Factures;

import java.time.LocalDate;
import java.util.List;

import lombok.Getter;
@Getter
public class Facture {
	private String numero;
	private LocalDate dateCreation;
	private double montant;
	private Client proprietaire;//  Une facture appartient a 1 client
	private List<Reglement> reglements;// Une facture peut avoir plusieurs règlements
}
