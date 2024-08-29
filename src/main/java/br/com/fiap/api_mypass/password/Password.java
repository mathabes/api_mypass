package br.com.fiap.api_mypass.password;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@Table(name = "passwords")
@AllArgsConstructor
@NoArgsConstructor
public class Password {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    String url;
    String username;
    String password;
}
