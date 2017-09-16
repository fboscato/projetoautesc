package com.videoaulaneri.model.dao;

import java.util.List;

import com.videoaulaneri.model.model.VeiculoModel;

public interface VeiculoDaoInterface {
	
	VeiculoModel salvarVeiculo(VeiculoModel veiculoModel);
  
  void alterar(VeiculoModel veiculoModel);
  
  void excluir(VeiculoModel veiculoModel);
  
  List<VeiculoModel> getVeiculos();
  
}

