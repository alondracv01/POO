package practica6;

public class Animal{
	protected String nombre;
	protected int edad;
	protected String sexo;
	protected boolean vacunado;
	protected boolean sedado;
	
		public Animal(String nombre, int edad, String sexo, boolean vacunado, boolean sedado){
			setNombre(nombre);
			setEdad(edad);
			setSexo(sexo);
			setVacunado(vacunado);
			setSedado(sedado);
		}
		
		//Metodos
		public void Dormir(){
			System.out.println(nombre + ": duerme" );	
		}
		
		public void Comer(){
		System.out.println(nombre + ": esta comiendo" );	
		}
		
		//getters & setters
		public String getNombre(){
			return nombre;
		}
		
		public void setNombre(String nombre){
			this.nombre = nombre;
		}
		
		public int getEdad(){
			return edad;
		}
		
		public void setEdad(int edad){
			this.edad = edad;
		}
		
		public String getSexo(){
			return sexo;
		}
		
		public void setSexo(String sexo){
			this.sexo = sexo;
		}
		
		public boolean getVacunado(){
			return vacunado;
		}
		
		public void setVacunado(boolean vacunado){
			this.vacunado = vacunado;
		}
		
		public boolean getSedado(){
			return sedado;
		}
		
		public void setSedado(boolean sedado){
			this.sedado = sedado;
		}
}