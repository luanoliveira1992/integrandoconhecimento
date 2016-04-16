package com.projetoIntegrador.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;
import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotBlank;

@Entity
@Table(name="tbcargo")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Cargo implements ObjetoPersistente<Integer>{
	
	@Id
	@Column(name="carcodigo")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer codigo;
	
	
	@NotBlank
	@Length(max=255, min=2)
	@Column(name="cardescricao")
	private String descricao;
	
	
	@Column(name="cargerencial")
	private Boolean gerencial;
	
	

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
		Cargo other = (Cargo) obj;
		if (codigo == null) {
			if (other.codigo != null)
				return false;
		} else if (!codigo.equals(other.codigo))
			return false;
		return true;
	}

	@Override
	public Integer getCodigo() {
		// TODO Auto-generated method stub
		return codigo;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public Boolean getGerencial() {
		return gerencial;
	}

	public void setGerencial(Boolean gerencial) {
		this.gerencial = gerencial;
	}

	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}
	

}
