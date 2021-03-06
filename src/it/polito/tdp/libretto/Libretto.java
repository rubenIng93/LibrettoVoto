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
	
	
	/**
	 * Ricerca un voto relativo al corso di cui e' specificato il nome
	 * 
	 * @param nomeEsame nome del corso da cercare
	 * @return Voto corrispondente oppure null se non esistente.
	 */
	public Voto cercaEsame (String nomeEsame) {
		/*for(Voto v : this.voti) {
			if(v.getCorso().equals(nomeEsame)) {//sempre meglio equals per confrontare!! 
				return v;						//Non per tutti gli oggetti ha senso un ordinamento!!
			}
		}
		return null;*/
		Voto voto = new Voto(0, nomeEsame, null); //oggetto Voto incompleto, ma mi serve solo per la ricerca con equals
		int pos = this.voti.indexOf(voto);		// che agisce solo sul nome esame
		if(pos == -1) {//-1 se non lo trova
			return null;
		}
		else
			return this.voti.get(pos);
	}
	
	/**
	 * Dato un voto, determina se esiste gi� un voto
	 * con uguale corso ed uguale punteggio.
	 * 
	 * @param v
	 * @return true, se ha trovato un corso punteggio uguale; false se 
	 * non ha trovato un corso o lo ha trovato con un voto diverso.
	 */
	public boolean esisteGiaVoto(Voto v) {
		int pos = this.voti.indexOf(v);
		if(pos == -1) {
			return false;
		}else {
			return (v.getPunti() == this.voti.get(pos).getPunti());
		}
		
	}

}
