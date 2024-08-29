package br.com.fiap.api_mypass.password;

import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class PasswordService {
    private final PasswordRepository passwordRepository;

    public PasswordService(PasswordRepository passwordRepository) {
        this.passwordRepository = passwordRepository;
    }

    public List<Password> findAll(){
        return passwordRepository.findAll();
    }

}