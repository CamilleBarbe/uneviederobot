package Observer;

import java.util.Observable;

import Observer.Monde.momentJournee;
import Observer.Monde.typemeteo;

public class RobotSoir implements Robot{

	private Monde monde;
	
	public RobotSoir(Monde monde) {
		super();
		this.monde = monde;
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
					System.out.println("RobotSoir: se reposer");
					break;
				case apresmidi :
					System.out.println("RobotSoir: se reposer");
					break;
				case soir :
					System.out.println("RobotSoir: travailler");
					break;
				}
				break;
			case pluie :
				switch(heure){
				case matin : 
					System.out.println("RobotSoir: se reposer");
					break;
				case apresmidi :
					System.out.println("RobotSoir: se reposer");
					break;
				case soir :
					System.out.println("RobotSoir: se reposer");
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
