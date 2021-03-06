package partie;

import com.google.gson.annotations.Expose;

import heroes.EpicHeroesLeague;


public class Board {
	@Expose
	private int nbTurnsLeft; 
	private EpicHeroesLeague miagicBot; 
	private EpicHeroesLeague adversaire; 
	
	public Board(EpicHeroesLeague miagicBot,EpicHeroesLeague adversaire, int nbTurnsLeft){
			
		this.miagicBot = miagicBot;
		this.adversaire = adversaire; 
		
		this.nbTurnsLeft = nbTurnsLeft;
	}

	public Board() {
		this.nbTurnsLeft = 0;
	}

	public int getNbTurnsLeft() {
		return nbTurnsLeft;
	}

	public void setNbTurnsLeft(int nbTurnsLeft) {
		this.nbTurnsLeft = nbTurnsLeft;
	}

	public EpicHeroesLeague getMiagicBot() {
		return miagicBot;
	}

	public void setMiagicBot(EpicHeroesLeague miagicBot) {
		this.miagicBot = miagicBot;
	}

	public EpicHeroesLeague getAdversaire() {
		return adversaire;
	}

	public void setAdversaire(EpicHeroesLeague adversaire) {
		this.adversaire = adversaire;
	}

	@Override
	public String toString() {
		return "Board [nbTurnsLeft=" + nbTurnsLeft + "\n\n MiagicBot=" + miagicBot + "\n\nAdversaire=" + adversaire + "]";
	}
	
}
