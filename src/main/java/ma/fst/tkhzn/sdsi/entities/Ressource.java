package ma.fst.tkhzn.sdsi.entities;

import java.io.Serializable;
import java.util.Collection;


import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@Data @NoArgsConstructor @ToString @AllArgsConstructor
@Inheritance(strategy = InheritanceType.JOINED)
public class Ressource implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	private int code;
	private int DateLiv;
	private int DureeGarantie;
	
	@ManyToOne
	@JoinColumn(name="fournisseur", insertable=false,updatable=false )
	private Fournisseur fournisseur;
	
	@ManyToOne
	@JoinColumn(name="responsable", insertable=false,updatable=false )
	private Utilisateur responsable;
	
	@OneToMany(mappedBy = "code_ressource")
	private Collection<affectation> affectations;

//	@ManyToMany(mappedBy="ressource", fetch = FetchType.EAGER)
//	private Collection<Utilisateur> personnel= new ArrayList<>();
	
//	  @ManyToMany
//	  @JoinTable(
//			  name="affectation", 
//	          joinColumns= @JoinColumn(name="code_ressource"), 
//	          inverseJoinColumns = @JoinColumn(name="Personne_dep"))
//	  Set<Utilisateur> personnel = new HashSet<>();
	
}
