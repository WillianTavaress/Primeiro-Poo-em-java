package escolapoo;

import escola.Disciplina;
import escola.Professor;

public class AssociacaoMuitosParaMuitos {

	public static void main(String[] args) {
		
		Disciplina disciplina1 = new Disciplina ();
		disciplina1.setNome("Matematica");
		disciplina1.setCargaHoraria(80);
		
		Disciplina disciplina2 = new Disciplina ();
		disciplina2.setNome("Portugues");
		disciplina2.setCargaHoraria(80);
		
		Professor professor1 = new Professor();
		professor1.setNome("Jose");
		professor1.setMatricula(2236);
		professor1.setFormacaoAcademica("Graduacao");
		professor1.setSalario(1000);
		
		Professor professor2 = new Professor();
		professor2.setNome("Maria");
		professor2.setMatricula(4545);
		professor2.setFormacaoAcademica("Graduacao");
		professor2.setSalario(1500);
		
		//relacao jose matematica
		professor1.adicionarDisciplina(disciplina1);
		disciplina1.adicionarProfessor(professor1);
		
		//relacao jose com portugues
		professor1.adicionarDisciplina(disciplina2);
		disciplina2.adicionarProfessor(professor1);
		
		//relaco maria portugues
		professor2.adicionarDisciplina(disciplina2);
		disciplina2.adicionarProfessor(professor2);
		
		//Listar as disciplina do prof jose
		System.out.println("Disciplinas do Jose");
		for(int i =0; 1< professor1.quantidadeDisciplinas(); ++i ) {
			Disciplina disciplina = professor1.getDisciplina(i);
			System.out.println(disciplina.getNome());
		}	
		System.out.println("Professor de Portugues");	
		for(int i=0; 1< disciplina2.quantidadeProfessores(); ++i ) {
			System.out.println(disciplina2.getProfessor(i));
		}
		 
		}
		
	}


