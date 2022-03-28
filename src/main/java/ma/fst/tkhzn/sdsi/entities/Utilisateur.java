package ma.fst.tkhzn.sdsi.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@Data @NoArgsConstructor @AllArgsConstructor @ToString

@Inheritance(strategy = InheritanceType.JOINED)
public class Utilisateur implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id @Column(length = 150)
    private String login;
	private String nom;
	private String prenom;
	private String pwd;
	private Boolean active;	
	
	
	//constructeur
	public Utilisateur(String login,  String nom, String prenom, String pwd,Boolean act) {
		super();
		this.login = login;
		this.nom = nom;
		this.prenom = prenom;
		this.pwd = pwd;
		this.active=act;
	}

	@ManyToOne
	@JoinColumn(name="idDep", insertable=false,updatable=false )
	private Departement departement;
	
	
//	@OneToMany(mappedBy = "Personne_dep")
//	private Collection<affectation> affectations;
	
//	@OneToMany(mappedBy = "iduser")
//	private Collection<Role> roles;
	
	
	
}
