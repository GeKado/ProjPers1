package ProjecteEquipPokemon;

import java.io.File;
import java.util.Scanner;

public class GestioEquipPokemon {
	//Pas 1: Variables per poder fer la gesti� dels fitxers
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
	public boolean obrirFitxer(/*boolean lectura*/) {
		//Pas 1 M1: Variable
		boolean obertura = true;
		
		//Pas 2 M1: Obrir fitxer
		try {
			this.fitxer = new File(nomFitxer);
			/*if(lectura ==  true) {*/
				lector = new Scanner(fitxer);
			/*}
			else {
				ps = new PrintStream(fOrigen);
			}*/
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
		Scanner lector = new Scanner(System.in);
		
		//Pas 2 M2: Impressi� men�
		System.out.println("Benvingut al creador d'equips Pokemon");
		System.out.println("Seleccioni una opci�:");
		System.out.println("Nou pokemon (N)");
		System.out.println("Mirar l'equip (M)");
		System.out.println("Esborrar un pokemon (D)");
		System.out.println("Surtir (E)");
		opcio = lector.next().charAt(0);
		return opcio;
	}
	
	public pokemon nouPokemon() {
		//Pas 1 M2: Variables
		String nom = "";
		String tipo1 = "";
		String tipo2 = "";
		int HP = 0;
		int Atk = 0;
		int Def = 0;
		int SpA = 0;
		int SpD = 0;
		int Spe = 0;
		int posicio = 0;
		pokemon pokemon = new pokemon();
		
		//Pas 2 M2: Buscar una posici� per asignar a un pok�mon
		posicio = buscarPosicioLliure();
		if(posicio == -1) {
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
			System.out.println("Punts de vida del Pok�mon:");
			HP = lector.nextInt();
			pokemon.setHP(HP);
			System.out.println("Atac del Pok�mon:");
			Atk = lector.nextInt();
			pokemon.setAtk(Atk);
			System.out.println("Defensa del Pok�mon:");
			Def = lector.nextInt();
			pokemon.setDef(Def);
			System.out.println("Atac especial del Pok�mon:");
			SpA = lector.nextInt();
			pokemon.setSpA(SpA);
			System.out.println("Defensa especial del Pok�mon:");
			SpD = lector.nextInt();
			pokemon.setSpD(SpD);
			System.out.println("Velocitat del Pok�mon:");
			Spe = lector.nextInt();
			pokemon.setSpe(Spe);
		}
		return pokemon;
	}
	
	public int buscarPosicioLliure() {
		//Pas 1 M3: Variables
		int pos = -1;
		int index = 0;
		boolean trobada = false;
		
		//Pas 2 M3: Buscar una posici� que estigui lliure
		while(trobada == false && index < 6) {
			if(arrayPoke[index] != null) {
				index++;
			}
			else {
				trobada = true;
				pos = index;
			}
		}
		return pos;
	}
}