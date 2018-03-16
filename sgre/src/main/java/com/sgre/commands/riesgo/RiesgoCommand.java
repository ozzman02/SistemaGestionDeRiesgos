package com.sgre.commands.riesgo;

import com.sgre.model.riesgo.AplicaCuentaContable;
import com.sgre.model.riesgo.ImpactoDelRiesgo;

public class RiesgoCommand {

	private String id;
	
	private String titulo;
	
	private String descripcion;
	
	private String frecuencia;
	
	private String probabilidad;
	
	private String controles_de_riesgo;
	
	private ImpactoDelRiesgo impacto_del_riesgo;
	
	private String fecha_inicio;
	
	private String fecha_conclusion;
	
	private String fecha_descubrimiento;
	
	private String fecha_registro_contable;
	
	private String monto_bruto_perdida;
	
	private String tipo_moneda_perdida_bruta;
	
	private String tipo_cambio_perdida_bruta;
	
	private String monto_total_recuperado;
	
	private String monto_neto_perdida;
	
	private String tipo_moneda_perdida_neta;
	
	private String tipo_cambio_perdida_neta;
	
	private AplicaCuentaContable aplica_cuenta_contable;
	
	private String notas_cuenta_contable;
	
	private String plazo_ejecucion;
	
	private String observaciones_generales;
	
	private String categoria_evento_perdida;
	
	private String linea_de_negocio;
	
	private String caracter_del_riesgo;
	
	private String detalle;
	
	private String area;
	
	private String accion_correctiva;
	
	private String riesgo_vinculado;
	
	private String responsable;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public String getFrecuencia() {
		return frecuencia;
	}

	public void setFrecuencia(String frecuencia) {
		this.frecuencia = frecuencia;
	}

	public String getProbabilidad() {
		return probabilidad;
	}

	public void setProbabilidad(String probabilidad) {
		this.probabilidad = probabilidad;
	}

	public String getControles_de_riesgo() {
		return controles_de_riesgo;
	}

	public void setControles_de_riesgo(String controles_de_riesgo) {
		this.controles_de_riesgo = controles_de_riesgo;
	}

	public ImpactoDelRiesgo getImpacto_del_riesgo() {
		return impacto_del_riesgo;
	}

	public void setImpacto_del_riesgo(ImpactoDelRiesgo impacto_del_riesgo) {
		this.impacto_del_riesgo = impacto_del_riesgo;
	}

	public String getFecha_inicio() {
		return fecha_inicio;
	}

	public void setFecha_inicio(String fecha_inicio) {
		this.fecha_inicio = fecha_inicio;
	}

	public String getFecha_conclusion() {
		return fecha_conclusion;
	}

	public void setFecha_conclusion(String fecha_conclusion) {
		this.fecha_conclusion = fecha_conclusion;
	}

	public String getFecha_descubrimiento() {
		return fecha_descubrimiento;
	}

	public void setFecha_descubrimiento(String fecha_descubrimiento) {
		this.fecha_descubrimiento = fecha_descubrimiento;
	}

	public String getFecha_registro_contable() {
		return fecha_registro_contable;
	}

	public void setFecha_registro_contable(String fecha_registro_contable) {
		this.fecha_registro_contable = fecha_registro_contable;
	}

	public String getMonto_bruto_perdida() {
		return monto_bruto_perdida;
	}

	public void setMonto_bruto_perdida(String monto_bruto_perdida) {
		this.monto_bruto_perdida = monto_bruto_perdida;
	}

	public String getTipo_moneda_perdida_bruta() {
		return tipo_moneda_perdida_bruta;
	}

	public void setTipo_moneda_perdida_bruta(String tipo_moneda_perdida_bruta) {
		this.tipo_moneda_perdida_bruta = tipo_moneda_perdida_bruta;
	}

	public String getTipo_cambio_perdida_bruta() {
		return tipo_cambio_perdida_bruta;
	}

	public void setTipo_cambio_perdida_bruta(String tipo_cambio_perdida_bruta) {
		this.tipo_cambio_perdida_bruta = tipo_cambio_perdida_bruta;
	}

	public String getMonto_total_recuperado() {
		return monto_total_recuperado;
	}

	public void setMonto_total_recuperado(String monto_total_recuperado) {
		this.monto_total_recuperado = monto_total_recuperado;
	}

	public String getMonto_neto_perdida() {
		return monto_neto_perdida;
	}

	public void setMonto_neto_perdida(String monto_neto_perdida) {
		this.monto_neto_perdida = monto_neto_perdida;
	}

	public String getTipo_moneda_perdida_neta() {
		return tipo_moneda_perdida_neta;
	}

	public void setTipo_moneda_perdida_neta(String tipo_moneda_perdida_neta) {
		this.tipo_moneda_perdida_neta = tipo_moneda_perdida_neta;
	}

	public String getTipo_cambio_perdida_neta() {
		return tipo_cambio_perdida_neta;
	}

	public void setTipo_cambio_perdida_neta(String tipo_cambio_perdida_neta) {
		this.tipo_cambio_perdida_neta = tipo_cambio_perdida_neta;
	}

	public AplicaCuentaContable getAplica_cuenta_contable() {
		return aplica_cuenta_contable;
	}

	public void setAplica_cuenta_contable(AplicaCuentaContable aplica_cuenta_contable) {
		this.aplica_cuenta_contable = aplica_cuenta_contable;
	}

	public String getNotas_cuenta_contable() {
		return notas_cuenta_contable;
	}

	public void setNotas_cuenta_contable(String notas_cuenta_contable) {
		this.notas_cuenta_contable = notas_cuenta_contable;
	}

	public String getPlazo_ejecucion() {
		return plazo_ejecucion;
	}

	public void setPlazo_ejecucion(String plazo_ejecucion) {
		this.plazo_ejecucion = plazo_ejecucion;
	}

	public String getObservaciones_generales() {
		return observaciones_generales;
	}

	public void setObservaciones_generales(String observaciones_generales) {
		this.observaciones_generales = observaciones_generales;
	}

	public String getCategoria_evento_perdida() {
		return categoria_evento_perdida;
	}

	public void setCategoria_evento_perdida(String categoria_evento_perdida) {
		this.categoria_evento_perdida = categoria_evento_perdida;
	}

	public String getLinea_de_negocio() {
		return linea_de_negocio;
	}

	public void setLinea_de_negocio(String linea_de_negocio) {
		this.linea_de_negocio = linea_de_negocio;
	}

	public String getCaracter_del_riesgo() {
		return caracter_del_riesgo;
	}

	public void setCaracter_del_riesgo(String caracter_del_riesgo) {
		this.caracter_del_riesgo = caracter_del_riesgo;
	}

	public String getDetalle() {
		return detalle;
	}

	public void setDetalle(String detalle) {
		this.detalle = detalle;
	}

	public String getArea() {
		return area;
	}

	public void setArea(String area) {
		this.area = area;
	}

	public String getAccion_correctiva() {
		return accion_correctiva;
	}

	public void setAccion_correctiva(String accion_correctiva) {
		this.accion_correctiva = accion_correctiva;
	}

	public String getRiesgo_vinculado() {
		return riesgo_vinculado;
	}

	public void setRiesgo_vinculado(String riesgo_vinculado) {
		this.riesgo_vinculado = riesgo_vinculado;
	}

	public String getResponsable() {
		return responsable;
	}

	public void setResponsable(String responsable) {
		this.responsable = responsable;
	}

	@Override
	public String toString() {
		return "RiesgoCommand [id=" + id + ", titulo=" + titulo + ", descripcion=" + descripcion + ", frecuencia="
				+ frecuencia + ", probabilidad=" + probabilidad + ", controles_de_riesgo=" + controles_de_riesgo
				+ ", impacto_del_riesgo=" + impacto_del_riesgo + ", fecha_inicio=" + fecha_inicio
				+ ", fecha_conclusion=" + fecha_conclusion + ", fecha_descubrimiento=" + fecha_descubrimiento
				+ ", fecha_registro_contable=" + fecha_registro_contable + ", monto_bruto_perdida="
				+ monto_bruto_perdida + ", tipo_moneda_perdida_bruta=" + tipo_moneda_perdida_bruta
				+ ", tipo_cambio_perdida_bruta=" + tipo_cambio_perdida_bruta + ", monto_total_recuperado="
				+ monto_total_recuperado + ", monto_neto_perdida=" + monto_neto_perdida + ", tipo_moneda_perdida_neta="
				+ tipo_moneda_perdida_neta + ", tipo_cambio_perdida_neta=" + tipo_cambio_perdida_neta
				+ ", aplica_cuenta_contable=" + aplica_cuenta_contable + ", notas_cuenta_contable="
				+ notas_cuenta_contable + ", plazo_ejecucion=" + plazo_ejecucion + ", observaciones_generales="
				+ observaciones_generales + ", categoria_evento_perdida=" + categoria_evento_perdida
				+ ", linea_de_negocio=" + linea_de_negocio + ", caracter_del_riesgo=" + caracter_del_riesgo
				+ ", detalle=" + detalle + ", area=" + area + ", accion_correctiva=" + accion_correctiva
				+ ", riesgo_vinculado=" + riesgo_vinculado + ", responsable=" + responsable + "]";
	}

		
}
