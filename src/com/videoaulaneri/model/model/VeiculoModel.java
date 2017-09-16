package com.videoaulaneri.model.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
@Entity 
@Table (name="veiculos")
public class VeiculoModel implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id //indica chave primaria
	@GeneratedValue(strategy=GenerationType.IDENTITY)//gera codigo automatico
	@Column(name="vei_codigo")
	Integer codigo;
	
	@Column(name="vei_mod", length=50, nullable=false)
	String mod;
	
	@Column(name="vei_kminicial", length=50, nullable=false)
	String kminicial;
	
	@Column(name="vei_data", length=50, nullable=false)
	String data;
	
	@Column(name="vei_placa", length=50, nullable=false)
	String placa;
	
	@ManyToOne
	@JoinColumn(name="prof_codigo", referencedColumnName="prof_codigo")
	ProfessorModel professorModel;
	
	public VeiculoModel() {
			
	}
	
	public VeiculoModel(Integer codigo,String mod ,ProfessorModel professorModel, String kminicial, String placa, String data) {
		this.codigo = codigo;
		
		this.kminicial = kminicial;
		this.data = data;
		this.placa = placa;
		this.professorModel = professorModel;
		this.mod = mod;
	}


	

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((codigo == null) ? 0 : codigo.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		VeiculoModel other = (VeiculoModel) obj;
		if (codigo == null) {
			if (other.codigo != null)
				return false;
		} else if (!codigo.equals(other.codigo))
			return false;
		return true;
	}

	public Integer getCodigo() {
		return codigo;
	}
	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}
	
	public String getMod() {
		return mod;
	}
	public void setMod(String mod) {
		this.mod = mod;
	}
	
	public String getKminicial() {
		return kminicial;
	}
	public void setKminicial(String kminicial) {
		this.kminicial = kminicial;
	}
	
	public String getData() {
		return data;
	}
	public void setData(String data) {
		this.data = data;
	}
	
	public String getPlaca() {
		return placa;
	}
	public void setPlaca(String placa) {
		this.placa = placa;
	}
	public ProfessorModel getProfessorModel() {
		return professorModel;
	}

	public void setProfessorModel(ProfessorModel professorModel) {
		this.professorModel = professorModel;
	}
	
	
}
