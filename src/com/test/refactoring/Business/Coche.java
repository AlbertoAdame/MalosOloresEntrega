package com.test.refactoring.Business;
/**
 *  Clase coche
 * @author estudiante
 *@version 1.0
 */
public class Coche {
	/**
	 * Info
	 */
	private CocheInfo cocheDatos = new CocheInfo(new ConductorInfoCoche());
	/**
	 * Constructor
	 */
	public Coche() {
		super();
	}
	/**
	 * Constructor coche
	 * @param matricula ma
	 * @param color color
	 * @param combustible  combustible
	 * @param numPlazas numPlazas
	 * @param nombreConductor nombreConductor
	 * @param dniConductor dniConductor
	 */
	public Coche(String matricula, String color, String combustible, Integer numPlazas, String nombreConductor, String dniConductor) {
		super();
		this.cocheDatos.matricula = matricula;
		this.cocheDatos.color = color;
		this.cocheDatos.combustible = combustible;
		this.cocheDatos.numPlazas =  numPlazas;
		this.cocheDatos.conductorDatos.nombreConductor = nombreConductor;
		this.cocheDatos.conductorDatos.dniConductor = dniConductor;
	}
	/**
	 * getMatricula
	 * @return matricula
	 */
	public String getMatricula() {
		return cocheDatos.matricula;
	}
	/**
	 * Set matricula
	 * @param matricula ma
	 */
	public void setMatricula(String matricula) {
		this.cocheDatos.matricula = matricula;
	}
	/**
	 * Get color
	 * @return color
	 */
	public String getColor() {
		return cocheDatos.color;
	}
	/**
	 *  Set color
	 * @param color color
	 */
	public void setColor(String color) {
		this.cocheDatos.color = color;
	}
	/**
	 * Get combustible
	 * @return comb
	 */
	public String getCombustible() {
		return cocheDatos.combustible;
	}
	/**
	 * Set combustible
	 * @param combustible comb
	 */
	public void setCombustible(String combustible) {
		this.cocheDatos.combustible = combustible;
	}
	/**
	 * Get num 
	 * @return num
	 */
	public Integer getNumPlazas() {
		return cocheDatos.numPlazas;
	}
	/**
	 * Set num
	 * @param numPlazas num
	 */
	public void setNumPlazas(Integer numPlazas) {
		this.cocheDatos.numPlazas = numPlazas;
	}
	/**
	 * Get nom
	 * @return nom
	 */
	public String getNombre_conductor() {
		return cocheDatos.conductorDatos.nombreConductor;
	}
	/**
	 * Set nom
	 * @param nombreConductor nombre
	 */
	public void setNombreConductor(String nombreConductor) {
		this.cocheDatos.conductorDatos.nombreConductor = nombreConductor;
	}
	/**
	 * Get dni
	 * @return dni
	 */
	public String getDniConductor() {
		return cocheDatos.conductorDatos.dniConductor;
	}
	/**
	 * Set dni
	 * @param dniConductor dni
	 */
	public void setDniConductor(String dniConductor) {
		this.cocheDatos.conductorDatos.dniConductor = dniConductor;
	}
	/**
	 * Acelerar
	 * @param velocidad vel
	 */
	public void acelerar(Integer velocidad) {
		if (velocidad > 0 && velocidad < 120) {
			System.out.println("El coche est� acelerando y llegar� la velocidad de " + velocidad.intValue() + " km/h");
		} else {
			System.out.println("La velocidad indicada no est� permitida en un coche seg�n la DGT");
		}
	}
	/**
	 * Detener
	 */
	public void detener() {
		System.out.println("El coche se detendr� en breve, aseg�rese de buscar un lugar adecuado para estacionar");
	}

	@Override
	public String toString() {
		return "Coche [matricula=" + cocheDatos.matricula + ", color=" + cocheDatos.color + ", combustible=" + cocheDatos.combustible + ", numPlazas="
				+ cocheDatos.numPlazas + ", nombre_conductor=" + cocheDatos.conductorDatos.nombreConductor + ", dniConductor=" + cocheDatos.conductorDatos.dniConductor + "]";
	}

}
