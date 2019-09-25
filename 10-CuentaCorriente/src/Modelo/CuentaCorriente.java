package Modelo;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class CuentaCorriente {

	private int identificador;
	private Cliente cliente;
	private float cantidad;
	private Date fechaInicio;
	private final int INTERES = 3;

	public CuentaCorriente(Cliente cliente) {
		super();
		this.identificador = (int) Math.random();
		this.cliente = cliente;

		SimpleDateFormat formatoDelTexto = new SimpleDateFormat("yyyy-MM-dd");

		try {
			fechaInicio = formatoDelTexto.parse("2021-01-01");
		} catch (ParseException e) {

			e.printStackTrace();
		}
	}

	public float interesesGenerados() {

		Date fechaActual = new Date();

		SimpleDateFormat formatoDelTexto = new SimpleDateFormat("yyyy-MM-dd");

		try {
			fechaActual = formatoDelTexto.parse("2022-01-01");
		} catch (ParseException e) {

			e.printStackTrace();
		}

		int diff = fechaActual.getYear() - fechaInicio.getYear();

		float r = (this.INTERES * cantidad) / 100;

		return r * diff;
	}

	public boolean ingresar(int identificador, Cliente cl, float cantidad) {

		boolean opCorr = false;

		if (this.identificador == identificador) {
			opCorr = true;

			this.cantidad += cantidad;

			System.out.println("Cliente: " + cl.getNombre() + " ha realizado un ingreso de " + cantidad
					+ "€ a el cliente " + this.cliente.getNombre());
		} else {
			System.out.println("La operacion ha fallado");
		}

		return opCorr;
	}

	public int getIdentificador() {
		return identificador;
	}

	public void setIdentificador(int identificador) {
		this.identificador = identificador;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public float getCantidad() {
		return cantidad;
	}

	public void setCantidad(float cantidad) {
		this.cantidad = cantidad;
	}

	public Date getFechaInicio() {
		return fechaInicio;
	}

	public void setFechaInicio(Date fechaInicia) {
		this.fechaInicio = fechaInicia;
	}

}
