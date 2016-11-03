package co.edu.udem.olympicgames.webservices;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import co.com.udem.OlympicGames.jpa.dao.HomeDAO;
import co.com.udem.OlympicGames.jpa.dao.HomeDAOImpl;
import co.com.udem.OlympicGames.model.HomeDTO;

public class HomeServiceImpl implements HomeServiceInterface{

	@Override
	public List<HomeDTO> getHome() {
		/*List<HomeDTO> homeDTOList = new ArrayList<HomeDTO>();
		HomeDTO homeDTO = new HomeDTO();
		homeDTO.setTitle("Arenas");
		homeDTO.setImage("http://lorempixel.com/300/300/");
		homeDTO.setUrl("#");
		homeDTOList.add(homeDTO);
		
		HomeDTO homeDTO1 = new HomeDTO();
		homeDTO1.setTitle("Atletas");
		homeDTO1.setImage("http://lorempixel.com/300/300/");
		homeDTO1.setUrl("athletes");
		homeDTOList.add(homeDTO1);
		
		HomeDTO homeDTO2 = new HomeDTO();
		homeDTO2.setTitle("Medallas");
		homeDTO2.setImage("http://lorempixel.com/300/300/");
		homeDTO2.setUrl("#");
		homeDTOList.add(homeDTO2);
		
		HomeDTO homeDTO3 = new HomeDTO();
		homeDTO3.setTitle("Noticias");
		homeDTO3.setImage("http://lorempixel.com/300/300/");
		homeDTO3.setUrl("news");
		homeDTOList.add(homeDTO3);
		
		return homeDTOList;*/
		return null;
	}

	@Override
	public List<HomeDTO> getHomeJPA() {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("Spring-Datasource-JPA.xml"); 
		
		List<HomeDTO>homeDTOList = new ArrayList<HomeDTO>();
		HomeDAO homeDAO =(HomeDAO)context.getBean(HomeDAOImpl.class);
		homeDTOList = homeDAO.findHomeDTO();
		return homeDTOList;
	}
}
