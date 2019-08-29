package com.senati.ejercicio2;

import java.util.HashSet;
import java.util.Set;


public class ListarEmpresa extends Cargo {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Empleado  em01 = new Empleado(1, "Jefe de Sistemas", 87 , 75151248 , "Carlos", "Carbajal", 18, 12);
		Empleado em02 = new Empleado(2, "Responsable de Infraestructura", 45 , 11223344 , "Juan", "Gomez" , 24, 05 );
		
		
		Set <Empleado> empleadoCargo = new HashSet<Empleado>();
		empleadoCargo.add(em01);
		empleadoCargo.add(em02);
		
		
		for (Empleado empleado : empleadoCargo) {
			System.out.println(empleado.getId()+ " ) " + empleado.getNombre1() + " , " + empleado.getSueldo() + " , " + empleado.getDNI() + " , " + empleado.getNombre() + " , " + empleado.getApellidos() + " , " + empleado.getEdad() + " , " + empleado.getGrupo());
		}
		
	}
}
