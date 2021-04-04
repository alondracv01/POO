package practica6;

public class Veterinario {
	String nombre;
	double salario;
	
	public Veterinario (String nombre, double salario) {
		setNombre(nombre);
		setSalario(salario);
	}
	
	//Metodos
	public void vacunar(Animal animal) {
		animal.setVacunado(true);
		System.out.println("\n" + animal.getNombre()+ " fue vacunado por el veterianario " + getNombre());
	}
	
	public void revisar(Animal animal) {
		System.out.println("\nEl veterinario " + getNombre() + " le hizo su revision de rutina a " + animal.getNombre());
	}
	
	public void tomarMuestra(Animal animal) {
		System.out.println("\nEl vaterinario " + getNombre() + " tomo una muestra de sangre de " + animal.getNombre());
	}
	
	public void sedar(Animal animal) {
		animal.setSedado(true);
		System.out.println("\n" + animal.getNombre()+ " fue sedado por el veterinario " + getNombre());
	}
	
	//getters & setters
	public String getNombre(){
		return nombre;
	}
	
	public void setNombre(String nombre){
		this.nombre = nombre;
	}
	
	public double getSalario(){
		return salario;
	}
	
	public void setSalario(double salario){
		this.salario = salario;
	}
}
