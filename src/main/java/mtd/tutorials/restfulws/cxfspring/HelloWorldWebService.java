package mtd.tutorials.restfulws.cxfspring;

import static javax.ws.rs.core.MediaType.APPLICATION_JSON;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;

@Path("/helloWorld")
public class HelloWorldWebService {

  @GET
  @Path("/echo/{input}")
  @Produces(APPLICATION_JSON)
  public String ping(@PathParam("input") String input) {
    return input;
  }
  
  @Path("/jsonBean")
  @POST
  @Consumes(APPLICATION_JSON)
  @Produces(APPLICATION_JSON)
  public Response modifyJson(JsonBean input) {
    input.setVal2(input.getVal1());
    return Response.ok().entity(input).build();
  }
}
