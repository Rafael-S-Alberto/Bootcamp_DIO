package br.com.dio.desafio.dominio;

import java.time.LocalDate;

public class Mentoria extends Conteudo {
	// ATRIBUTOS ----------------------------------------------------------
	
	LocalDate data;
	
	// CONSTRUTORES ------------------------------------------------
	public Mentoria() {
	}
	
	// GETTERS AND SETTERS ------------------------------------------------
	
	public LocalDate getData() {
		return data;
	}
	public void setData(LocalDate data) {
		this.data = data;
	}
	
	// TO STRING -----------------------------------------------------------
	public String toString() {
		return "Mentoria [titulo=" + getTitulo() + ", descricao=" + getDescricao() + ", data=" + data + "]";
	}
	
	// METODOS -------------------------------------------------------------
	@Override
	public double calcularXP() {
		return XP_PADRAO + 20d;
	}
	
}
