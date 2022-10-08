package br.com.dio.desafio;

import java.time.LocalDate;

import br.com.dio.desafio.dominio.BootCamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

public class Main {

	public static void main(String[] args) {

		Curso curso1 = new Curso("Curso Java", "Descrição Curso Java", 5);

		Curso curso2 = new Curso("Curso JS", "Descrição Curso JS", 4);

		Mentoria mentoria1 = new Mentoria("Mentoria de Java", "Descricao Mentoria Java", LocalDate.now());

		Mentoria mentoria2 = new Mentoria("Mentoria de JS", "Descricao Mentoria JS", LocalDate.parse("2022-12-03"));

		BootCamp bc = new BootCamp("BootCamp Java", "BootCamp Java Descricao");
		bc.getConteudos().add(curso1);
		bc.getConteudos().add(curso2);
		bc.getConteudos().add(mentoria1);
		bc.getConteudos().add(mentoria2);

		Dev dev1 = new Dev("Lucas Andrade");

		dev1.inscreverBootcamp(bc);

		System.out.println("Conteúdos Inscritos Lucas:\n " + dev1.getConteudosInscritos());
		dev1.progedir();
		System.out.println("Conteudos Concluidos Lucas:\n " + dev1.getConteudosConcluidos());
		System.out.println("________________________________");
		System.out.println("Conteúdos Inscritos após progredir:\n " + dev1.getConteudosInscritos());
		System.out.println("XP Lucas: " + dev1.calcularXp());
		System.out.println("________________________________");

		Dev dev2 = new Dev("Julia Bernardo");

		dev2.inscreverBootcamp(bc);

		System.out.println("Conteúdos Inscritos Julia:\n " + dev2.getConteudosInscritos());
		dev2.progedir();
		dev2.progedir();
		dev2.progedir();
		dev2.progedir();
		
		System.out.println("Conteudos Concluidos Julia:\n " + dev2.getConteudosConcluidos());
		System.out.println("________________________________");
		System.out.println("Conteúdos Inscritos após progredir:\n " + dev2.getConteudosInscritos());
		System.out.println("XP Julia: " + dev2.calcularXp());
		System.out.println("________________________________");

	}

}
