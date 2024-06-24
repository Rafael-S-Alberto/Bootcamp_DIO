package br.com.dio.desafio.dominio;

public class Curso extends Conteudo {
	// ATRIBUTOS ---------------------------------------------------------
	private int 	cargaHoraria;
	
	// CONSTRUTORES ------------------------------------------------------
	public Curso() {
	}
		
	// SETTERS AND GETTERS -----------------------------------------------
	public int getCargaHoraria() {
		return cargaHoraria;
	}
	public void setCargaHoraria(int cargaHoraria) {
		this.cargaHoraria = cargaHoraria;
	}
	
	// TO STRING ---------------------------------------------------------
	public String toString() {
		return "Curso [titulo=" + getTitulo() + ", descricao=" + getDescricao() + ", cargaHoraria=" + cargaHoraria + "]";
	}
	
	// METODOS -----------------------------------------------------------
	public double calcularXP() {
		return XP_PADRAO * cargaHoraria;
	}
}
