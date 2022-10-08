package br.com.dio.desafio.dominio;

public class Curso extends Conteudos {

	private Integer cargaHoraria;

	public Curso() {

	}
	
	@Override
	public double calcularXP() {
		// TODO Auto-generated method stub
		return XP_PADRAO * cargaHoraria;
	}

	public Curso(String titulo, String descricao, Integer cargaHoraria) {

		this.cargaHoraria = cargaHoraria;
		setTitulo(titulo);
		setDescricao(descricao);

	}


	public Integer getCargaHoraria() {
		return cargaHoraria;
	}

	public void setCargaHoraria(Integer cargaHoraria) {
		this.cargaHoraria = cargaHoraria;
	}

	@Override
	public String toString() {
		return "Curso [titulo=" + getTitulo() + ", descricao=" + getDescricao() + ", cargaHoraria=" + cargaHoraria
				+ "]\n";
	}



}
