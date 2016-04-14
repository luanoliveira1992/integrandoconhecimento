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
import javax.persistence.Table;

import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotBlank;


@Entity
@Table(name="tbatividade")
public class Atividade implements ObjetoPersistente<Integer> {
	
	@Id
	@Column(name="ativcodigo")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer codigo;
	
	@NotBlank
	@Length(min=2,max=255)
	@Column(name="ativdescricao")
	private String descricao;
	
	@JoinColumn(name="ativtarefas")
	@OneToMany(fetch=FetchType.LAZY,cascade=CascadeType.ALL)
	private List<Tarefa> tarefas;

	@Override
	public Integer getCodigo() {
		return codigo;
	}
	
	

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
		Atividade other = (Atividade) obj;
		if (codigo == null) {
			if (other.codigo != null)
				return false;
		} else if (!codigo.equals(other.codigo))
			return false;
		return true;
	}



	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public List<Tarefa> getTarefas() {
		return tarefas;
	}

	public void setTarefas(List<Tarefa> tarefas) {
		this.tarefas = tarefas;
	}

	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}
	

}
