package Observer;

import java.util.Observable;

import Observer.Monde.momentJournee;
import Observer.Monde.typemeteo;

public class RobotPluie implements Robot{

    private Monde monde;
	
	public RobotPluie(Monde monde) {
		super();
		this.monde = monde;
	}
	
	
	public Monde getMonde() {
		return monde;
	}

	public void setMonde(Monde monde) {
		this.monde = monde;
	}

	@Override
	public void action() {
		// TODO Auto-generated method stub
	}
	
	@Override
	public void update(Observable o, Object arg) {
		// TODO Auto-generated method stub
		if(o instanceof Monde){
			typemeteo meteo = ((Monde) o).getMeteo();
			momentJournee heure = ((Monde) o).getHeure();
			switch(meteo){
			case soleil :
				switch(heure){
				case matin : 
					System.out.println("RobotPluie: se reposer");
					break;
				case apresmidi :
					System.out.println("RobotPluie: se reposer");
					break;
				case soir :
					System.out.println("RobotPluie: se reposer");
					break;
				}
				break;
			case pluie :
				switch(heure){
				case matin : 
					System.out.println("RobotPluie: travailler");
					break;
				case apresmidi :
					System.out.println("RobotPluie: travailler");
					break;
				case soir :
					System.out.println("RobotPluie: travailler");
					break;
				
				}
				break;
			}
		}
	}
	
	

}
