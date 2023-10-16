package entidades;

import javax.persistence.*;


@Entity
@Table(name = "Aluno")
public class Aluno {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "aluno_id")
	private int alunoId;
	
	@Column(name = "matriculaAluno", unique = true)
	private String matriculaAluno;
	
	@Column(name = "nome")
	private String nome;
	
	// Construtores, getters e setters
	public Aluno(){}
	public Aluno(int alunoId,String matriculaAluno,String nome) {
		super();
		this.alunoId = alunoId;
		this.matriculaAluno = matriculaAluno;
		this.nome = nome;
	}
}







