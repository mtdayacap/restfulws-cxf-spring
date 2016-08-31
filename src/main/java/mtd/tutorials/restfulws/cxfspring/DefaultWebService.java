package mtd.tutorials.restfulws.cxfspring;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

public class DefaultWebService {
  
  @GET
  @Path("/")
  public String entryPoint(){
    return "Hello Mike!";
  }
}
