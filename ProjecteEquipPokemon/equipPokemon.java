package ProjecteEquipPokemon;

import java.util.Scanner;

public class equipPokemon {
	
	public static void main(String[] args) {
		//Pas 1: Treure l'static
		equipPokemon ep = new equipPokemon();
		ep.principal();
	}
	
	//Pas 2: Nou principal
	public void principal() {
		//Pas 1 MP: Variables
		pokemon[] equip;
		int comptadorPoke = 0;
		char opcio = ' ';
		boolean fi = false;
		GestioEquipPokemon GEP = new GestioEquipPokemon("EquipPokemon.txt");
		//Nota 1: El nostre equip nomès podrà tenir 6 pokemon com a màxim
		equip = new pokemon[6];
		Scanner fitxer = new Scanner("EquipPokemon.txt");
		
		//Pas 2 MP: Obrir el fitxer i creació del menú
		GEP.obrirFitxer();
		System.out.println("Benvingut al creador d'equips Pokemon");
		while(fi == false) {
			opcio = GEP.menuPrincipal();
			switch(opcio) {
				case 'm':
				case 'M':
					equip = GEP.llegirPokemons();
					for(int i = 0; i < 6 ; i++) {
						switch(i) {
							case 0:
								System.out.println("Primer pokémon:");
								break;
							case 1:
								System.out.println("Segon pokémon:");
								break;
							case 2:
								System.out.println("Tercer pokémon:");
								break;
							case 3:
								System.out.println("Quart pokémon:");
								break;
							case 4:
								System.out.println("Cinqué pokémon:");
								break;
							case 5:
								System.out.println("Sisé pokémon:");
								break;
						}
						System.out.println(equip[i].toString());
					}
					break;
				case 'n':
				case 'N':
					equip[comptadorPoke] = GEP.nouPokemon(comptadorPoke);
					comptadorPoke++;
					break;
				case 'd':
				case 'D':
					break;
				case 'e':
				case 'E':
					fi = true;
					break;
				default:
					System.out.println("Opció no prevista");
					break;
			}
		}
	}
}