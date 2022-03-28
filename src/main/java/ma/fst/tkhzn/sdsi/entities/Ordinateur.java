package ma.fst.tkhzn.sdsi.entities;

import java.io.Serializable;

import javax.persistence.Entity;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@NoArgsConstructor @AllArgsConstructor @ToString
 
public class Ordinateur extends Ressource implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String CPU;
	private int dd;
	private float Ecran;
	private String Marque;
	private int RAM;
	

	//constructeur
	
}
