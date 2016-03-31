package com.projetoIntegrador.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotBlank;

import com.projetoIntegrador.enums.SexoEnum;
@Entity
@Table(name="tbpessoa")
public class Pessoa {
	@Id
	@Column(name="pescodigo")
	private Integer codigo;
	
	@NotBlank
	@Length(max=255, min=5)
	@Column(name="pesnome")
	private String nome;
	
	@NotBlank
	@Column(name="pesidade")
	private Integer idade;
	
	@NotBlank
	@Column(name="pessexo")
	private SexoEnum sexoEnum;
	
	@NotBlank
	@Column(name="pesemail")
	private String email;
	
	@Column(name="pestelefone")
	private String telefone;
	
	@OneToOne(fetch=FetchType.LAZY, mappedBy="pessoa", cascade=CascadeType.ALL)
	private Endereco endereco;
	
	@NotNull
	@JoinColumn(name="peshabilidade")
	@OneToMany(fetch=FetchType.LAZY)
	private List<Habilidade> habilidades;
	
	@NotNull
	@OneToOne(fetch=FetchType.LAZY, mappedBy="pessoa", cascade=CascadeType.ALL)
	private TipoPessoa tipoPessoa;
	
	@NotNull
	@JoinColumn(name="pesuniversidade")
	@OneToMany(fetch=FetchType.LAZY)
	private List<Universidade> universidade;
	
	@Column(name="pesdisponibilidade")
	private boolean disponibilidade;
	
	@Column(name="pesscore")
	private Integer score;
	
	
}
