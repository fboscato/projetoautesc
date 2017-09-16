package com.videoaulaneri.model.rest.facade;

import java.util.List;

import javax.inject.Inject;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.videoaulaneri.model.model.VeiculoModel;
import com.videoaulaneri.model.service.VeiculoServiceInterface;


@Path("/veiculos")
@Produces({MediaType.APPLICATION_JSON,
		MediaType.APPLICATION_XML})
@Consumes(MediaType.APPLICATION_JSON)
public class VeiculosRestFacade{
	
	
	/*direto, sem o uso de serviço
	@Inject 
	private ProfessorDaoImplem professorDaoImplem;
	@GET
	public List<ProfessorModel> getProfessores() {
		return professorDaoImplem.getProfessores();
	}*/
	
	@Inject
	private VeiculoServiceInterface veiculoServiceInterface; 
	
	@GET
	public List<VeiculoModel> getVeiculos() {
		return veiculoServiceInterface.getVeiculos();
	}
	
	@POST
	public VeiculoModel salvarVeiculo(VeiculoModel veiculoModel) {
		return veiculoServiceInterface.salvarVeiculo(veiculoModel);
	}
	
	@PUT
	public void atualizar(VeiculoModel veiculoModel) {
		veiculoServiceInterface.alterar(veiculoModel);
	}
	
	@DELETE
	@Path("/{codigoVeiculo}")
	public void excluir(@PathParam("codigoVeiculo") Integer codigoVeiculo) {
		VeiculoModel veiculoModel = new VeiculoModel();
		veiculoModel.setCodigo(codigoVeiculo);
		veiculoServiceInterface.excluir(veiculoModel);
		
	}
}

