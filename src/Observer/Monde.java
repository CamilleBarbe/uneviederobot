package Observer;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Observable;
import java.util.Observer;

public class Monde extends Observable{
	
	public enum momentJournee{
		matin,
		apresmidi,
		soir,
	}
	private momentJournee heure;
	public enum typemeteo{
		soleil,
		pluie;
	}
	
	private typemeteo meteo;
	
	public Monde(){
		super();
		this.heure = momentJournee.matin;
		this.meteo = typemeteo.soleil;
	}
	
	/* Monde(Date date, ArrayList<Robot> robots) {
		super();
		this.date = date;
		this.robots = robots;
	}
*/

	public momentJournee getHeure() {
		return heure;
	}

	public void setHeure(momentJournee heure) {
		this.heure = heure;
		this.setChanged();
		this.notifyObservers();
	}

	public typemeteo getMeteo() {
		return meteo;
	}

	public void setMeteo(typemeteo meteo) {
		this.meteo = meteo;
		this.setChanged();
		this.notifyObservers();
	}
	
	
}
