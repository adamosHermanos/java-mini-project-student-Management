package Factures;

import java.time.LocalDate;

public class Facture {
	private String numero;
	private LocalDate dateCreation;
	private double montant;
	private Client proprietaire;//  Une facture appartient a 1 client
}
