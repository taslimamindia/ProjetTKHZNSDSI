package ma.fst.tkhzn.sdsi.business;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import ma.fst.tkhzn.sdsi.entities.Role;
import ma.fst.tkhzn.sdsi.entities.Utilisateur;
import ma.fst.tkhzn.sdsi.repositories.RoleRepository;
import ma.fst.tkhzn.sdsi.repositories.UtilisateurResository;



@RestController
@RequestMapping(value = {"api/userservice"})
@CrossOrigin("*")
public class UserService {
	
	@Autowired
	private UtilisateurResository iUserRepository;
	@Autowired
	private RoleRepository roleRepository;
	
	@RequestMapping(path = "/users", method = RequestMethod.GET)
	public List<Utilisateur> users() {
		return iUserRepository.findAll();
	}
	
	@RequestMapping(path = "/addusers", method = RequestMethod.POST)
	public void addUser(HttpServletRequest req) {
		BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
		String login = req.getParameter("login");
		String pwd = req.getParameter("pwd");
	    pwd = encoder.encode(pwd);
		String prenom = req.getParameter("prenom");
		String nom = req.getParameter("nom");
		String role = req.getParameter("role");
		
		iUserRepository.save(new Utilisateur(login,nom,prenom,pwd,true));
		roleRepository.save(new Role(role,iUserRepository.findByLogin(login)));
	}
	
	
}
