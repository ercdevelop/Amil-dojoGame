package br.com.playerDojo.Resources;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

import br.com.playerDojo.Bean.MatchBean;
import br.com.playerDojo.DAO.MatchDAO;


@Path("match")
public class MatchResources {
	
	@Path("{id}")
	@GET
	@Produces(javax.ws.rs.core.MediaType.APPLICATION_XML)
	public String busca(@PathParam("id")long id){
		MatchBean  matchBean = new MatchDAO().busca(1L);
		return matchBean.toXML();
		
	}

}
