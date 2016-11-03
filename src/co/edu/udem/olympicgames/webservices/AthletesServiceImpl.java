package co.edu.udem.olympicgames.webservices;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import co.com.udem.OlympicGames.jpa.dao.AthleteDAO;
import co.com.udem.OlympicGames.jpa.dao.AthleteDAOImpl;
import co.com.udem.OlympicGames.model.AthletesDTO;

public class AthletesServiceImpl implements AthlestesServiceInterface{

	@Override
	public List<AthletesDTO> getAthletes() {
		/*List<AthletesDTO> athletesDTOList = new ArrayList<AthletesDTO>();
		AthletesDTO athletesDTO = new AthletesDTO();
		athletesDTO.setImage("http://lorempixel.com/500/500/");
		athletesDTO.setName("Mariana Pajon");
		athletesDTO.setSport("BMX");
		athletesDTO.setNationality("Colombia");
		athletesDTOList.add(athletesDTO);
		
		AthletesDTO athletesDTO1 = new AthletesDTO();
		athletesDTO1.setImage("http://lorempixel.com/500/500/");
		athletesDTO1.setName("Catherine I.");
		athletesDTO1.setSport("Atletismo");
		athletesDTO1.setNationality("Colombia");
		athletesDTOList.add(athletesDTO1);
		
		AthletesDTO athletesDTO2 = new AthletesDTO();
		athletesDTO2.setImage("http://lorempixel.com/500/500/");
		athletesDTO2.setName("Manolo Cardona");
		athletesDTO2.setSport("Nadador");
		athletesDTO2.setNationality("Argentina");
		athletesDTOList.add(athletesDTO2);
		
		AthletesDTO athletesDTO3 = new AthletesDTO();
		athletesDTO3.setImage("http://lorempixel.com/500/500/");
		athletesDTO3.setName("Milena Toro");
		athletesDTO3.setSport("Nadadora");
		athletesDTO3.setNationality("USA");
		athletesDTOList.add(athletesDTO3);
		
		return athletesDTOList;*/
	return null;
	}

	@Override
	public List<AthletesDTO> getAthletesJPA() {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("Spring-Datasource-JPA.xml"); 
		 List<AthletesDTO> athletesDTOList = new ArrayList<AthletesDTO>();
		 AthleteDAO athleteDAO = (AthleteDAO)context.getBean(AthleteDAOImpl.class);
		 athletesDTOList = athleteDAO.findAthleteDTO();
		 return athletesDTOList;
	}

}
