//package com.ejemplo_uno.config;
//
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.security.config.Customizer;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.core.userdetails.User;
//import org.springframework.security.core.userdetails.UserDetails;
//import org.springframework.security.core.userdetails.UserDetailsService;
//import org.springframework.security.provisioning.InMemoryUserDetailsManager;
//import org.springframework.security.web.SecurityFilterChain;
//
//@Configuration
//public class SecurityConfig {
//
//	@Bean
//    SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
//        http
//            .authorizeHttpRequests(authorize -> authorize
//                .anyRequest().authenticated()
//            )
//            .httpBasic(Customizer.withDefaults());  // Configura la autenticación HTTP básica
//
//        return http.build();
//    }
//
//    @Bean
//    UserDetailsService userDetailsService() {
//	        UserDetails user = User.withUsername("memo")
//	            .password("{noop}admin")
//	            .roles("USER")
//	            .build();
//
//	        return new InMemoryUserDetailsManager(user);
//	    }
//}
