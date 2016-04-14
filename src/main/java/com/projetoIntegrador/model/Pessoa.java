package com.projetoIntegrador.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
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
	@GeneratedValue(strategy=GenerationType.IDENTITY)
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
	
	
	@OneToOne(fetch=FetchType.LAZY, cascade=CascadeType.ALL)
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
	
    @Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((codigo == null) ? 0 : codigo.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Pessoa other = (Pessoa) obj;
		if (codigo == null) {
			if (other.codigo != null)
				return false;
		} else if (!codigo.equals(other.codigo))
			return false;
		return true;
	}

	public Integer getCodigo() {
		return codigo;
	}

	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Integer getIdade() {
		return idade;
	}

	public void setIdade(Integer idade) {
		this.idade = idade;
	}

	public SexoEnum getSexoEnum() {
		return sexoEnum;
	}

	public void setSexoEnum(SexoEnum sexoEnum) {
		this.sexoEnum = sexoEnum;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

	public List<Habilidade> getHabilidades() {
		return habilidades;
	}

	public void setHabilidades(List<Habilidade> habilidades) {
		this.habilidades = habilidades;
	}

	public TipoPessoa getTipoPessoa() {
		return tipoPessoa;
	}

	public void setTipoPessoa(TipoPessoa tipoPessoa) {
		this.tipoPessoa = tipoPessoa;
	}

	public List<Universidade> getUniversidade() {
		return universidade;
	}

	public void setUniversidade(List<Universidade> universidade) {
		this.universidade = universidade;
	}

	public boolean isDisponibilidade() {
		return disponibilidade;
	}

	public void setDisponibilidade(boolean disponibilidade) {
		this.disponibilidade = disponibilidade;
	}

	public Integer getScore() {
		return score;
	}

	public void setScore(Integer score) {
		this.score = score;
	}
	
	
	
	
}
