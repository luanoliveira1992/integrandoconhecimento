package com.projetoIntegrador.util;

import java.util.Arrays;
import java.util.List;

public enum StatusTarefaEnum {
	EM_ANDAMENTO(1,"Em Andamento"), CONCLUIDO(2,"Concluído"), CANCELADA(3,"Cancelada"), NAO_INICIADA(4,	"Não Iniciada");
	
	StatusTarefaEnum(Integer codigo, String descricao){
		
	}
	
	public List<StatusTarefaEnum> recuperarValores(){
		return Arrays.asList(StatusTarefaEnum.values());
	}

}
