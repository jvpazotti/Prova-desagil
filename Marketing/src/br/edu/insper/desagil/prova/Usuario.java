package br.edu.insper.desagil.prova;

import java.util.ArrayList;
import java.util.List;

public class Usuario {
	
	private String nome;
	private List<Video> videos;
	
	public Usuario(String nome) {
		this.nome = nome;
		this.videos= new ArrayList<>();
	}
	
	
	
	public String getNome() {
		return nome;
	}



	public Video postaVideo(int id,Produto produto) {
		Usuario usuario= new Usuario(this.nome);
		Video video= new Video(id,usuario,produto);
		return video;
	}
	
	

}
