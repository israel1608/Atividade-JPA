package entidades;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;

import util.GeradorID;
import util.pegarData;

@Entity
@Table(name = "Emprestimo")
public class Emprestimo {
	@Id
//	@GeneratedValue(strategy= GenerationType.AUTO) 	
	private int emprestimo_id = GeradorID.geraNumeroID();;
	

 //   @JoinColumn(name = "aluno_id")
    private int aluno_id;


  //  @JoinColumn(name = "codigoPub")
    private int codigoPub;
    
    private String data_emprestimo = pegarData.obterDataHoraAtualComoString();

	public Emprestimo() {}	
	public Emprestimo(int aluno_id,int codigoPub) {
		super();
		this.aluno_id = aluno_id;
		this.codigoPub = codigoPub;

	}
	
    // getters e setters
	public void setId(int emprestimo_id) {
		this.emprestimo_id = emprestimo_id;
	}
	
	public long getId() {
		return emprestimo_id;
	}

	public void setAlunoId(int aluno_id) {
		this.aluno_id = aluno_id;
	}
	
	public long getAlunoId() {
		return aluno_id;
	}
	
	public void setCodigoPub(int codigoPub) {
		this.codigoPub = codigoPub;
	}
	
	public long getCodigoPub() {
		return codigoPub;
	}
	public String getData_emprestimo() {
		return data_emprestimo;
	}
	public void setData_emprestimo(String data_emprestimo) {
		this.data_emprestimo = data_emprestimo;
	}


}
