package com.projetoIntegrador.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.NotBlank;

@Entity
@Table(name="tbtipopessoa")
public class TipoPessoa implements ObjetoPersistente<Integer> {

	@Id
	@Column(name="tipocodigo")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer codigo;
	
	@NotBlank
	@Column(name="tipodescricao")
	private String descricao;
	
	@NotNull
	@Column(name="tiposcore")
	private Double score;
	
	@Override
	public Integer getCodigo() {
		
		return codigo;
	}
	
	
}
