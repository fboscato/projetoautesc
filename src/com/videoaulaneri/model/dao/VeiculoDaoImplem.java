package com.videoaulaneri.model.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import com.videoaulaneri.model.model.VeiculoModel;

public class VeiculoDaoImplem implements VeiculoDaoInterface{

	@PersistenceContext(unitName="ProjetoAutescPresistenceUnit")
	private EntityManager entityManager;
	
	//professor Neri
	@Override
	public VeiculoModel salvarVeiculo(VeiculoModel veiculoModel) {
		entityManager.persist(veiculoModel);
		return veiculoModel;
	}

	@Override
	public void alterar(VeiculoModel veiculoModel) {
		VeiculoModel veiculoModelMerge = entityManager.merge(veiculoModel);
		entityManager.persist(veiculoModelMerge);
		
	}

	@Override
	public void excluir(VeiculoModel veiculoModel) {
		VeiculoModel veiculoModelMerge = entityManager.merge(veiculoModel);
		entityManager.remove(veiculoModelMerge);
		
	}

	@Override
	@SuppressWarnings("unchecked")
	public List<VeiculoModel> getVeiculos() {
	    Query query = entityManager.createQuery("from VeiculoModel");
	    return query.getResultList();
	}

}
