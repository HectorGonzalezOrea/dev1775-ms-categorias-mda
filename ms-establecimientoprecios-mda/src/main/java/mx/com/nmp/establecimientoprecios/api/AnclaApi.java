/**
 * NOTE: This class is auto generated by the swagger code generator program (2.4.10).
 * https://github.com/swagger-api/swagger-codegen
 * Do not edit the class manually.
 */
package mx.com.nmp.establecimientoprecios.api;

import io.swagger.annotations.*;
import mx.com.nmp.establecimientoprecios.model.BadRequest;
import mx.com.nmp.establecimientoprecios.model.GeneralResponse;
import mx.com.nmp.establecimientoprecios.model.InternalServerError;
import mx.com.nmp.establecimientoprecios.model.InvalidAuthentication;
import mx.com.nmp.establecimientoprecios.model.ModificarValorAnclaOroDolar;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


import javax.validation.Valid;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-01-03T00:30:35.505Z")

@Api(value = "ancla", description = "the ancla API")
public interface AnclaApi {

    @ApiOperation(value = "Solicitar cambio de valores ancla para Oro y Dolar", nickname = "anclaOroDolarPost", notes = "Solicitar cambio de valores anlca para Oro y Dolar al área encargada. `Estos cambios únicamente se podrán aplicar de manera batch` ### Seguridad Para poder realizar el consumo del recuros deberá de estar autorizado. Para esto tiene que enviar la llave en el encabezado HTTP: * 'X-API-KEY: eyJ4NXQjUzI1NiI6IkFTS1ESG42` ", response = GeneralResponse.class, authorizations = {
        @Authorization(value = "apiKey")
    }, tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Alta exitosa", response = GeneralResponse.class),
        @ApiResponse(code = 400, message = "Error en el mensaje de petición, verifique la información", response = BadRequest.class),
        @ApiResponse(code = 401, message = "Error de autorización en el uso del recurso", response = InvalidAuthentication.class),
        @ApiResponse(code = 500, message = "Error interno del servidor", response = InternalServerError.class) })
    @RequestMapping(value = "/ancla/oroDolar",
        produces = { "application/json" }, 
        method = RequestMethod.POST)
    ResponseEntity<?> anclaOroDolarPost(@ApiParam(value = "Usuario de sistema que lanza la petición" ,required=true) @RequestHeader(value="usuario", required=true) String usuario,@ApiParam(value = "Cuerpo de la petición" ,required=true )  @Valid @RequestBody ModificarValorAnclaOroDolar peticion);

}
