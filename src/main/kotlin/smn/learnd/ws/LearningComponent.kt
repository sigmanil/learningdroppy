package smn.learnd.ws

import smn.learnd.data.LearningData
import javax.ws.rs.*
import javax.ws.rs.core.MediaType

@Path("/")
@Produces(MediaType.APPLICATION_JSON)
class LearningComponent {
    @Path("/add")
    @GET
    fun add(@QueryParam("a") a: Double, @QueryParam("b") b: Double): Double {
        return a + b
    }

    @Path("/multiply")
    @GET
    fun multiply(@QueryParam("a") a: Double, @QueryParam("b") b: Double): Double {
        return a * b
    }

    @Path("/divide")
    @GET
    fun divide(@QueryParam("a") a: Double, @QueryParam("b") b: Double): Double {
        if (b == .0) {
            throw WebApplicationException("Can't divide by zero")
        }
        return a / b
    }

    @Path("user")
    @GET
    fun retrieveUser(): LearningData {
        return LearningData("Sigmund", 38)
    }
}