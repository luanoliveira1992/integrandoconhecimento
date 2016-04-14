package com.projetoIntegrador.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OrderBy;
import javax.persistence.Table;

import com.projetoIntegrador.util.StatusTarefaEnum;

@Entity
@Table(name="tbtarefa")
public class Tarefa {
	
	@Id
	@Column(name="tarecodigo")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer codigo;
	
	@OneToMany(fetch=FetchType.LAZY)
	@JoinColumn(name="tarepessoas")
	@OrderBy(value="nome asc")
	private List<Pessoa> pessoas;
	
	@Enumerated(EnumType.ORDINAL)
	@Column(name="tarestatus")
	private StatusTarefaEnum status;
	
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
		Tarefa other = (Tarefa) obj;
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

	public List<Pessoa> getPessoas() {
		return pessoas;
	}

	public void setPessoas(List<Pessoa> pessoas) {
		this.pessoas = pessoas;
	}

	public StatusTarefaEnum getStatus() {
		return status;
	}

	public void setStatus(StatusTarefaEnum status) {
		this.status = status;
	}
	
	

}
