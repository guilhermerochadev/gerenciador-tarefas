package br.com.api.gerenciador.tarefas.entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.util.List;

@Entity
@Table(name = "roles")
@Data
@Getter
@Setter
public class Role  implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private  Long id;

    @Column(unique = true, length = 20)
    private String nomePermissao;

    @ManyToMany(mappedBy = "roles")
    private List<Usuario> usuarios;
}
