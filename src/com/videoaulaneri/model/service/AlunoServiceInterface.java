package com.videoaulaneri.model.service;

import java.util.List;

import javax.inject.Inject;

import com.videoaulaneri.model.model.AlunoModel;

public interface AlunoServiceInterface {

    @Inject
	AlunoModel salvaAluno(AlunoModel alunoModel);
	
	void altera(AlunoModel alunoModel);
	
	void exclui(AlunoModel alunoModel);
	
	List<AlunoModel> getAluno();
	
}
