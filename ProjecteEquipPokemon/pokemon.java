package ProjecteEquipPokemon;
public class pokemon {
	//Pas 1: Variables del atribut
	private String nom = "";
	private String tipo1 = "";
	private String tipo2 = "";
	private int Lvl = 1;
	private int HP = 0;
	private int Atk = 0;
	private int Def = 0;
	private int SpA = 0;
	private int SpD = 0;
	private int Spe = 0;
	
	//Pas 2 : Constructors
	public pokemon() {
		this.nom = "";
		this.tipo1 = "";
		this.tipo2 = "";
		this.Lvl = 1;
		this.HP = 0;
		this.Atk = 0;
		this.Def = 0;
		this.SpA = 0;
		this.SpD = 0;
		this.Spe = 0;
	}
	
	public pokemon(String nom, String tipo1, String tipo2, int Lvl, int HP, int Atk, int Def, int SpA, int SpD, int Spe) {
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

	public int getLvl() {
		return Lvl;
	}

	public void setLvl(int lvl) {
		Lvl = lvl;
	}

	public int getHP() {
		return HP;
	}

	public void setHP(int hP) {
		HP = hP;
	}

	public int getAtk() {
		return Atk;
	}

	public void setAtk(int atk) {
		Atk = atk;
	}

	public int getDef() {
		return Def;
	}

	public void setDef(int def) {
		Def = def;
	}

	public int getSpA() {
		return SpA;
	}

	public void setSpA(int spA) {
		SpA = spA;
	}

	public int getSpD() {
		return SpD;
	}

	public void setSpD(int spD) {
		SpD = spD;
	}

	public int getSpe() {
		return Spe;
	}

	public void setSpe(int spe) {
		Spe = spe;
	}
}