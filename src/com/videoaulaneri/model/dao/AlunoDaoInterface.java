package com.videoaulaneri.model.dao;

import java.util.List;

import com.videoaulaneri.model.model.AlunoModel;

public interface AlunoDaoInterface {
	
	AlunoModel salvarAluno(AlunoModel alunoModel);
	
	void altera(AlunoModel alunoModel);
	
	void exclui(AlunoModel alunoModel);
	
	List<AlunoModel> getAlunos();
}
