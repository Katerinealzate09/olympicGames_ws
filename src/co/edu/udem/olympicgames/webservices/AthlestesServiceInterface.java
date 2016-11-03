package co.edu.udem.olympicgames.webservices;

import java.util.List;

import co.com.udem.OlympicGames.model.AthletesDTO;

public interface AthlestesServiceInterface {

	public List<AthletesDTO> getAthletes();
	public List<AthletesDTO> getAthletesJPA();
}
