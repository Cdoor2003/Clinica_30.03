package model;

public class Administrativo extends Trabajador {
	private String direccionEmail;

	public Administrativo(String tituloProfesional, String nombre, String direccion, String estadoCivil, String rut, String horarioTrabajo, String direccionEmail) {
		super(tituloProfesional, nombre, direccion, estadoCivil, rut, horarioTrabajo);
		this.direccionEmail = direccionEmail;
	}

	public String getDireccionEmail() {
		return this.direccionEmail;
	}

	public void setDireccionEmail(String direccionEmail) {
		this.direccionEmail = direccionEmail;
	}

	public String getTipo(){
		return "Administrativo";
	}

	public String toString() {
		return "Nombre: "+getNombre()+" Tipo: "+getTipo();
	}
}