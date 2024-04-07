package Security;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http
                .authorizeRequests()
                .antMatchers("/api/twitter/**").permitAll() // Allow access to Twitter API endpoints without authentication
                .anyRequest().authenticated() // Require authentication for all other endpoints
                .and()
                .csrf().disable(); // Disable CSRF protection for simplicity (you may want to enable it in a production environment)
    }
}


