package com.projetoIntegrador.model;

import java.io.Serializable;

public interface ObjetoPersistente<T> extends Serializable {
    
	T getCodigo();	

}