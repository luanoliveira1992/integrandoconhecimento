package com.projetoIntegrador.dao;

import java.util.List;

import com.projetoIntegrador.model.ObjetoPersistente;


public interface IDao<T extends ObjetoPersistente<C>, C> {
	//Responsável por inserir um objeto
     public void insert(T objeto); 
     
     public void update(T objeto);
     
     public List<T> consultarTodos();
     
     public void delete(T objeto);
     
     public Class<T> getObjectClass();
     
     public T buscaPorChave(C chave);

}
