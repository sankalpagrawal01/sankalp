package com.sankalp.app.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
public class StudentSecurity extends WebSecurityConfigurerAdapter {

    @Override
    protected void configure(HttpSecurity http) throws Exception{
        http.httpBasic().and().authorizeRequests()
                .antMatchers(HttpMethod.POST, "/save/student").hasAnyRole("STUDENT")
                .antMatchers(HttpMethod.PUT, "/update/student").hasAnyRole("ADMIN")
                .antMatchers(HttpMethod.GET, "/get/student").hasAnyRole("LECTURER")
                .antMatchers(HttpMethod.DELETE, "/remove/student").hasAnyRole("ADMIN").and().csrf().disable().headers()
                .frameOptions().disable();
    }

    @Autowired
    public void configureGlobal(AuthenticationManagerBuilder auth) throws Exception{
        auth.inMemoryAuthentication().withUser("stud123").password("{noop}password").roles("STUDENT").and()
                .withUser("admin123").password("{noop}password").roles("ADMIN").and().withUser("lect123")
                .password("{noop}password").roles("LECTURER").and().withUser("sankalp").password("{noop}password")
                .roles("ADMIN");
    }
}
