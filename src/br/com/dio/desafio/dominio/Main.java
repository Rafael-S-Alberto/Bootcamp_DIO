package br.com.dio.desafio.dominio;

import java.time.LocalDate;

public class Main {

	public static void main(String[] args) {
		Curso curso1 = new Curso();
		curso1.setTitulo("curso java");
		curso1.setDescricao("descricao curso java");
		curso1.setCargaHoraria(8);

		Curso curso2 = new Curso();
		curso2.setTitulo("curso JS");
		curso2.setDescricao("descricao curso JS");
		curso2.setCargaHoraria(6);
		
		
		Mentoria mentoria = new Mentoria();
		mentoria.setTitulo("mentoria de java");
		mentoria.setDescricao("descricao mentoria java");
		mentoria.setData(LocalDate.now());
		
		/*System.out.println(curso1);
		System.out.println(curso2);
		System.out.println(mentoria);*/

		Bootcamp bootcamp2 = new Bootcamp();
		bootcamp2.setNome ("Bootcamp PHP");
		bootcamp2.setDescricao ("Descricao do Bootcamp Javascript");
		bootcamp2.getConteudos().add(curso1);
		bootcamp2.getConteudos().add(mentoria);
		
		Bootcamp bootcamp = new Bootcamp();
		bootcamp.setNome ("Bootcamp java");
		bootcamp.setDescricao ("Descricao do Bootcamp JAVA");
		bootcamp.getConteudos().add(curso1);
		bootcamp.getConteudos().add(curso2);
		bootcamp.getConteudos().add(mentoria);
		
		Dev devRafael = new Dev();
		devRafael.setNome("Rafael");
		devRafael.inscreverBootcamp(bootcamp);
		System.out.println("Conteudos inscritos de "+devRafael.getNome()+": " +devRafael.getConteudosInscritos());
		devRafael.progredir();
		devRafael.progredir();
		devRafael.progredir();
		System.out.println("Conteudos inscritos de "+devRafael.getNome()+": " +devRafael.getConteudosInscritos());
		System.out.println("Consteudos concluidos de "+devRafael.getNome()+": " +devRafael.getConteudosConcluidos());
		System.out.println("XP atual: "+ devRafael.calcularXp());
		
		System.out.println();
		
		Dev devPaloma = new Dev();
		devPaloma.setNome("Paloma");
		devPaloma.inscreverBootcamp(bootcamp2);
		System.out.println("Conteudos inscritos de "+devPaloma.getNome()+": " +devPaloma.getConteudosInscritos());
		devPaloma.progredir();
		System.out.println("Conteudos inscritos de "+devPaloma.getNome()+": " +devPaloma.getConteudosInscritos());
		System.out.println("Consteudos concluidos de "+devPaloma.getNome()+": " +devPaloma.getConteudosConcluidos());	
		System.out.println("XP atual: "+ devPaloma.calcularXp());
	}
}
