package com.test.refactoring.Business;
/**
 * Camion datos
 * @author estudiante
 * @version 1.0
 */
public class CamionDatos {
	/**
	 * matricula
	 */
	public String matricula;
	/**
	 * color
	 */
	public String color;
	/**
	 * comb
	 */
	public String combustible;
	/**
	 * cond
	 */
	public ConductorInfoCamion Conductor;
	/**
	 * COnstructor
	 * @param conductor conductor
	 */
	public CamionDatos(ConductorInfoCamion conductor) {
		Conductor = conductor;
	}
}