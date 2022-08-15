package br.com.donna.domain;

import java.time.LocalDate;

public class Main {
	public static void main(String[] args) {
		Curso curso1 = new Curso();
		curso1.setTitulo("curso java");
		curso1.setDescricao("descri��o curso java");
		curso1.setCargaHoraria(8);

		Curso curso2 = new Curso();
		curso2.setTitulo("curso js");
		curso2.setDescricao("descri��o curso js");
		curso2.setCargaHoraria(4);

		Mentoria mentoria = new Mentoria();
		mentoria.setTitulo("mentoria de java");
		mentoria.setDescricao("descri��o mentoria java");
		mentoria.setData(LocalDate.now());

		Bootcamp bootcamp = new Bootcamp();
		bootcamp.setNome("Bootcamp Java Developer");
		bootcamp.setDescricao("Descri��o Bootcamp Java Developer");
		bootcamp.getConteudos().add(curso1);
		bootcamp.getConteudos().add(curso2);
		bootcamp.getConteudos().add(mentoria);

		Dev devMaykon = new Dev();
		devMaykon.setNome("Maykon");
		devMaykon.inscreverBootcamp(bootcamp);
		System.out.println("Conte�dos Inscritos Maykon:" + devMaykon.getConteudosInscritos());
		devMaykon.progredir();
		devMaykon.progredir();
		System.out.println("-");
		System.out.println("Conte�dos Inscritos Maykon:" + devMaykon.getConteudosInscritos());
		System.out.println("Conte�dos Conclu�dos Maykon:" + devMaykon.getConteudosConcluidos());
		System.out.println("XP:" + devMaykon.calcularTotalXp());

		System.out.println("-------");

		Dev devGabrielle = new Dev();
		devGabrielle.setNome("Gabrielle");
		devGabrielle.inscreverBootcamp(bootcamp);
		System.out.println("Conte�dos Inscritos Gabrielle:" + devGabrielle.getConteudosInscritos());
		devGabrielle.progredir();
		devGabrielle.progredir();
		devGabrielle.progredir();
		System.out.println("-");
		System.out.println("Conte�dos Inscritos Gabrielle:" + devGabrielle.getConteudosInscritos());
		System.out.println("Conte�dos Concluidos Gabrielle:" + devGabrielle.getConteudosConcluidos());
		System.out.println("XP:" + devGabrielle.calcularTotalXp());
	}
}
