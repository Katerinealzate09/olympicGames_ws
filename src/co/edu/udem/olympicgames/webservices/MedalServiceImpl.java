package co.edu.udem.olympicgames.webservices;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import co.com.udem.OlympicGames.jpa.dao.MedalDAO;
import co.com.udem.OlympicGames.jpa.dao.MedalDAOImpl;
import co.com.udem.OlympicGames.model.MedalDTO;

public class MedalServiceImpl implements MedalServiceInterface{

	@Override
	public List<MedalDTO> getMedalJPA() {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("Spring-Datasource-JPA.xml"); 
		 List<MedalDTO> medalDTOList = new ArrayList<MedalDTO>();
		 MedalDAO medalDAO =(MedalDAO)context.getBean(MedalDAOImpl.class);
		 medalDTOList = medalDAO.findMedalDTO();
		return medalDTOList;
	}

}
