package com.projetoIntegrador.enums;

public enum SexoEnum implements EnumeracaoComDescricao  {

	MASCULINO("M"), FEMININO("F");
	
	private String descricao;

	private SexoEnum(String descricao) {
		this.descricao = descricao;
	}
	
	@Override
	public String getDescricao() {
		return this.descricao;
	}
	
	public boolean isMasculino() {
		return MASCULINO.equals(this);
	}
	
	public boolean isFeminino() {
		return FEMININO.equals(this);
	}
	
	@Override
	public String toString() {
		return String.valueOf(descricao);
	}
	
}
