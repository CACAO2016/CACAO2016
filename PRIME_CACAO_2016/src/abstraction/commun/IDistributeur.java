package abstraction.commun;
import java.util.HashMap;
import java.util.List;
import java.util.List;

public interface IDistributeur {	
	
	/** 
	 * @deprecated
	 */
	public double getDemande(ITransformateur t);
	// Rajouter une variable delais de livraisons

	/**
	 * @deprecated
	 * @return
	 */
	public double getPrix();
	
	public List<CommandeDistri> LivraisonEffective(List<CommandeDistri> liste);

	public List<CommandeDistri> Demande (HashMap<ITransformateur, Catalogue > d);
	
	public List<CommandeDistri> ContreDemande (List<CommandeDistri> cd);

	public List<CommandeDistri> CommandeFinale(List<CommandeDistri> cf);
	

}
