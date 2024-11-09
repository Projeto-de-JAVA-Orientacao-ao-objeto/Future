package future.project.future.model;

import org.hibernate.annotations.NotFound;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Usuario {
    
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private long id;
    @NotFound
    private String nome;
    @NotFound
    private String email;
    @NotFound
    private String senha;
    @NotFound
    private String tipo;
    @NotFound
    private int ativo;



}
