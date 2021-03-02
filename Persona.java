public class Persona {
	String nombres, apellido1, apellido2, dia, mes, year, sexo, estado;
	String curp="";
	String rfc="";
	
	public Persona(String nombres, String apellido1, String apellido2, String dia, String mes, String year, String sexo, String estado) {
		setNombres(nombres);
		setApellido1(apellido1);
		setApellido2(apellido2);
		setDia(dia);
		setMes(mes);
		setYear(year);
		setSexo(sexo);
		setEstado(estado);
		
	}
	public void setNombres(String nombres){
		this.nombres = nombres;
	}
	public void setApellido1(String apellido1){
		this.apellido1 = apellido1;
	}
	public void setApellido2(String apellido2){
		this.apellido2 = apellido2;
	}
	public void setDia(String dia){
		this.dia = dia;
	}
	public void setMes(String mes){
		this.mes = mes;
	}
	public void setYear(String year){
		this.year = year;
	}
	public void setSexo(String sexo){
		this.sexo = sexo;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	public String getNombres(){
		return nombres;
	}
	public String getApellido1(){
		return apellido1;
	}
	public String getApellido2(){
		return apellido2;
	}
	public String getDia(){
		return dia;
	}
	public String getMes(){
		return mes;
	}
	public String getYear(){
		return year;
	}
	public String getSexo(){
		return sexo;
	}
	public String getEstado(){
		return estado;
	}
	
}
