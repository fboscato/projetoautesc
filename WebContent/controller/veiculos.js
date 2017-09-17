var veiculoModulo = angular.module('veiculoModulo',[]);

veiculoModulo.controller("veiculoController", function($scope, $http) {
	
	urlVeiculo = 'http://localhost:8081/ProjetoAutesc/rest/veiculos';
	urlProfessor = 'http://localhost:8081/ProjetoAutesc/rest/professores';
	
	$scope.listarVeiculos = function() {
		$http.get(urlVeiculo).success(function (veiculos) {
			$scope.veiculos = veiculos;	
		}).error (function (erro) {
			alert(erro);
		});	
	}
	
	$scope.listarProfessores = function() {
		$http.get(urlProfessor).success(function (professores) {
			$scope.professores = professores;	
		}).error (function (erro) {
			alert(erro);
		});	
	}
	
	$scope.selecionaveiculo = function(veiculoSelecionado) {
		$scope.veiculo = veiculoSelecionado;
	}

	$scope.limparCampos = function() {
		$scope.veiculo = "";
	}
	
	$scope.salvar = function() {
		//alert($scope.professor.codigo);
		//console.log($scope.professor.codigo);
		if ($scope.veiculo.codigo == undefined) {
			//alert("POST - codigo vazuio = novo registro");
			//console.log("POST - codigo vazio = novo registro");
		   $http.post(urlVeiculo,$scope.veiculo).success(function(veiculo) {
		        $scope.veiculos.push($scope.veiculos);
		        $scope.limparCampos();
		        $scope.listarVeiculos();
		   }).error (function (erro) {
				alert(erro);
			});
		  	
		} else {
			//alert("PUT - codigo nao vazio = altera registro");
			//console.log("PUT - codigo nao vazio = altera registro");
			  $http.put(urlVeiculo,$scope.veiculo).success(function(veiculo) {
				  $scope.listarVeiculos();
			      $scope.limparCampos();
			   }).error (function (erro) {
					alert(erro);
				});	
		}
	}
	
	$scope.excluir = function() {
		if ($scope.veiculo.codigo == undefined) {
			alert("Favor selecionar um registro para poder excluir");
			console.log("Favor selecionar um registro para poder excluir");
		} else {
			$http.delete(urlVeiculo+'/'+$scope.veiculo.codigo).success(function () {
				 $scope.listarVeiculos();
			     $scope.limparCampos();
			  }).error (function (erro) {
					alert(erro);
				});	
		}
	}
	
	//executa
	$scope.listarVeiculos();
	$scope.listarProfessores();
	
});





