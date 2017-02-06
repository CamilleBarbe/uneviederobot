package Observer;

import java.awt.List;

import Observer.Monde.momentJournee;
import Observer.Monde.typemeteo;

public class UneVieDeRobot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Monde monde = new Monde();
		aRobotSoir robotsoir = new aRobotSoir(monde, "RobotSoir");
		aRobotMatin robotmatin = new aRobotMatin(monde, "RobotMatin");
		aRobotPluie robotpluie = new aRobotPluie(monde, "RobotPluie");

		monde.addObserver(robotmatin);
		monde.addObserver(robotsoir);
		monde.addObserver(robotpluie);
		
		monde.setHeure(momentJournee.soir);
		monde.setMeteo(typemeteo.pluie);

	}

}
