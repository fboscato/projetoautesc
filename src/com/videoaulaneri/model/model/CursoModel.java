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

//Serializable
@XmlRootElement  
@Entity
@Table(name="curso")
public class CursoModel implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY) //gera codigo autimático
	@Column(name="cur_codigo")
	Integer codigo;
	
	@Column(name="cur_nome", length=50, nullable=false)
	String nome;
	
	@Column(name="cur_horaincial", length=50, nullable=true)
	String horaincial;
	
	@Column(name="cur_horafinal", length=50, nullable=true)
	String horafinal;
	
	@Column(name="cur_data", length=10, nullable=true)
	String data;
	
		
	@ManyToOne
	@JoinColumn(name="prof_codigo", referencedColumnName="prof_codigo")
	ProfessorModel professorModel;
	
	@ManyToOne
	@JoinColumn(name="vei_codigo", referencedColumnName="vei_codigo")
	VeiculoModel veiculoModel;
	
	
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
		CursoModel other = (CursoModel) obj;
		if (codigo == null) {
			if (other.codigo != null)
				return false;
		} else if (!codigo.equals(other.codigo))
			return false;
		return true;
	}

	public CursoModel() {
	}

	public CursoModel(Integer codigo, String nome, String horaincial, String horafinal, String data, ProfessorModel professorModel, VeiculoModel veiculoModel ) {
		this.codigo = codigo;
		this.nome = nome;
		this.horaincial = horaincial;
		this.horafinal = horafinal;
		this.data = data;
		this.professorModel = professorModel;
		this.veiculoModel = veiculoModel;
	}

	public Integer getCodigo() {
		return codigo;
	}

	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getHoraincial() {
		return horaincial;
	}

	public void setHoraincial(String horaincial) {
		this.horaincial = horaincial;
	}
	
	public String getHorafinal() {
		return horafinal;
	}

	public void setHorafinal(String horafinal) {
		this.horafinal = horafinal;
	}
	
	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}
	
	public ProfessorModel getProfessorModel() {
		return professorModel;
	}

	public void setProfessorModel(ProfessorModel professorModel) {
		this.professorModel = professorModel;
	}
	
	public VeiculoModel getVeiculoModel() {
		return veiculoModel;
	}

	public void setVeiculoModel(VeiculoModel veiculoModel) {
		this.veiculoModel = veiculoModel;
	}

}
