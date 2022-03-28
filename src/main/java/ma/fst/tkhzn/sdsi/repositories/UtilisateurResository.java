package ma.fst.tkhzn.sdsi.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import ma.fst.tkhzn.sdsi.entities.Utilisateur;


@Repository
public interface UtilisateurResository extends JpaRepository<Utilisateur, String>{

	Utilisateur findByLogin(String Login);

}
