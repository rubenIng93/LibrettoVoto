package it.polito.tdp.libretto;

import java.util.*;

public class Libretto {
	
	private List<Voto> voti;
	
	public Libretto() {
		this.voti = new ArrayList<Voto>();
	}
	
	/**
	 * Aggiunge un nuovo voto al libretto
	 * 
	 * @param v il Voto da aggiungere
	 */
	
	public void add(Voto v) {
		voti.add(v);
	}
	
	/**
	 * Seleziona un sottinsieme di voti, che hanno il punteggio specificato
	 * 
	 * @param punti punteggio da ricercare
	 * @return lista di Voto aventi quel punteggio
	 */
	
	public List<Voto> cercaVoti(int punti){
		List <Voto> result = new ArrayList<Voto>();
		
		for(Voto v : this.voti) {
			if(v.getPunti() == punti) {
				result.add(v);
			}
		}
		
		return result;
	}

}
