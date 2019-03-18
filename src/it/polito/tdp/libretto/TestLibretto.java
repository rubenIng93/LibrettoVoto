package it.polito.tdp.libretto;

import java.time.LocalDate;
import java.util.*;

public class TestLibretto {

	public static void main(String[] args) {
		
		Libretto libr = new Libretto();
		
		libr.add(new Voto(30, "Analisi I", LocalDate.of(2017, 1, 15)));
		libr.add(new Voto(21, "Analisi II", LocalDate.of(2018, 1, 25)));
		libr.add(new Voto(25, "Fisica I", LocalDate.of(2017, 6, 10)));
		libr.add(new Voto(28, "Fisica II", LocalDate.of(2018, 9, 3)));
		libr.add(new Voto(18, "Geometria", LocalDate.of(2017, 9, 1)));
		libr.add(new Voto(20, "Economia", LocalDate.of(2018, 7, 15)));
		libr.add(new Voto(25, "Ricerca Operativa", LocalDate.of(2018, 7, 16)));
		libr.add(new Voto(24, "Statistica", LocalDate.of(2018, 1, 15)));
		libr.add(new Voto(25, "Programmazione a Oggetti", LocalDate.of(2019, 1, 15)));
		libr.add(new Voto(27, "Logistica", LocalDate.of(2017, 2, 15)));
		
		List<Voto> venticinque = libr.cercaVoti(25);
		System.out.println(venticinque);

	}

}
