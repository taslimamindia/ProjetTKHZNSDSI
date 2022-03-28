package ma.fst.tkhzn.sdsi.entities;

import java.io.Serializable;

import javax.persistence.Entity;


import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@NoArgsConstructor @AllArgsConstructor @ToString
public class Fournisseur extends Utilisateur implements Serializable{
	
	private static final long serialVersionUID = 1L;

	
	private String mail;
	
	private String gerant;
	private String lieu;
	private String NomSocite;
	
	
	
//	//Constructeur
//	public Fournisseur(String CIN, String role, String nom, String prenom, String pwd, String mail,
//			String gerant, String lieu, String nomSocite) {
//		super(CIN,  nom, prenom, pwd);
//		this.mail = mail;
//		this.gerant = gerant;
//		this.lieu = lieu;
//		this.NomSocite = nomSocite;
//	}
}
