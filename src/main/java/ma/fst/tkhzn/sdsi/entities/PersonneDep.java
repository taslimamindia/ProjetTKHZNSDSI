package ma.fst.tkhzn.sdsi.entities;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;


import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

import lombok.ToString;


@ToString
public class PersonneDep extends Utilisateur implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@ManyToOne
	@JoinColumn(name="idDep", insertable=false,updatable=false )
	private Departement departement;
	
	@ManyToMany(fetch = FetchType.EAGER)
	private Collection<Ressource> ressource= new ArrayList<>();
	
}
