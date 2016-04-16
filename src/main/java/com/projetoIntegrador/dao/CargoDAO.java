package com.projetoIntegrador.dao;

import org.springframework.stereotype.Component;

import com.projetoIntegrador.model.Cargo;

@Component(value="cargoDao")
public class CargoDAO extends AbstractProjetoIntegradorDAO<Cargo, Integer> implements IDao<Cargo, Integer>{

}
