package com.projetoIntegrador.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotBlank;

@Entity
@Table(name="tbprojeto")
public class Projeto implements ObjetoPersistente<Integer> {
    
	@Id
	@Column(name="procodigo")
	private Integer codigo;
	
	@NotBlank
	@Length(max=255,min=5)
	@Column(name="protitulo")
	private String titulo;
	
	@NotBlank
	@Length(max=255,min=5)
	@Column(name="prodescricao")
	private String descricao;
	
	@NotNull
	@JoinColumn(name="proareas")
	@OneToMany(fetch= FetchType.LAZY)
	private List<AreaAtuacao> areas;
	
	@NotNull
	@JoinColumn(name="prohabilidades")
	@OneToMany(fetch= FetchType.LAZY)
	private List<Habilidade> habilidades;
	
	@NotNull
	@JoinColumn(name="procargos")
	@OneToMany(fetch= FetchType.LAZY)
	private List<Cargo> cargos;
	
	@NotNull
	@JoinColumn(name="propessoas")
	@OneToMany(fetch= FetchType.LAZY)
	private List<Pessoa> pessoas;
	
	@NotNull
	@JoinColumn(name="proatividades")
	@OneToMany(fetch= FetchType.LAZY)
	private List<Atividade> atividades;

	
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
		Projeto other = (Projeto) obj;
		if (codigo == null) {
			if (other.codigo != null)
				return false;
		} else if (!codigo.equals(other.codigo))
			return false;
		return true;
	}

	@Override
	public Integer getCodigo() {
		return codigo;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public List<AreaAtuacao> getAreas() {
		return areas;
	}

	public void setAreas(List<AreaAtuacao> areas) {
		this.areas = areas;
	}

	public List<Habilidade> getHabilidades() {
		return habilidades;
	}

	public void setHabilidades(List<Habilidade> habilidades) {
		this.habilidades = habilidades;
	}

	public List<Cargo> getCargos() {
		return cargos;
	}

	public void setCargos(List<Cargo> cargos) {
		this.cargos = cargos;
	}

	public List<Pessoa> getPessoas() {
		return pessoas;
	}

	public void setPessoas(List<Pessoa> pessoas) {
		this.pessoas = pessoas;
	}

	public List<Atividade> getAtividades() {
		return atividades;
	}

	public void setAtividades(List<Atividade> atividades) {
		this.atividades = atividades;
	}

	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}

}
