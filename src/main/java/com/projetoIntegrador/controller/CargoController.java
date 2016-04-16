package com.projetoIntegrador.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.projetoIntegrador.dao.AbstractProjetoIntegradorDAO;
import com.projetoIntegrador.dao.CargoDAO;
import com.projetoIntegrador.model.Cargo;

@Controller
public class CargoController extends AbstractController<Cargo,Integer> implements ICargoController {

	@Autowired(required=true)
	private CargoDAO cargoDao;
	
	@Override
	public AbstractProjetoIntegradorDAO<Cargo, Integer> getDao() {
		
		return cargoDao;
	}
	

	@Override
	public void setDao(AbstractProjetoIntegradorDAO<Cargo, Integer> dao) {
		
		this.dao = dao;
	}


	public CargoDAO getCargoDao() {
		return cargoDao;
	}

	public void setCargoDao(CargoDAO cargoDao) {
		this.cargoDao = cargoDao;
	}

	

}
