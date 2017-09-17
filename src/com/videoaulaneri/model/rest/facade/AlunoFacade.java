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
import com.videoaulaneri.model.model.AlunoModel;
import com.videoaulaneri.model.service.AlunoServiceInterface;


@Path("/alunos")
@Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
@Consumes(MediaType.APPLICATION_JSON)
public class AlunoFacade {
/*
	@Inject
	private AlunoDaoImplem alunoDaoImple;
	
	@GET
	public List<AlunoModel> getAlunoModel(){
		return alunoDaoImple.getAluno();
	}*/
	@Inject
	private AlunoServiceInterface alunoServiceInterface;
	@GET
	public List<AlunoModel> getAlunoModel() {
		return alunoServiceInterface.getAluno();
	}
	@POST
	public AlunoModel salvarAluno(AlunoModel alunoModel){		
		return alunoServiceInterface.salvaAluno(alunoModel);
	}
	@PUT
	public void atualizar(AlunoModel alunoModel){
		alunoServiceInterface.altera(alunoModel);		
	}
	@DELETE
	@Path("*/{codigoAluno}")
	public  void excluir(@PathParam("codigoAluno") Integer codigoAluno ){
		AlunoModel alunoModel = new AlunoModel();
		alunoModel.setId(codigoAluno);
		alunoServiceInterface.exclui(alunoModel);
	}
	
}
