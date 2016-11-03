package co.edu.udem.olympicgames.webservices;

import java.util.List;

import co.com.udem.OlympicGames.model.HomeDTO;

public interface HomeServiceInterface {

	public List<HomeDTO> getHome();
	public List<HomeDTO> getHomeJPA();
	
}
