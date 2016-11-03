package co.edu.udem.olympicgames.webservices;

import java.util.List;

import co.com.udem.OlympicGames.model.NewsDTO;

public interface NewsServiceInterface {

	public List<NewsDTO> getNews();
	public List<NewsDTO> getNewsJPA();
}
