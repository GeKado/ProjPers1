package ProjecteEquipPokemon;

import java.util.Scanner;

public class equipPokemon {
	pokemon[] equip;
	int posLliure;
	public static void main(String[] args) {
		//Pas 1: Treure l'static
		equipPokemon ep = new equipPokemon();
		ep.principal();
	}
	
	//Pas 2: Nou principal
	public void principal() {
		//Pas 1 MP: Variables
		char opcio = ' ';
		GestioEquipPokemon GEP = new GestioEquipPokemon("EquipPokemom.txt");
		//Nota 1: El nostre equip nomès podrà tenir 6 pokemon com a màxim
		equip = new pokemon[6];
		
		//Pas 2 MP: Obrir el fitxer i creació del menú
		GEP.obrirFitxer();	
		opcio = GEP.menuPrincipal();
		switch(opcio) {
			case 'n':
			case 'N':
				posLliure = GEP.buscarPosicioLliure();
				equip[posLliure] = GEP.nouPokemon();
				break;
			case 'm':
			case 'M':
				break;
			case 'd':
			case 'D':
				break;
			case 'e':
			case 'E':
				break;
		}
	}
}