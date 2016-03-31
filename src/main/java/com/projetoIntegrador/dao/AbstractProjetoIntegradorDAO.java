package com.projetoIntegrador.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import com.projetoIntegrador.model.ObjetoPersistente;

@Repository
public abstract class AbstractProjetoIntegradorDAO<T extends ObjetoPersistente<C>,C>  extends AbstractDao<T, C> {

	@Autowired
	@Qualifier("sessionFactory")
	private SessionFactory sessionFactory;
	
	@Override
	public Session getSession() {
		return sessionFactory.getCurrentSession();
	}
}
