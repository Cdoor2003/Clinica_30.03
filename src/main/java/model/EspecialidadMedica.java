package model;

import java.util.ArrayList;
import model.Administrativo;
import model.Medico;

public class EspecialidadMedica {
	private String nombre;
	private String latitud;
	private String longitud;
	private ArrayList<Administrativo> administrativos;
	private ArrayList<Medico> medicos;

	public EspecialidadMedica(String nombre, String latitud, String longitud, ArrayList<Administrativo> administrativos, ArrayList<Medico> medicos) {
		this.nombre = nombre;
		this.latitud = latitud;
		this.longitud = longitud;
		this.administrativos = administrativos;
		this.medicos = medicos;
	}

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getLatitud() {
		return this.latitud;
	}

	public void setLatitud(String latitud) {
		this.latitud = latitud;
	}

	public String getLongitud() {
		return this.longitud;
	}

	public void setLongitud(String longitud) {
		this.longitud = longitud;
	}

	public ArrayList<Administrativo> getAdministrativos() {
		return administrativos;
	}

	public void setAdministrativos(ArrayList<Administrativo> administrativos) {
		this.administrativos = administrativos;
	}

	public ArrayList<Medico> getMedicos() {
		return medicos;
	}

	public void setMedicos(ArrayList<Medico> medicos) {
		this.medicos = medicos;
	}
}