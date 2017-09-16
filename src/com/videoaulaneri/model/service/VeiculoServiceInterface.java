package com.videoaulaneri.model.service;

import java.util.List;


import com.videoaulaneri.model.model.VeiculoModel;

public interface VeiculoServiceInterface {
	
	VeiculoModel salvarVeiculo(VeiculoModel veiculoModel);
	  
	  void alterar(VeiculoModel veiculoModel);
	  
	  void excluir(VeiculoModel veiculoModel);
	  
	  List<VeiculoModel> getVeiculos();
	

}
