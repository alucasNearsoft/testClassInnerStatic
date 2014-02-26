package com.companyname.col;

public class TestClass {

	private String nombre;
	
	public TestClass(String nombre) {
		this.nombre = nombre;
	}

	protected static class InnerClass {
		
		public String getNombre() {
			return nombre; // Error <--- fuerza a q nombre sea estatica, asi q ya no accede a la clase contenedora
		}
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}


}
