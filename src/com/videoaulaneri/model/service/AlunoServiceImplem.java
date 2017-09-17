package com.videoaulaneri.model.service;

import java.util.List;

import javax.inject.Inject;
import javax.transaction.Transactional;

import com.videoaulaneri.model.dao.AlunoDaoInterface;
import com.videoaulaneri.model.model.AlunoModel;

public class AlunoServiceImplem implements AlunoServiceInterface{

	@Inject
	private AlunoDaoInterface alunoDaoInterface;
	
	@Override
	@Transactional
	public AlunoModel salvaAluno(AlunoModel alunoModel) {
		return alunoDaoInterface.salvarAluno(alunoModel);
	}

	@Override
	public void altera(AlunoModel alunoModel) {
		alunoDaoInterface.altera(alunoModel);
		
	}

	@Override
	public void exclui(AlunoModel alunoModel) {
		alunoDaoInterface.exclui(alunoModel);
		
	}

	@Override
	public List<AlunoModel> getAluno() {		
		return alunoDaoInterface.getAlunos();
	}

}
