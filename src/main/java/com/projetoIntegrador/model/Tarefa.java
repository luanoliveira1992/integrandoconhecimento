package com.projetoIntegrador.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import com.projetoIntegrador.util.StatusTarefaEnum;

@Entity
@Table(name="tbtarefa")
public class Tarefa {
	
	@Id
	@Column(name="ativcodigo")
	private Integer codigo;
	
	private List<Pessoa> pessoas;
	
	private StatusTarefaEnum status;

}
