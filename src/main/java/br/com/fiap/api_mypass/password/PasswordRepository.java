package br.com.fiap.api_mypass.password;

import org.springframework.data.jpa.repository.JpaRepository;

public interface PasswordRepository extends JpaRepository<Password, Long> {
    
}
