package escolapoo;

import escola.Turma;
import escola.Aluno;
import java.util.Date;

public class AssociacaoParaUm {

	public static void main(String[] args) {
		
		Turma turma1 = new Turma();
		turma1.setAno(1);
		turma1.setSigla("1A");
		
		Aluno aluno1 = new Aluno();
		aluno1.setNome("Jao");
		aluno1.setMatricula(123);
		aluno1.setDataNascimento(new Date());
		aluno1.setTurma(turma1);
		turma1.adicionarAluno(aluno1);
		
		Aluno aluno2 = new Aluno();
		aluno2.setNome("Ze");
		aluno2.setMatricula(999);
		aluno2.setDataNascimento(new Date());
		aluno2.setTurma(turma1);
		turma1.adicionarAluno(aluno2);
		
		System.out.println("Dados do Aluno");
		System.out.println(aluno1.getNome());
		System.out.println(aluno1.getTurma().getSigla());
		
		System.out.println("Alunos da Turma");
		 for(int i =0; i < turma1.quantidadeAlunos(); i++) {
		 	System.out.println(turma1.getAluno(i).getNome());
		 }
	}

}
