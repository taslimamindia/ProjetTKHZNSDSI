package ma.fst.tkhzn.sdsi.entities;


import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Table 
@Entity
@Data @AllArgsConstructor @NoArgsConstructor
public class Role implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	
	@Id @Column(length = 150) @GeneratedValue(strategy = GenerationType.IDENTITY)
	Long id;
	String role;
	
	
	@ManyToOne
	@JoinColumn(name="user", insertable=false,updatable=false )
	private Utilisateur iduser;
	
	public Role(String role,Utilisateur user) {
		this.role=role;
		this.iduser=user;
	}
}
