package com.projetoIntegrador.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.validator.constraints.NotBlank;

@Entity
@Table(name="tbareaAtuacao")
public class AreaAtuacao implements ObjetoPersistente<Integer> {
	
	@Id
	@Column(name="areaCodigo")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer codigo;
	
	@NotBlank
	@Column(name="areaDescricao")
	private String descricao;
		

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
		AreaAtuacao other = (AreaAtuacao) obj;
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


	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}
	
	

}
