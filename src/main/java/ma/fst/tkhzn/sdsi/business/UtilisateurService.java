//package ma.fst.tkhzn.sdsi.business;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//import ma.fst.tkhzn.sdsi.entities.Utilisateur;
//import ma.fst.tkhzn.sdsi.repositories.UtilisateurResository;
//
//@Service
//public class UtilisateurService {
//		
//		@Autowired
//		private UtilisateurResository uttilisateurRepository;
//		
//		public Utilisateur getUtilisateur(String Cin){
//			if(uttilisateurRepository.findById(Cin).isPresent())
//			   return uttilisateurRepository.findById(Cin).get();
//			else
//				return null;
//		}
//	} 
//
