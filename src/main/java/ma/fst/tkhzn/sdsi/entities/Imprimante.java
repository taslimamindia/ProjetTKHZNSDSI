package ma.fst.tkhzn.sdsi.entities;

import java.io.Serializable;

import javax.persistence.Entity;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@NoArgsConstructor @AllArgsConstructor @ToString
 
public class Imprimante extends Ressource implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String Marque;
	private float Resolution;
	private float vitesse;
	
	
	
	//constructeur
	
}
