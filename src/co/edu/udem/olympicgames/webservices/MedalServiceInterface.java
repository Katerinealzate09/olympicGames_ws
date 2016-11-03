package co.edu.udem.olympicgames.webservices;

import java.util.List;

import co.com.udem.OlympicGames.model.MedalDTO;

public interface MedalServiceInterface {

	public List<MedalDTO> getMedalJPA();
}
