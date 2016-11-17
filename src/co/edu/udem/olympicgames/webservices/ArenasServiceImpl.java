 package co.edu.udem.olympicgames.webservices;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import co.com.udem.OlympicGames.jpa.dao.ArenaDAO;
import co.com.udem.OlympicGames.jpa.dao.ArenaDAOImpl;
import co.com.udem.OlympicGames.model.ArenasDTO;

public class ArenasServiceImpl implements ArenasServiceInterface{

	@Override
	public List<ArenasDTO> getArenaJPA() {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("Spring-Datasource-JPA.xml"); 
		List<ArenasDTO>arenaDTOList = new ArrayList<ArenasDTO>();
		ArenaDAO arenaDAO =(ArenaDAO)context.getBean(ArenaDAOImpl.class);
		arenaDTOList = arenaDAO.findArenaDTO();
		return arenaDTOList;
	}

}
