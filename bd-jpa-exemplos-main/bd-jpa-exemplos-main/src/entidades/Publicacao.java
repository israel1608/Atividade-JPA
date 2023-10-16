package entidades;
import javax.persistence.*;

@Entity
@Table(name = "Publicacao")
public class Publicacao {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "codigoPub")
    private int codigoPub;

    @Column(name = "titulo")
    private String titulo;

    @Column(name = "ano")
    private int ano;

    @Column(name = "autor")
    private String autor;

    @Column(name = "tipo")
    private String tipo;

    // Construtores, getters e setters
    public Publicacao() {}
    public Publicacao(int codigoPub,String titulo,int ano,String tipo) {
		super();
		this.codigoPub = codigoPub;
		this.titulo = titulo;
		this.ano = ano;
		this.tipo = tipo;

	}
    public int getCodigoPub() {
    	return codigoPub;
}
    public void setCodigoPub(int codigoPub) {
		this.codigoPub = codigoPub;
	}
    
    public String getTitulo() {
		return titulo;
	}
    public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
    
    public int getAno() {
  		return ano;
  	}
    
    public void setAno(int ano) {
		this.ano = ano;
	}
    
    public String getAutor() {
		return autor;
	}
    public void setAutor(String autor) {
		this.autor = autor;
	}
    
    public String getTipo() {
		return tipo;
	}
    public void setTipo(String tipo) {
		this.tipo = tipo;
	}
}
