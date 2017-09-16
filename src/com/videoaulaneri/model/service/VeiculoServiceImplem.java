package com.videoaulaneri.model.service;

import java.util.List;

import javax.inject.Inject;
import javax.transaction.Transactional;

import com.videoaulaneri.model.dao.VeiculoDaoInterface;
import com.videoaulaneri.model.model.VeiculoModel;

public class VeiculoServiceImplem implements VeiculoServiceInterface{

	@Inject 
	private VeiculoDaoInterface veiculoDaoInterface;
	
	@Override
	public List<VeiculoModel> getVeiculos() {
		return veiculoDaoInterface.getVeiculos();
	}
	
	@Override
	@Transactional
	public VeiculoModel salvarVeiculo(VeiculoModel veiculoModel) {
		return veiculoDaoInterface.salvarVeiculo(veiculoModel);
	}

	@Override
	@Transactional
	public void alterar(VeiculoModel veiculoModel) {
		veiculoDaoInterface.alterar(veiculoModel);
		
	}

	@Override
	@Transactional
	public void excluir(VeiculoModel veiculoModel) {
		veiculoDaoInterface.excluir(veiculoModel);
		
	}


}
