package br.com.dio.desafio.dominio;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Mentoria extends Conteudos{

	private LocalDate data;
	private String fdata;

	public Mentoria() {

	}

	public Mentoria(String titulo, String descricao, LocalDate data) {

		DateTimeFormatter formar = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        
		this.fdata = data.format(formar);
		this.data = data;
		setTitulo(titulo);
		setDescricao(descricao);

	}

	public LocalDate getData() {
		return data;
	}

	public void setData(LocalDate data) {
		this.data = data;
	}


	@Override
	public String toString() {
		return "Mentoria [titulo=" + getTitulo() + ", descricao=" + getDescricao() + ", data=" + fdata + "]\n";
	}

	@Override
	public double calcularXP() {
		// TODO Auto-generated method stub
		return XP_PADRAO + 20d;
	}

}
