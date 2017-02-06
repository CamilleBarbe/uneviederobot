package Observer;

import java.util.Date;
import java.util.Observable;

import Observer.Monde.momentJournee;
import Observer.Monde.typemeteo;

public class RobotMatin implements Robot{

	private Monde monde;
	private String etat;
	
	public RobotMatin(Monde monde) {
		super();
		this.monde = monde;
	}

	@Override
	public void update(Observable arg0, Object arg1) {
		// TODO Auto-generated method stub
		if(arg0 instanceof Monde){
			typemeteo meteo = ((Monde) arg0).getMeteo();
			momentJournee heure = ((Monde) arg0).getHeure();
			switch(meteo){
			case soleil : 
				switch(heure){
				case matin :
					System.out.println("RobotMatin: travailler");
					break;
				case apresmidi :
					System.out.println("RobotMatin: se reposer");
					break;
				case soir :
					System.out.println("RobotMatin: se coucher");
					break;
				}
				break;
			case pluie :
				switch(heure){
				case matin :
					System.out.println("RobotMatin: se reposer");
					break;
				case apresmidi :
					System.out.println("RobotMatin: se reposer");
					break;
				case soir :
					System.out.println("RobotMatin: se coucher");
					break;
				}
				break;
			}
		}
	}

	@Override
	public void action() {
		// TODO Auto-generated method stub
	}

	public Monde getMonde() {
		return monde;
	}

	public void setMonde(Monde monde) {
		this.monde = monde;
	}
	
}
