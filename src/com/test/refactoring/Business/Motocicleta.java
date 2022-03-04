package com.test.refactoring.Business;
/**
 * Clase Moto
 * @author estudiante
 *@version 1.0
 */
public class Motocicleta {
	/**
	 * Info conductor y moto
	 */
	private ConductorInfoMoto conductorDatos = new ConductorInfoMoto(new MotocicletaInfo());
	/**
	 * COnstruncotr
	 * @param matricula matricula
	 * @param color color
	 * @param combustible combustible
	 * @param cilindrada  cilindrada
	 * @param nombreConductor nombreConductor
	 * @param dniConductor dniConductor
	 */
	public Motocicleta(String matricula, String color, String combustible, Integer cilindrada, String nombreConductor,
			String dniConductor) {
		super();
		this.conductorDatos.motoDatos.matricula = matricula;
		this.conductorDatos.motoDatos.color = color;
		this.conductorDatos.motoDatos.combustible = combustible;
		this.conductorDatos.motoDatos.cilindrada = cilindrada;
		this.conductorDatos.nombreConductor = nombreConductor;
		this.conductorDatos.dniConductor = dniConductor;
	}
	/**
	 * Get mat
	 * @return amtricula
	 */
	public String getMatricula() {
		return conductorDatos.motoDatos.matricula;
	}
	/**
	 * Set matridula
	 * @param matricula mat
	 */
	public void setMatricula(String matricula) {
		this.conductorDatos.motoDatos.matricula = matricula;
	}
	/**
	 * get colot
	 * @return color
	 */
	public String getColor() {
		return conductorDatos.motoDatos.color;
	}
	/**
	 * set color
	 * @param color color
	 */
	public void setColor(String color) {
		this.conductorDatos.motoDatos.color = color;
	}
	/**
	 * get combustibnle
	 * @return comb
	 */
	public String getCombustible() {
		return conductorDatos.motoDatos.combustible;
	}
	/**
	 * set combustible
	 * @param combustible comb
	 */
	public void setCombustible(String combustible) {
		this.conductorDatos.motoDatos.combustible = combustible;
	}
	/**
	 * get cil
	 * @return cilindrad
	 */
	public Integer getCilindrada() {
		return conductorDatos.motoDatos.cilindrada;
	}
	/**
	 * set  cilindro
	 * @param cilindrada cilindro
	 */
	public void setCilindrada(Integer cilindrada) {
		this.conductorDatos.motoDatos.cilindrada = cilindrada;
	}
	/**
	 * get nombre
	 * @return nombre
	 */
	public String getNombreConductor() {
		return conductorDatos.nombreConductor;
	}
	/**
	 * set nombre
	 * @param nombreConductor nombre
	 */
	public void setNombreConductor(String nombreConductor) {
		this.conductorDatos.nombreConductor = nombreConductor;
	}
	/**
	 * get dni
	 * @return dni
	 */
	public String getDniConductor() {
		return conductorDatos.dniConductor;
	}
	/**
	 * set dni
	 * @param dniConductor dni
	 */
	public void setDniConductor(String dniConductor) {
		this.conductorDatos.dniConductor = dniConductor;
	}
	/**
	 * acelerar
	 * @param velocidad vel
	 */
	public void Acelerar(Integer velocidad) {
		//TO DO
	}
	/**
	 * Detener
	 */
	public void Detener() {
		//TO DO
	}

	@Override
	public String toString() {
		return "motocicleta [matricula=" + conductorDatos.motoDatos.matricula + ", color=" + conductorDatos.motoDatos.color + ", combustible=" + conductorDatos.motoDatos.combustible
				+ ", cilindrada=" + conductorDatos.motoDatos.cilindrada + ", nombre_conductor=" + conductorDatos.nombreConductor + ", dniConductor="
				+ conductorDatos.dniConductor + "]";
	}	

}
