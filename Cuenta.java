package Practica;

import java.util.Random;

public class Cuenta {
	private String nombre, numcuenta = "", fechaexp, fechacad, tipo, numtarjeta = "", cvv = "", pin, clabeinter = "";
	private float saldo = 0;
	
	public void NuevaCuenta(String nombre, String fechaexp, String fechacad, String tipo, String pin, float saldo) {
		setNombre(nombre);
		setNumCuenta();
		setFechaExp(fechaexp);
		setFechaCad(fechacad);
		setTipo(tipo);
		setNumTarjeta();
		setCVV();
		setPIN(pin);
		setCLABEInter();
		setSaldo(saldo);
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	protected void setNumCuenta() {
		Random gen = new Random();
		for(int i=0; i<20; i++)
			numcuenta = numcuenta + Integer.toString((int)(gen.nextFloat()*9));
	}
	protected void setFechaExp(String fechaexp) {
		this.fechaexp = fechaexp;
	}
	protected void setFechaCad(String fechacad) {
		this.fechacad = fechacad;
	}
	protected void setTipo(String tipo) {
		this.tipo = tipo;
	}
	protected void setNumTarjeta() {
		Random gen = new Random();
		for(int i=0; i<16; i++)
			numtarjeta = numtarjeta + Integer.toString((int)(gen.nextFloat()*9));
	}
	protected void setCVV() {
		Random gen = new Random();
		for(int i=0; i<3; i++)
			cvv = cvv + Integer.toString((int)(gen.nextFloat()*9));
	}
	public void setPIN(String pin) {
		this.pin = pin;
	}
	protected void setCLABEInter() {
		Random gen = new Random();
		for(int i=0; i<18; i++)
			clabeinter = clabeinter + Integer.toString((int)(gen.nextFloat()*9));
	}
	public void setSaldo(float saldo) {
		this.saldo = saldo;
	}
	
	public String getNombre() {
		return nombre;
	}
	public String getNumCuenta() {
		return numcuenta;
	}
	public String getFechaExp() {
		return fechaexp;
	}
	public String getFechaCad() {
		return fechacad;
	}
	public String getTipo() {
		return tipo;
	}
	public String getNumTarjeta() {
		return numtarjeta;
	}
	public String getCVV() {
		return cvv;
	}
	public String getPIN() {
		return pin;
	}
	public String getCLABEInter() {
		return clabeinter;
	}
	public float getSaldo() {
		return saldo;
	}
	
	
	
}
