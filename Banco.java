package Practica;

public class Banco extends Cuenta{
	protected Cuenta cuentas[] = new Cuenta[0], copia[] = new Cuenta[0];
	private int numcuentas;
	private Cuenta nuevocliente = new Cuenta();
	
	public void nuevaCuenta() {
		int i;
		numcuentas = 0;
		numcuentas = cuentas.length;
		copia = cuentas.clone();
		cuentas = new Cuenta[numcuentas+1];
		
		nuevocliente.NuevaCuenta(CapturaEntrada.capturarString("Nombre del titular"), CapturaEntrada.capturarString("Fecha de expedicion"),
				CapturaEntrada.capturarString("Fecha de caducidad"), CapturaEntrada.capturarString("Tipo de cuenta"), 
				CapturaEntrada.capturarString("PIN"), CapturaEntrada.capturarFloat("Primer deposito"));
		
		
		for(i=0; i<=numcuentas; i++) {
			if(i==numcuentas) {
				cuentas[i] = nuevocliente;
			}
			else {
				cuentas[i] = copia[i];
			}
		}
		
		System.out.println("\nRegistro exitoso\n");
	}
	
	public String VerificarUsuario() {
		String nombre, pin;
		int veri=0;
		String numcuenta = "";
		numcuentas= 0;
		numcuentas = cuentas.length;
		
		nombre = CapturaEntrada.capturarString("Nombre");
		pin = CapturaEntrada.capturarString("PIN");
		for(int i=0; i<numcuentas; i++) {
			if (cuentas[i].getNombre().equals(nombre)&&cuentas[i].getPIN().equals(pin)) {
				numcuenta= cuentas[i].getNumCuenta();
				veri = 1;
				break;
			}
		}
		if(veri == 0)
			System.out.println("\nNombre o PIN incorrecto\n");
		return numcuenta;
	}
	
	public void Depositar(String numcuenta, float cant) {
		float saldo = 0;
		for(int i=0; i<numcuentas; i++) {
			if (cuentas[i].getNumCuenta().equals(numcuenta)) {
				saldo = cuentas[i].getSaldo()+cant;
				cuentas[i].setSaldo(saldo);
				System.out.println("\nSaldo actualizado: "+cuentas[i].getSaldo()+"\n");
				break;
			}
		}
	}
	public void Retirar(String numcuenta, float cant) {
		float saldo = 0;
		for(int i=0; i<numcuentas; i++) {
			if (cuentas[i].getNumCuenta().equals(numcuenta)) {
				saldo = cuentas[i].getSaldo()-cant;
				cuentas[i].setSaldo(saldo);
				System.out.println("\nSaldo actualizado: "+cuentas[i].getSaldo()+"\n");
				break;
			}
		}
	}
	public void ConsultaSaldo(String numcuenta) {
		for(int i=0; i<numcuentas; i++) {
			if (cuentas[i].getNumCuenta().equals(numcuenta)) {
				System.out.println("\nTitular: "+cuentas[i].getNombre());
				System.out.println("\nNumero de cuenta: "+cuentas[i].getNumCuenta());
				System.out.println("\nNumero de tarjeta: "+cuentas[i].getNumTarjeta());
				System.out.println("Saldo: "+cuentas[i].getSaldo()+"\n");
				break;
			}
		}
	}
}
