package com.senati.ejercicio2;

public class Empleado extends Cargo{
	int DNI;
	String nombre;
	String apellidos;
	int edad;
	int grupo;
	public Empleado() {
		super();
	}
	public Empleado(int id, String nombre1, float sueldo, int dNI, String nombre, String apellidos, int edad, int grupo) {
		super(id, nombre1, sueldo);
		DNI = dNI;
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.edad = edad;
		this.grupo = grupo;
	}
	/**
	 * @return the dNI
	 */
	public int getDNI() {
		return DNI;
	}
	/**
	 * @param dNI the dNI to set
	 */
	public void setDNI(int dNI) {
		DNI = dNI;
	}
	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}
	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	/**
	 * @return the apellidos
	 */
	public String getApellidos() {
		return apellidos;
	}
	/**
	 * @param apellidos the apellidos to set
	 */
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}
	/**
	 * @return the edad
	 */
	public int getEdad() {
		return edad;
	}
	/**
	 * @param edad the edad to set
	 */
	public void setEdad(int edad) {
		this.edad = edad;
	}
	/**
	 * @return the grupo
	 */
	public int getGrupo() {
		return grupo;
	}
	/**
	 * @param grupo the grupo to set
	 */
	public void setGrupo(int grupo) {
		this.grupo = grupo;
	}
	@Override
	public String toString() {
		return "Empleado [DNI=" + DNI + ", nombre=" + nombre + ", apellidos=" + apellidos + ", edad=" + edad
				+ ", grupo=" + grupo + ", id=" + id + ", nombre1=" + nombre1 + ", sueldo=" + sueldo + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + DNI;
		result = prime * result + ((apellidos == null) ? 0 : apellidos.hashCode());
		result = prime * result + edad;
		result = prime * result + grupo;
		result = prime * result + ((nombre == null) ? 0 : nombre.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Empleado other = (Empleado) obj;
		if (DNI != other.DNI)
			return false;
		if (apellidos == null) {
			if (other.apellidos != null)
				return false;
		} else if (!apellidos.equals(other.apellidos))
			return false;
		if (edad != other.edad)
			return false;
		if (grupo != other.grupo)
			return false;
		if (nombre == null) {
			if (other.nombre != null)
				return false;
		} else if (!nombre.equals(other.nombre))
			return false;
		return true;
	}
	
}
