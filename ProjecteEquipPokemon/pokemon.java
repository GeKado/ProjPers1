package ProjecteEquipPokemon;
public class pokemon {
	//Pas 1: Variables del atribut
	private String nom = "";
	private String tipo1 = "";
	private String tipo2 = "";
	private String Lvl = "1";
	private String HP = "0";
	private String Atk = "0";
	private String Def = "0";
	private String SpA = "0";
	private String SpD = "0";
	private String Spe = "0";
	
	//Pas 2 : Constructors
	public pokemon() {
		this.nom = "";
		this.tipo1 = "";
		this.tipo2 = "";
		this.Lvl = "1";
		this.HP = "0";
		this.Atk = "0";
		this.Def = "0";
		this.SpA = "0";
		this.SpD = "0";
		this.Spe = "0";
	}
	
	public pokemon(String nom, String tipo1, String tipo2, String Lvl, String HP, String Atk, String Def, String SpA, String SpD, String Spe) {
		this.nom = nom;
		this.tipo1 = tipo1;
		this.tipo2 = tipo2;
		this.Lvl = Lvl;
		this.HP = HP;
		this.Atk = Atk;
		this.Def = Def;
		this.SpA = SpA;
		this.SpD = SpD;
		this.Spe = Spe;
	}

	//Pas 3: Getters i Setters
	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getTipo1() {
		return tipo1;
	}

	public void setTipo1(String tipo1) {
		this.tipo1 = tipo1;
	}

	public String getTipo2() {
		return tipo2;
	}

	public void setTipo2(String tipo2) {
		this.tipo2 = tipo2;
	}

	public String getLvl() {
		return Lvl;
	}

	public void setLvl(String lvl) {
		Lvl = lvl;
	}

	public String getHP() {
		return HP;
	}

	public void setHP(String hP) {
		HP = hP;
	}

	public String getAtk() {
		return Atk;
	}

	public void setAtk(String atk) {
		Atk = atk;
	}

	public String getDef() {
		return Def;
	}

	public void setDef(String def) {
		Def = def;
	}

	public String getSpA() {
		return SpA;
	}

	public void setSpA(String spA) {
		SpA = spA;
	}

	public String getSpD() {
		return SpD;
	}

	public void setSpD(String spD) {
		SpD = spD;
	}

	public String getSpe() {
		return Spe;
	}

	public void setSpe(String spe) {
		Spe = spe;
	}
	
	public String toString() {
		String dades = "";
		//dades = this.nom + ", " + this.tipo1 + ", " + this.tipo2 + ", " + this.Lvl + ", " + this.HP + ", " + this.Atk + ", " + this.Def + ", " + this.SpA + ", " + this.SpD + ", " + this.Spe;
		dades = "Estadístiques del pokémon:";
		dades = "Nom del pokémon: " + this.nom + "\n";
		dades = dades + "Primer tipo: " + this.tipo1 + "\n";
		dades = dades + "Segon tipo: " + this.tipo2 + "\n";
		dades = dades + "Nivell del pokémon: " + this.Lvl + "\n";
		dades = dades + "Vida del pokémon: " + this.HP + "\n";
		dades = dades + "Atac del pokémom: " + this.Atk + "\n";
		dades = dades + "Defensa del pokémom: " + this.Def + "\n";
		dades = dades + "Atac especial del pokémom: " + this.SpA + "\n";
		dades = dades + "Defensa especial del pokémom: " + this.SpD + "\n";
		dades = dades + "Velocitat del pokémom: " + this.Spe + "\n";
		return dades;
	}
}