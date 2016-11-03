package co.edu.udem.olympicgames.webservices;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import co.com.udem.OlympicGames.model.ArenasDTO;
import co.com.udem.OlympicGames.model.AthletesDTO;
import co.com.udem.OlympicGames.model.HomeDTO;
import co.com.udem.OlympicGames.model.MedalDTO;
import co.com.udem.OlympicGames.model.NewsDTO;

@Path("/json/servicesfacade")
public class OlympicServiceFacadeWS {
	//get es select
	@GET
	@Path("/getnews")
	@Produces(MediaType.APPLICATION_JSON)
	public List<NewsDTO> getNewsWS(){
		OlympicServiceFacade facade = OlympicServiceFacade.getInstance();
		return facade.getNewsJPA();
	}
	
	@GET
	@Path("/gethome")
	@Produces(MediaType.APPLICATION_JSON)
	public List<HomeDTO> getHomeWS(){
		OlympicServiceFacade facade = OlympicServiceFacade.getInstance();
		return facade.getHomeJPA();
	}
	
	@GET
	@Path("/getathletes")
	@Produces(MediaType.APPLICATION_JSON)
	public List<AthletesDTO>getAthletesWS(){
		OlympicServiceFacade facade = OlympicServiceFacade.getInstance();
		return facade.getAthletesJPA();
	}
	
	@GET
	@Path("/getarenas")
	@Produces(MediaType.APPLICATION_JSON)
	public List<ArenasDTO>getArenasWS(){
		OlympicServiceFacade facade = OlympicServiceFacade.getInstance();
		return facade.getArenasJPA();
	}
	
	@GET
	@Path("/getmedal")
	@Produces(MediaType.APPLICATION_JSON)
	public List<MedalDTO>getMedalWS(){
		OlympicServiceFacade facade = OlympicServiceFacade.getInstance();
		return facade.getMedalJPA();
	}

}
