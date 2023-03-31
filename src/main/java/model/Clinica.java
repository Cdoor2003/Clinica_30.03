package model;

import java.util.ArrayList;
import model.Trabajador;
import model.EspecialidadMedica;

public class Clinica {
	private String nombre;
	private String direccionesAsociadas;
	private String tipoClinica;
	private ArrayList<Trabajador> trabajadores = new ArrayList<Trabajador>();
	private ArrayList<EspecialidadMedica> especialidadesMedicas = new ArrayList<EspecialidadMedica>();

	public Clinica(String nombre, String direccionesAsociadas, String tipoClinica, ArrayList<Trabajador> trabajadores, ArrayList<EspecialidadMedica> especialidadesMedicas) {
		this.nombre = nombre;
		this.direccionesAsociadas = direccionesAsociadas;
		this.tipoClinica = tipoClinica;
		this.trabajadores = trabajadores;
		this.especialidadesMedicas = especialidadesMedicas;
	}

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDireccionesAsociadas() {
		return this.direccionesAsociadas;
	}

	public void setDireccionesAsociadas(String direccionesAsociadas) {
		this.direccionesAsociadas = direccionesAsociadas;
	}

	public String getTipoClinica() {
		return this.tipoClinica;
	}

	public void setTipoClinica(String tipoClinica) {
		this.tipoClinica = tipoClinica;
	}

	public ArrayList<Medico> obtenerMedicos() {
		ArrayList<Medico> medicos = new ArrayList<Medico>();
		for(Trabajador trabajador : this.trabajadores){
			if(trabajador.getTipo().equals("Medico")){
				medicos.add((Medico) trabajador);
			}
		}
		return medicos;
	}

	public ArrayList<Administrativo> obtenerAdministrativos() {
		ArrayList<Administrativo> administrativos = new ArrayList<Administrativo>();
		for(Trabajador trabajador: this.trabajadores){
			if(trabajador.getTipo().equals("Administrativo")){
				administrativos.add((Administrativo) trabajador);
			}
		}
		return administrativos;
	}

	public ArrayList<Medico> obtenerMedicosPorEspecialidad(String nombreEspecialidad) {
		ArrayList<Medico> medicos = new ArrayList<Medico>();
		for(EspecialidadMedica especialidadMedica: especialidadesMedicas){
			if(especialidadMedica.getNombre().equals(nombreEspecialidad)){
				for(Trabajador trabajador: especialidadMedica.getMedicos()){
					if(trabajador.getTipo().equals("Medico")){
						medicos.add((Medico) trabajador);
					}
				}
			}
		}
		return medicos;
	}

	public Administrativo obtenerAdministrativoNombreRut(String nombreOrut) {
		for(Trabajador trabajador: this.trabajadores){
			if(trabajador.getTipo().equals("Administrativo")){
				if(trabajador.getNombre().equals(nombreOrut) || trabajador.getRut().equals(nombreOrut)){
					return (Administrativo) trabajador;
				}
			}
		}
		return null;
	}
}