package model;

import java.io.Serializable;
import javax.persistence.*;



/**
 * The persistent class for the estacionamiento database table.
 * 
 */
@Entity
@Table(name="estacionamiento")
@NamedQuery(name="Estacionamiento.findAll", query="SELECT a FROM Estacionamiento a")
public class Estacionamiento implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="idestacionamiento", unique=true, nullable=false)
	private int idestacionamiento;

	@Column(name="nombreEstacionamiento", nullable=false, length=45)
	private String nombreEstacionamiento;

	@Column(name="capacidad", unique=true, nullable=false)
	private int capacidad;
	
	@Column(name="ocupados", unique=true, nullable=false)
	private int ocupados;
	
	@Column(name="ubicacion", unique=true, nullable=false)
	private byte[] ubicacion;
	
	public Estacionamiento() {
	}

	public int getIdestacionamiento() {
		return idestacionamiento;
	}

	public void setIdestacionamiento(int idestacionameinto) {
		this.idestacionamiento = idestacionameinto;
	}

	public String getNombreEstacionamiento() {
		return nombreEstacionamiento;
	}

	public void setNombreEstacionamiento(String nombreEstacionamiento) {
		this.nombreEstacionamiento = nombreEstacionamiento;
	}

	public int getCapacidad() {
		return capacidad;
	}

	public void setCapacidad(int capacidad) {
		this.capacidad = capacidad;
	}

	public int getOcupados() {
		return ocupados;
	}

	public void setOcupados(int ocupados) {
		this.ocupados = ocupados;
	}

	public byte[] getUbicacion() {
		return ubicacion;
	}

	public void setUbicacion(byte[] ubicacion) {
		this.ubicacion = ubicacion;
	}
	
	
	
}
