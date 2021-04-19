package br.edu.insper.desagil.prova;

import java.util.HashMap;
import java.util.Map;

public class Video {
	
	private int id;
	
	private Usuario usuario;
	
	private Produto produto;
	
	private Map<Usuario,Integer> avaliacoes;

	public Video(int id, Usuario usuario, Produto produto) {
		this.id = id;
		this.usuario = usuario;
		this.produto = produto;
		this.avaliacoes= new HashMap<>();
	}
	
	public void adicionaAvalicoes(Usuario usuario,int numero) {
		if(usuario.getNome()!=usuario.postaVideo(id, this.produto))
	}
	
	public void mediaAvalicoes() {
		for(int nota:this.avaliacoes) {
			
		}
	}
	
	
	

}
