
/* 	para que a classe seja interpretada no banco de dados, como uma entidade deve ter naotaçõe
 * que são arametros que definem o comportamento*/
package org.generation.blogPessoal.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;



@Entity//Aqui falamos que essa classe funciona como entidad
@Table(name = "tb_postagem")

/* entity ela indica a classe que será uma entidade do jpa enbernate
 * a table indica que a entidade no banco de dados sera uma tabela com o nome de postagens*/
public class Postagem {

	/* colocar que se trata de um id, e vai se comportar como um valor gerado
	 * com a estrategia do parametro strategy to tipo entidade e sera uma chave primaria*/
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	 private long id;
	/* NÃo pode estra vazio então deve por o not null
	  * quantos caracteres podem ter, precisa do parametro main e a quantidade max de carcteres
	   e o mesmo para texto*/ 
	
	@NotBlank
	@Size(min = 5 , max= 10)
	 private String titulo;
	 
	@NotBlank
	@Size( min = 10, max = 100)
	 private String texto;
	 
	 /* importar o date do java util, existe um metodo para saber a hora exata da postagem*/
	@Temporal(TemporalType.TIMESTAMP)
	 private Date momento = new java.sql.Date(System.currentTimeMillis());
	
	@ManyToOne
	@JsonIgnoreProperties("postagem")
	private Tema tema;

	
	public Tema getTema() {
		return tema;
	}
	public void setTema(Tema tema) {
		this.tema = tema;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getTexto() {
		return texto;
	}
	public void setTexto(String texto) {
		this.texto = texto;
	}
	public Date getMomento() {
		return momento;
	}
	public void setMomento(Date momento) {
		this.momento = momento;
	}


	}


