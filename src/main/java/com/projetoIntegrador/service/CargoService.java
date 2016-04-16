package com.projetoIntegrador.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.UriComponentsBuilder;

import com.projetoIntegrador.controller.ICargoController;
import com.projetoIntegrador.model.Cargo;

@RestController
@RequestMapping(value = "/cargos")
public class CargoService {
	
	@Autowired
	private ICargoController cargoController;
	private List<Cargo> cargos;
	
	@RequestMapping(value = "/listaCargos", method = RequestMethod.GET)
	public ResponseEntity<List<Cargo>> listContatos() {
		cargos = cargoController.consultarTodos();
		
		if (cargos.isEmpty()) {
			return new ResponseEntity<List<Cargo>>(HttpStatus.NO_CONTENT);
		}

		return new ResponseEntity<List<Cargo>>(cargos, HttpStatus.OK);

	}
	
	@RequestMapping(value = "/cadastrar", method = RequestMethod.POST)
	public ResponseEntity<Void> cadastrarCargo(@RequestBody Cargo cargo, UriComponentsBuilder ucbBuilder){
		
		cargoController.insert(cargo);;
		
		HttpHeaders headers = new HttpHeaders();
        headers.setLocation(ucbBuilder.path("/cargos/listaCargos").buildAndExpand().toUri());
        return new ResponseEntity<Void>(headers, HttpStatus.CREATED);
	}

	public ICargoController getCargoController() {
		return cargoController;
	}

	public void setCargoController(ICargoController cargoController) {
		this.cargoController = cargoController;
	}

	public List<Cargo> getCargos() {
		return cargos;
	}

	public void setCargos(List<Cargo> cargos) {
		this.cargos = cargos;
	}
	

}
