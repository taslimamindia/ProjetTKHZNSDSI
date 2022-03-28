package ma.fst.tkhzn.sdsi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@SpringBootApplication
public class ProjetTkhznSdsiApplication {

	public static void main(String[] args) {
		BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
		String rawPassword = "1234";
		String encodedPassword = encoder.encode(rawPassword);
		
		System.out.println(encodedPassword);
		SpringApplication.run(ProjetTkhznSdsiApplication.class, args);
	}
    
	
}
