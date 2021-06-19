package ProjecteEquipPokemon;

import java.io.File;
import java.util.Scanner;

public class GestioEquipPokemon {
	//Pas 1: Variables per poder fer la gesti� dels fitxers
	private Scanner lectorFitxer;
	private Scanner lector;
	private File fitxer;
	private String nomFitxer;
	pokemon[]arrayPoke;
	
	//Pas 2: Constructors
	public GestioEquipPokemon(String nomFitxer) {
		this.nomFitxer = nomFitxer;
	}

	//Pas 3: Getters Setters
	public String getNomOrigen() {
		return nomFitxer;
	}
	public void setNomOrigen(String nomOrigen) {
		this.nomFitxer = nomOrigen;
	}	
	
	//Pas 4: M�todes de la classe
	public boolean obrirFitxer() {
		//Pas 1 M1: Variable
		boolean obertura = true;
		
		//Pas 2 M1: Obrir fitxer
		try {
			this.fitxer = new File(nomFitxer);
			lectorFitxer = new Scanner(fitxer);
		}
		catch(Exception e){
			System.out.println(e.getMessage());
			obertura = false;
		}
		arrayPoke = new pokemon[6];
		return obertura;
	}
	
	public char menuPrincipal() {
		//Pas 1 M2: Variables
		char opcio;
		lector = new Scanner(System.in);
		
		//Pas 2 M2: Impressi� men�
		System.out.println("Seleccioni una opci�:");
		System.out.println("Mirar l'equip (M)");
		System.out.println("Nou pokemon (N)");
		System.out.println("Esborrar un pokemon (D)");
		System.out.println("Surtir (E)");
		opcio = lector.next().charAt(0);
		return opcio;
	}
	
	public pokemon nouPokemon(int posicio) {
		//Pas 1 M3: Variables
		String nom = "";
		String tipo1 = "";
		String tipo2 = "";
		String Lvl = "1";
		String HP = "0";
		String Atk = "0";
		String Def = "0";
		String SpA = "0";
		String SpD = "0";
		String Spe = "0";
		pokemon pokemon = new pokemon();
		
		//Pas 2 M3: Buscar una posici� per asignar a un pok�mon
		if(posicio == 6) {
			System.out.println("L'equip ja est� complet, per aix� no �s pot afegir cap m�s Pok�mon");
		}
		//Nota 1: Si hi ha una posici� lliure, introduir les dades i assignar-les a un nou pokemon
		else {
			System.out.println("Ara introdueixi les dades del Pok�mon");
			System.out.println("Nom del Pok�mon:");
			nom = lector.next();
			pokemon.setNom(nom);
			System.out.println("Tipus del Pok�mon (en el cas que no tingui segon tipus, posi una n):");
			tipo1 = lector.next();
			tipo2 = lector.next();
			if(tipo2.equals("n") || tipo2.equals("N")) {
				tipo2 = "null";
			}
			pokemon.setTipo1(tipo1);
			pokemon.setTipo2(tipo2);
			System.out.println("Nivell del Pok�mon:");
			Lvl = lector.next();
			pokemon.setLvl(Lvl);
			System.out.println("Punts de vida del Pok�mon:");
			HP = lector.next();
			pokemon.setHP(HP);
			System.out.println("Atac del Pok�mon:");
			Atk = lector.next();
			pokemon.setAtk(Atk);
			System.out.println("Defensa del Pok�mon:");
			Def = lector.next();
			pokemon.setDef(Def);
			System.out.println("Atac especial del Pok�mon:");
			SpA = lector.next();
			pokemon.setSpA(SpA);
			System.out.println("Defensa especial del Pok�mon:");
			SpD = lector.next();
			pokemon.setSpD(SpD);
			System.out.println("Velocitat del Pok�mon:");
			Spe = lector.next();
			pokemon.setSpe(Spe);
		}
		return pokemon;
	}
	
	public pokemon[] llegirPokemons() {
		//Pas 1 M4: Variables
		pokemon[] p = null;
		Scanner lectorPoke = null;
		int pos = 0;
		
		//Pas 2 M4: Llegir tots els pok�mons;
		try {
			lectorPoke = new Scanner(fitxer);
			p = new pokemon[6];
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
		
		while(lectorPoke.hasNext()) {
			String text = lectorPoke.nextLine();
			String[] dades = text.split(",");
			pokemon poke = new pokemon(dades[0], dades[1], dades[2], dades[3], dades[4], dades[5], dades[6], dades[7], dades[8], dades[9]);
			p[pos] = poke;
			pos++;
		}
		return p;
	}
	
	
}