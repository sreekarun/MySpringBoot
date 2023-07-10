//package com.kailas.mm.configuration;
//
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.security.core.userdetails.User;
//import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
//import org.springframework.security.crypto.password.PasswordEncoder;
//import org.springframework.security.provisioning.InMemoryUserDetailsManager;
//
//@Configuration
//public class WebSecurityConfiguration  {
//    @Bean
//    public InMemoryUserDetailsManager test() {
//        return new InMemoryUserDetailsManager(User.withUsername("digestsiva").password(passwordEncoder().encode("secret")).roles("USER").build(),
//                User.withUsername("admin").password(passwordEncoder().encode("secret")).roles("ADMIN").build());
//    }
//    @Bean
//    public PasswordEncoder passwordEncoder() {
//        return new BCryptPasswordEncoder();
//
//       // return NoOpPasswordEncoder.getInstance();
//    }
//
//}
