package ma.fst.tkhzn.sdsi.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class affectation implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
    private String date_affectation;
    //hinndddddd
    
    @Id
    @ManyToOne Utilisateur Personne_dep;
    
    @Id
    @ManyToOne Ressource code_ressource;
    
}
