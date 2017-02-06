package Observer;

import java.util.Observable;

import Observer.Monde.momentJournee;
import Observer.Monde.typemeteo;

public abstract class aRobot implements Robot {

	protected String nomRobot;
	protected Monde monde;

	public aRobot(Monde monde, String nomRobot) {
		this.monde = monde;
		this.nomRobot = nomRobot;
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public void update(Observable o, Object arg) {
		// TODO Auto-generated method stub
		if(o instanceof Monde){
			action((Monde) o);
		}
	}

	@Override
	public void action(Monde o) {
		// TODO Auto-generated method stub
			typemeteo meteo = (o).getMeteo();
			momentJournee heure = (o).getHeure();
			switch(meteo){
			case soleil :
				switch(heure){
				case matin : 
					System.out.println(nomRobot +": se reposer");
					break;
				case apresmidi :
					System.out.println(nomRobot +": se reposer");
					break;
				case soir :
					System.out.println(nomRobot +": travailler");
					break;
				}
				break;
			case pluie :
				switch(heure){
				case matin : 
					System.out.println(nomRobot +": se reposer");
					break;
				case apresmidi :
					System.out.println(nomRobot +": se reposer");
					break;
				case soir :
					System.out.println(nomRobot +": se reposer");
					break;
				
				}
				break;
			}
		}
}
