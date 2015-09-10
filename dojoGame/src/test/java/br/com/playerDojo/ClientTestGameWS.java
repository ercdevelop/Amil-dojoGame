package br.com.playerDojo;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.WebTarget;

import junit.framework.Assert;

import org.glassfish.grizzly.http.server.HttpServer;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import br.com.playerDojo.Bean.MatchBean;
import br.com.playerDojo.Servidor.Servidor;

import com.thoughtworks.xstream.XStream;

/**
 * Teste do Web Services - Utilizando o protocolo REST
 * @author ercon_000
 *
 */
public class ClientTestGameWS {
	
	private HttpServer server;
	
	@Before
	public void startarOServidor(){
		server = Servidor.inicializaServidor();
	}
	
	@After
	public void pararServidor(){
		server.stop();
	}

	
	@Test
	public void testaConexao(){
		
		
		Client client = ClientBuilder.newClient();
		
		 WebTarget target =  client.target("http://localhost:8080");
		 String conteudo = target.path("/match/1").request().get(String.class);
		 MatchBean bean = (MatchBean) new XStream().fromXML(conteudo);
		 System.out.println(conteudo);
		 
		 
		 Assert.assertEquals(1L, bean.getMatch().getId());
		 
		
	}
	
	


}
