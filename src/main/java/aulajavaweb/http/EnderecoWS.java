package aulajavaweb.http;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.core.MediaType;

@Path("endereco")
public class EnderecoWS {
	@Path("insert")
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	public void insert(){
	
	}
}
