package com.asu.bmi.cad.rest.api;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

import com.asu.bmi.cad.fhir.Patient;

@Path( "FHIRService" )
public interface FHIRService
{
@Path( "Patient/{pid}" )
@GET
@Produces( { "application/xml" } )
Patient getPatient( @PathParam( "pid" ) String pid );
}