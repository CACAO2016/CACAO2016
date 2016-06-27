package abstraction.equipe6;

import java.util.Arrays;

import java.util.HashMap;
import java.util.List;

import abstraction.commun.CommandeDistri;
import abstraction.commun.ITransformateurD;
import abstraction.commun.Produit;

//Dans cette classe on définit un constructeur (et ses accesseurs) PrixVente qui va servir pour la méthode setPrix dans la classe Carrefour

public class PrixVente {

	private Double prix;
	private ITransformateurD transformateur;

	private Produit nomproduit;
	
	public PrixVente(Double prix, Produit nomproduit, ITransformateurD transf ){
		this.prix=prix;
		this.nomproduit=nomproduit;
		this.transformateur =transf;
	}

	public Double getPrixVente(){
		return this.prix;
	}
	public ITransformateurD getTransformateur() {
		return this.transformateur;
	}
	public Produit getProduit(){
		return this.nomproduit;
	}
	public void setPrix(Double prix) {
		this.prix = prix;
	}
	public void setTransformateur(ITransformateurD transformateur) {
		this.transformateur = transformateur;
	}
	public void setNomproduit(Produit nomproduit) {
		this.nomproduit = nomproduit;
	}



	
		   
		
			

		
	
	}
	

	
	


