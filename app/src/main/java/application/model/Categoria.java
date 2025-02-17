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
import jakarta.persistence.*;

@Entity
@Table(name = "categorias")

public class Categoria{
    @id
    @GeneratedValue(strategy = GenerationType.INDENTITY)
    private long id;
    @Column (unique=true, nullable=false)
    private String nome;

    @OneToMany(mappedBy = "categoria")
    private Set<Jogo> jogos = new HashSet<>;

    public long getId(){
        return id;
    }

    public void setId(long id){
        this.id = id;
    }

    public String getNome(){
        return nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public Set<Jogo> getJogos(){
        return jogos;
    }

    public void setJogos(Set<Jogo> jogos){
        this.jogos = jogos;
    }
}