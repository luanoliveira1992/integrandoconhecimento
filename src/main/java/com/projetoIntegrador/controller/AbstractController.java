package com.projetoIntegrador.controller;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.projetoIntegrador.dao.AbstractProjetoIntegradorDAO;
import com.projetoIntegrador.model.ObjetoPersistente;

@Service("abstractController")
@Transactional(readOnly = true)
public abstract class AbstractController<T extends ObjetoPersistente<C>,C> implements IController<T,C> {

	AbstractProjetoIntegradorDAO<T,C> dao;

	@Override
	@Transactional
	public void insert(T objeto) {
		try{
			this.getDao().insert(objeto);
		}catch(RuntimeException e){
			
		}
		
	}

	@Override
	@Transactional
	public void update(T objeto) {
		this.getDao().update(objeto);
		
	}

	@Override
	@Transactional(readOnly=true)
	public List<T> consultarTodos() {
		return this.getDao().consultarTodos();
	}

	

	@Override
	@Transactional()
	public void delete(T objeto) {
		this.getDao().delete(objeto);
	}
	
	
	
	@Override
	public T buscaPorChave(C chave) {
		return this.getDao().buscaPorChave(chave);
		 
	}

	public AbstractProjetoIntegradorDAO<T, C> getDao() {
		return dao;
	}
	public void setDao(AbstractProjetoIntegradorDAO<T, C> dao) {
		this.dao = dao;
	}

}
