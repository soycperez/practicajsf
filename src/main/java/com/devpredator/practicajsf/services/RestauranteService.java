package com.devpredator.practicajsf.services;

import java.util.ArrayList;
import java.util.List;

import com.devpredator.practicajsf.entity.Gerente;
import com.devpredator.practicajsf.entity.Restaurante;

public class RestauranteService {
	
	public List<Restaurante> consultarRestaurante() {
		List<Restaurante> restaurantes = new ArrayList<Restaurante>(); 
		
		Restaurante mcDonals = new Restaurante(); 
		Restaurante burgerKing= new Restaurante();
		Restaurante subway = new Restaurante();
		
		mcDonals.setNombre("McDonals");
		mcDonals.setDireccion("Plaza Centro Sur. Local 235.");
		mcDonals.setPais("México");
		Gerente gerMcDonals = new Gerente(); 
		gerMcDonals.setNombre("Cesar Alexis");
		gerMcDonals.setPrimerApellido("Pérez");
		gerMcDonals.setSegundoApellido("Mejía");
		mcDonals.setGerente(gerMcDonals);
		
		burgerKing.setNombre("Burger King");
		burgerKing.setDireccion("Plaza Parque Puebla. Local 2034.");
		burgerKing.setPais("México");
		Gerente gerBurgerKing = new Gerente(); 
		gerBurgerKing.setNombre("Jessica");
		gerBurgerKing.setPrimerApellido("Pérez");
		gerBurgerKing.setSegundoApellido("Mejía");
		burgerKing.setGerente(gerBurgerKing);
		
		subway.setNombre("Subway");
		subway.setDireccion("Peri Plaza Col San Bartolo. Local 03.");
		subway.setPais("México");
		Gerente gerSubway = new Gerente(); 
		gerSubway.setNombre("Sarahi");
		gerSubway.setPrimerApellido("Pérez");
		gerSubway.setSegundoApellido("Flores");
		subway.setGerente(gerSubway);
		
		restaurantes.add(mcDonals); 
		restaurantes.add(burgerKing); 
		restaurantes.add(subway);
		return restaurantes; 
		
	}

}
