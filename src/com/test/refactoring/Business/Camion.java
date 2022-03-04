package com.test.refactoring.Business;
/**
 * Clase camion
 * @author estudiante
 * @version 1.0
 *
 */
public class Camion {
	/**
	 * Datos camion y conductor
	 */
	private CamionDatos camion = new CamionDatos(new ConductorInfoCamion());
	/**
	 * COnstructor
	 */
	public Camion() {
		super();
	}
	/**
	 * Constructos camion
	 * 
	 * @param matricula matricula
	 * @param color color
	 * @param combustible combustible
	 * @param tipoCarnet tipoCarnet
	 * @param nombreConductor nombreConductor
	 * @param dniConductor dniConductor
	 */
	public Camion(String matricula, String color, String combustible, String tipoCarnet, String nombreConductor, String dniConductor) {
		super();
		this.camion.matricula = matricula;
		this.camion.color = color;
		this.camion.combustible = combustible;
		this.camion.Conductor.tipoCarnet = tipoCarnet;
		this.camion.Conductor.nombreConductor = nombreConductor;
		this.camion.Conductor.dniConductor = dniConductor;
	}
	/**
	 * Get matricula
	 * @return matricula
	 */
	public String getMatricula() {
		return camion.matricula;
	}
	/**
	 * Set matricula
	 * @param matricula ma
	 */
	public void setMatricula(String matricula) {
		this.camion.matricula = matricula;
	}
	/**
	 * Get color
	 * @return color
	 */
	public String getColor() {
		return camion.color;
	}
	/**
	 * Set color
	 * @param color color
	 */
	public void setColor(String color) {
		this.camion.color = color;
	}
	/**
	 * Get comb
	 * @return comb
	 */
	public String getCombustible() {
		return camion.combustible;
	}
	/**
	 * combustible
	 * @param combustible com
	 */
	public void setCombustible(String combustible) {
		this.camion.combustible = combustible;
	}
	/**
	 * Get tipo
	 * @return tipo
	 */
	public String getTipoCarnet() {
		return camion.Conductor.tipoCarnet;
	}
	/**
	 * Set tipo
	 * @param tipoCarnet tipo
	 */
	public void setTipoCarnet(String tipoCarnet) {
		this.camion.Conductor.tipoCarnet = tipoCarnet;
	}
	/**
	 * Get nombre
	 * @return nombre
	 */
	public String getNombreConductor() {
		return camion.Conductor.nombreConductor;
	}
	/**
	 * Set nombre
	 * @param nombreConductor nombre
	 */
	public void setNombreConductor(String nombreConductor) {
		this.camion.Conductor.nombreConductor = nombreConductor;
	}
	/**
	 * Get dni
	 * @return dni
	 */
	public String getDniConductor() {
		return camion.Conductor.dniConductor;
	}
	/**
	 * Set dni
	 * @param dniConductor dni
	 */
	public void setDniConductor(String dniConductor) {
		this.camion.Conductor.dniConductor = dniConductor;
	}
	/**
	 * Acelerar 
	 * @param velocidad velocidad
	 */
	public void Acelerar(Integer velocidad) {
		System.out.println("La aceleraci�n del cami�n se realizar� progresivamente para conservar sus neum�ticos");
		
		//TO DO
		//Incluir l�gica de movimiento
	}
	/**
	 * Detener
	 */
	public void Detener() {
		System.out.println("CUIDADO!! La detenci�n de un veh�culo de gran tama�o puede ocasionar accidentes de tr�fico");
	}

	@Override
	public String toString() {
		return "Camion [matricula=" + camion.matricula + ", color=" + camion.color + ", combustible=" + camion.combustible + ", tipoCarnet="
				+ camion.Conductor.tipoCarnet + ", nombre_conductor=" + camion.Conductor.nombreConductor + ", dniConductor=" + camion.Conductor.dniConductor + "]";
	}
	
}
