 package ma.fst.tkhzn.sdsi;


import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;


@Configuration 
@EnableWebSecurity
public class ApplicationSecurityConfig extends WebSecurityConfigurerAdapter {

//	@Autowired 
//	UserDetailsService userDetailsService;
//	
	@Autowired
	private DataSource dataSource;
//	@Override
//	protected void configure(HttpSecurity http) throws Exception {
//
//		http.authorizeRequests()
//		.antMatchers("/asset/**","/css/**","/img/**","/js/**","/icons/**").permitAll()
//		.antMatchers("/admin/**").hasAuthority("ADMIN")
//		.antMatchers("/superviseur/**").hasAuthority("SUPERVISEUR")
//		.antMatchers("/developpeur/**").hasAuthority("DEVELOPPEUR")
//		.antMatchers("/reset_password","/message").permitAll()
//		.antMatchers("/forgotpass","/gantt","/07_jquery","/api/tasks","/").permitAll()
//		.anyRequest().authenticated()
//		.and().csrf().disable()
//		.formLogin().loginPage("/login4").usernameParameter("username")
//		.passwordParameter("password")
////		 .successHandler(successHandler)
//		 .permitAll()
//		.and()
//		.logout()
//		.logoutSuccessHandler(new LogoutSuccessHandler() {
//			
//			@Override
//			public void onLogoutSuccess(HttpServletRequest request,
//					HttpServletResponse response,Authentication authentication) throws IOException,ServletException {
//				System.out.println("The user"+authentication.getName() + "has logged out .");
//				
//				UrlPathHelper helper = new UrlPathHelper();
//				String context = helper.getContextPath(request);
//				response.sendRedirect(context +"/login4");
//			}
//		})
//		.permitAll()
//		.and()
//		.rememberMe()
//		    .key("AbcdefghiJKLmnoPqrsut0125847963")
//		    .tokenValiditySeconds(3 * 24 * 60 * 60)
//		.and()
//		.exceptionHandling().accessDeniedPage("/403");
//	
//	}

	@Autowired
//    private LoginSuccessHandler successHandler;
	
	
	
//	public DaoAuthenticationProvider authenticationProvider() {
//		DaoAuthenticationProvider authProvider = new DaoAuthenticationProvider();
//	    authProvider.setUserDetailsService(userDetailsService);
//	    authProvider.setPasswordEncoder(getPasswordEncoder());
//	    
//	    return authProvider;
//	}
	
	
	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
//		auth.authenticationProvider(authenticationProvider());
//		auth.inMemoryAuthentication()
//		.withUser("diallo").password("{noop}merci").roles("admin", "user");
//		auth.inMemoryAuthentication()
//		.withUser("show").password("{noop}merci").roles("user");
		 auth.jdbcAuthentication()
		.dataSource(dataSource)
		.usersByUsernameQuery("select login as principal,pwd as credentials,active from Utilisateur where login =?")
		.authoritiesByUsernameQuery("select user as principal,role as role from Role where user=?")
		.passwordEncoder(new BCryptPasswordEncoder())
		.rolePrefix("ROLE_");
	}
//        
//		auth.jdbcAuthentication()
//		.dataSource(dataSource)
//		.passwordEncoder(getPasswordEncoder())
//		.usersByUsernameQuery("select username,password,active from User where username =?")
//		.authoritiesByUsernameQuery("select username,role from User where username=?");
//		
//		//auth.userDetailsService(userDetailsService);
//		
//		
//	}

//	@Bean
//	public PasswordEncoder getPasswordEncoder() {
//		return new BCryptPasswordEncoder();
//	}
	
}