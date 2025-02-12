package application.model;
import java.util.HashSet;
import java.util.set;
//import jakarta.persistence.Column;
//import jakarta.persistence.Entity;
//import jakarta.persistence.id;
//import jakarta.persistence.Table;
//import jakarta.persistence.GenerationType;
//import jakarta.persistence.GeneratedValue;
//import jakarta.persistence.OneToMany;

@Entity
@Table(name = "categorias")
import jakarta.persistence.*;
public class Categoria{
    @id
    @GeneratedValue(strategy = GenerationType.INDENTITY)
    private long id;
    @Column (unique=true, nullable=false)

    private String nome;
}