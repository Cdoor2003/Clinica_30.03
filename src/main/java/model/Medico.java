package model;

public class Medico extends Trabajador {
	private String especializacion;
	private String horarioAtencion;
	private String pacientesAsignados;
	private String experiencia;

	public Medico(String tituloProfesional, String nombre, String direccion, String estadoCivil, String rut, String horarioTrabajo, String especializacion, String horarioAtencion, String pacientesAsignados, String experiencia) {
		super(tituloProfesional, nombre, direccion, estadoCivil, rut, horarioTrabajo);
		this.especializacion = especializacion;
		this.horarioAtencion = horarioAtencion;
		this.pacientesAsignados = pacientesAsignados;
		this.experiencia = experiencia;
	}

	public String getEspecializacion() {
		return this.especializacion;
	}

	public void setEspecializacion(String especializacion) {
		this.especializacion = especializacion;
	}

	public String getHorarioAtencion() {
		return this.horarioAtencion;
	}

	public void setHorarioAtencion(String horarioAtencion) {
		this.horarioAtencion = horarioAtencion;
	}

	public String getPacientesAsignados() {
		return this.pacientesAsignados;
	}

	public void setPacientesAsignados(String pacientesAsignados) {
		this.pacientesAsignados = pacientesAsignados;
	}

	public String getExperiencia() {
		return this.experiencia;
	}

	public void setExperiencia(String experiencia) {
		this.experiencia = experiencia;
	}

	public String getTipo(){
		return "Medico";
	}

	public String toString() {
		return "Nombre: "+getNombre()+" Tipo: "+getTipo();
	}
}