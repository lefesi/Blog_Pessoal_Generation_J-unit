package org.generation.blogPessoal.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name = "tb_tema")
public class Tema {
	
		
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long idTema;
		
		
	@NotBlank
	private String nomeTema;
	
	@OneToMany(mappedBy = "tema", cascade = CascadeType.ALL)
	@JsonIgnoreProperties("tema")
	private List<Postagem> postagem;


	public String getNomeTema() {
		return nomeTema;
	}


	public void setNomeTema(String nomeTema) {
		this.nomeTema = nomeTema;
	}


	public List<Postagem> getPostagem() {
		return postagem;
	}


	public void setPostagem(List<Postagem> postagem) {
		this.postagem = postagem;
	}


	public long getIdTema() {
		return idTema;
	}


	public void setIdTema(long idTema) {
		this.idTema = idTema;
	}


	public String getDescricaoTema() {
		return nomeTema;
	}


	public void setDescricaoTema(String descricaoTema) {
		this.nomeTema = descricaoTema;
	}

	
}
