var alunoModulo = angular.module('alunoModulo',[]);

alunoModulo.controller("alunoController", function($scope, $http) {

	urlAluno = 'http://localhost:8080/autescfinal2/rest/alunos';	
			alert(1);
			$scope.listarAlunos = function() {				
				$http.get(urlAluno).success(function (alunos) {				
					$scope.alunos = alunos;	
				}).error (function (erro) {
					alert(erro);					
				});	
				}	

			$scope.selecionaAluno = function(alunoSelecionado) {
				$scope.aluno = alunoSelecionado;
			}

			$scope.limparCampos = function() {				
				$scope.aluno = "";
			}
			
			$scope.salvar = function() {
				alert(2);
				alert($scope.aluno.codigo);
				console.log($scope.aluno.codigo);
				if ($scope.aluno.codigo == undefined) {
					alert(3)
					alert("POST - codigo vazuio = novo registro");
					console.log("POST - codigo vazio = novo registro");
				   $http.post(urlAluno,$scope.aluno).success(function(aluno) {
					   alert(4)
				        $scope.alunos.push($scope.aluno);
				        $scope.limparCampos();
				        $scope.listarAlunos();
				   }).error (function (erro) {
						alert(erro);
					});
				  	
				} else {
					
					alert("PUT - codigo nao vazio = altera registro");
					console.log("PUT - codigo nao vazio = altera registro");
					  $http.put(urlAluno,$scope.aluno).success(function(aluno) {
						  $scope.listarAlunos();
					      $scope.limparCampos();
					   }).error (function (erro) {
							alert(erro);
						});	
				}
			}		
			$scope.excluir = function() {
				if ($scope.aluno.codigo == undefined) {
					alert("Favor selecionar um registro para poder excluir");
					console.log("Favor selecionar um registro para poder excluir");
				} else {
					$http.delete(urlaluno+'/'+$scope.aluno.codigo).success(function () {
						 $scope.aluno();
					     $scope.limparCampos();
					  }).error (function (erro) {
							alert(erro);
						});	
				}
			}	
			// executa
			// $scope.salvar();
		
			$scope.listarAlunos();
});	