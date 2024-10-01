package br.com.fiap.resource;

import br.com.fiap.bo.RemedioBO;
import br.com.fiap.to.RemedioTo;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.core.Response;

import java.util.ArrayList;

@Path("/megafarma")
public class RemedioResource {
    private RemedioBO remedioBO = new RemedioBO();

    @GET
    public Response findAll() {
        ArrayList<RemedioTo> resultado = remedioBO.findAll();
        Response.ResponseBuilder response = null;
        if (response != null) {
            response = Response.ok(); // 200 OK
        } else  {
            response = Response.status(404); //NOT FOUND
        }
        response.entity(resultado);
        return response.build();
    }
}
