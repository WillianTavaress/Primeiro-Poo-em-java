package escola;

import java.util.ArrayList;

public class Disciplina {
	
	private int cargaHoraria;
	private String nome;
	
	private ArrayList<Professor> professores;
	private ArrayList<Turma> turmas;
	
	public Disciplina() {
		professores = new ArrayList<Professor>();
	}
	
	public void adicionarProfessor(Professor professor) {
		professores.add(professor);
	}
	
	public void excluirProfessor(Professor professor) {
		professores.remove(professor);
	}
	
	public int quantidadeProfessores() {
		return professores.size();
	}
	
	public Professor getProfessor(int posicao) {
		return professores.get(posicao);
	}
	
	public int getCargaHoraria() {
		return cargaHoraria;
	}
	public void setCargaHoraria(int cargaHoraria) {
		if(cargaHoraria >= 0) {
		this.cargaHoraria = cargaHoraria;
		}
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}	
	
}
