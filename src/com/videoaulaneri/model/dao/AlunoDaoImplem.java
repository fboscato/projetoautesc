package com.videoaulaneri.model.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import com.videoaulaneri.model.model.AlunoModel;

public class AlunoDaoImplem implements AlunoDaoInterface{
   
	@PersistenceContext(unitName="autescfinal2PersistenceUnit")
	private EntityManager entityManager;
	
	@Override
	public AlunoModel salvarAluno(AlunoModel alunoModel) {
		entityManager.persist(alunoModel);
		return alunoModel;
	}

	@Override
	public void altera(AlunoModel alunoModel) {
		AlunoModel alunoModelMerge = entityManager.merge(alunoModel);
		entityManager.persist(alunoModelMerge);
		
	}

	@Override
	public void exclui(AlunoModel alunoModel) {
		AlunoModel alunoModelMerge = entityManager.merge(alunoModel);
		entityManager.remove(alunoModelMerge);
		
	}

	@Override
	@SuppressWarnings("unchecked")
	public List<AlunoModel> getAlunos() {
		 Query query = entityManager.createQuery("from AlunoModel");
		return query.getResultList();
	}


}
