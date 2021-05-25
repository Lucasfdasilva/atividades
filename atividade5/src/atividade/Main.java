package atividade;

import java.util.ArrayList;

public class Main {
	
	public static void main(String[] args) {
		
		ArrayList<Pessoa> pessoas = new ArrayList<Pessoa>();
		
			Estudante estudante01 = new Estudante("Enzo", "Le parque");
			estudante01.addCursoNota("Matematica", 2);
			estudante01.addCursoNota("Portugues", 3);
			
			Estudante estudante02 = new Estudante("Luana", "Vila formosa");
			estudante02.addCursoNota("Historia", 7);
			estudante02.addCursoNota("Matematica", 7);
			estudante02.addCursoNota("Portugues", 10);
			
			Estudante estudante03 = new Estudante("Jorginho", "Ibura");
			estudante03.addCursoNota("Matematica", 7);
			estudante03.addCursoNota("Portugues", 5);
			estudante03.addCursoNota("Historia", 9);
			estudante03.addCursoNota("Geografia", 1);
			
			Estudante estudante04 = new Estudante("Lucas", "California");
			estudante04.addCursoNota("Matematica", 10);
			estudante04.addCursoNota("Portugues", 10);
			estudante04.addCursoNota("Historia", 10);
			estudante04.addCursoNota("Geografia", 10);
			
			pessoas.add(estudante01);
			pessoas.add(estudante02);
			pessoas.add(estudante03);
			pessoas.add(estudante04);

			Professor  professor01 = new Professor("Diego", "Boa Viagem");
			professor01.addCurso("geografia");
			professor01.addCurso("historia");
			
			Professor professor02 = new Professor("Abner", "Casa amarela");
			professor02.addCurso("matematica");
			professor02.addCurso("portugues");
			
			pessoas.add(professor01);
			pessoas.add(professor02);
			
	
			for(int i = 0; i<pessoas.size(); i++) {
				String str = pessoas.get(i).toString();
				System.out.println(str);
			}
			
			String test = pessoasData(pessoas);
			System.out.println("##########################");
			System.out.println("----------Cursos----------");
			System.out.println("##########################");
			System.out.println("                          ");
			System.out.println(test);
			
	}
	
	private static String pessoasData(ArrayList<Pessoa> pessoas) {
		
		Professor professor = new Professor(null, null);
		Estudante estudante = new Estudante(null, null);
		String out = "";
		
			
			for(int i = 0; i< pessoas.size(); i++) {
					
				 if(professor.getClass() == pessoas.get(i).getClass()) {
					 Professor teacher = (Professor) pessoas.get(i);
					 
					 for(int y = 0; y < teacher.getCursos().size(); y++) {
						out += "Curso: "+ teacher.getCursos().get(y)+"\n";
						out += "Professor: " + teacher.getNome()+"\n";
						out += "Alunos: \n";
								
							for(int z = 0; z < pessoas.size(); z++) {
								
								if(estudante.getClass() == pessoas.get(z).getClass()) {
									Estudante student = (Estudante) pessoas.get(z);
									
									for(int x = 0; x < student.getCursos().size(); x++) {
										
										if(student.getCursos().get(x).equals(teacher.getCursos().get(y))) {
											out += student.getNome()+"\n";
										}
									}
								}
							}
							out +="------------------------- \n";
					 }
				 }
			}
			
			return out;
	}

}
