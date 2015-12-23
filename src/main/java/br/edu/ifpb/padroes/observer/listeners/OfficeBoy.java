package br.edu.ifpb.padroes.observer.listeners;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import br.edu.ifpb.padroes.observer.Observer;
import br.edu.ifpb.padroes.observer.model.Chamada;

public class OfficeBoy implements Observer<Chamada> {

	private final Logger logger = LoggerFactory.getLogger(Taxi.class);
	
	@Override
	public void update(Chamada object) {
		logger.info("Não farei nada!");
	}

}
