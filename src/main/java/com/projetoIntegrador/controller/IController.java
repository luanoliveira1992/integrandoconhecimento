package com.projetoIntegrador.controller;

import java.util.List;

import com.projetoIntegrador.model.ObjetoPersistente;

public interface IController<T extends ObjetoPersistente<C>,C> {
	public void insert(T objeto); 
    
    public void update(T objeto);
    
    public List<T> consultarTodos();
    
    public void delete(T objeto);
    
    public T buscaPorChave(C chave);
    
    
}