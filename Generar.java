import java.util.Random;

public class Generar {
	public static String generarCURP(Persona p1){
		String curp="";
		int cont = 1;
		Random gen = new Random();
		
		for(int i = 0; i <p1.apellido1.length(); i++) {
			if(i == 0)
				curp = curp + p1.apellido1.charAt(i);
			else {
				if(p1.apellido1.charAt(i)==65||p1.apellido1.charAt(i)==69||p1.apellido1.charAt(i)==73||p1.apellido1.charAt(i)==79||p1.apellido1.charAt(i)==85) {
					curp = curp + p1.apellido1.charAt(i);
					break;
				}
			}
		}
		
		curp = curp + p1.apellido2.charAt(0);
		
		if(p1.nombres.charAt(0)=='J'&& p1.nombres.charAt(1)=='O'&&p1.nombres.charAt(2)=='S'&&p1.nombres.charAt(3)=='E'&&p1.nombres.charAt(4)==' ') {
			curp = curp + p1.nombres.charAt(5);
			cont = 6;
		}
		else {
			if(p1.nombres.charAt(0)=='M'&& p1.nombres.charAt(1)=='A'&&p1.nombres.charAt(2)=='R'&&p1.nombres.charAt(3)=='I'&&p1.nombres.charAt(4)=='A'&&p1.nombres.charAt(5)==' ') {
				curp = curp + p1.nombres.charAt(6);
				cont = 7;
			}
			else 
				curp = curp + p1.nombres.charAt(0);
		}
		
		curp = curp + p1.year.charAt(2) + p1.year.charAt(3) + p1.mes.charAt(0) + p1.mes.charAt(1) + p1.dia.charAt(0) + p1.dia.charAt(1);
		
		if (p1.sexo.equals("MASCULINO"))
			curp = curp + "H";
		else
			curp = curp + "M";
		
		switch(p1.getEstado()) {
		case "AGUASCALIENTES": curp = curp + "AS"; break;
		case "BAJA CALIFORNIA": curp = curp + "BC"; break; 
		case "BAJA CALIFORNIA SUR": curp = curp + "BS"; break; 
		case "CAMPECHE": curp = curp + "CC"; break;
		case "COAHUILA": curp = curp + "CL"; break;
		case "COLIMA": curp = curp + "CM"; break;
		case "CHIAPAS": curp = curp + "CS"; break;
		case "CHIHUAHUA": curp = curp + "CH"; break;
		case "DISTRITO FEDERAL": curp = curp + "DF"; break;
		case "DURANGO": curp = curp + "DG"; break;
		case "GUANAJUATO": curp = curp + "GT"; break;
		case "GUERRERO": curp = curp + "GR"; break;
		case "HIDALGO": curp = curp + "HG"; break;
		case "JALISCO": curp = curp + "JC"; break;
		case "MEXICO": curp = curp + "MC"; break;
		case "MICHOACAN": curp = curp + "MN"; break;
		case "MORELOS": curp = curp + "MS"; break;
		case "NAYARIT": curp = curp + "NT"; break;
		case "NUEVO LEON": curp = curp + "NL"; break;
		case "OAXACA": curp = curp + "OC"; break;
		case "PUEBLA": curp = curp + "PL"; break;
		case "QUERETARO": curp = curp + "QT"; break;
		case "QUINTANA ROO": curp = curp + "QR"; break;
		case "SAN LUIS POTOSI": curp = curp + "SP"; break;
		case "SINALOA": curp = curp + "SL"; break;
		case "SONORA": curp = curp + "SR"; break;
		case "TABASCO": curp = curp + "TC"; break;
		case "TAMAULIPAS": curp = curp + "TS"; break;
		case "TLAXCALA": curp = curp + "TL"; break;
		case "VERACRUZ": curp = curp + "VZ"; break;
		case "YUCATAN": curp = curp + "YN"; break;
		case "ZACATECAS": curp = curp + "ZS"; break;
		case "NACIDO EN EL EXTRANJERO": curp = curp + "NE"; break;
		}
		
		for(int i = 1; i <p1.apellido1.length(); i++) {
			if(p1.apellido1.charAt(i)!=65&&p1.apellido1.charAt(i)!=69&&p1.apellido1.charAt(i)!=73&&p1.apellido1.charAt(i)!=79&&p1.apellido1.charAt(i)!=85) {
				curp = curp + p1.apellido1.charAt(i);
				break;
			}
		}
		
		for(int i = 1; i <p1.apellido2.length(); i++) {
			if(p1.apellido2.charAt(i)!=65&&p1.apellido2.charAt(i)!=69&&p1.apellido2.charAt(i)!=73&&p1.apellido2.charAt(i)!=79&&p1.apellido2.charAt(i)!=85) {
				curp = curp + p1.apellido2.charAt(i);
				break;
			}
		}
		
		for(int i = cont; i <p1.nombres.length(); i++) {
			if(p1.nombres.charAt(i)!=65&&p1.nombres.charAt(i)!=69&&p1.nombres.charAt(i)!=73&&p1.nombres.charAt(i)!=79&&p1.nombres.charAt(i)!=85) {
				curp = curp + p1.nombres.charAt(i);
				break;
			}
		}
		
		if(Float.parseFloat(p1.year) < 2000.00)
			curp = curp + Integer.toString((int)(gen.nextDouble()*9));
		else {
			
			curp = curp + Character.toString((int)((gen.nextDouble()*25)+65));
		}
		
		curp = curp + Integer.toString((int)(gen.nextDouble()*9));
		
		
		return curp;
	}
	
	public static String generarRFC(Persona p1){
		String rfc="";
		Random gen = new Random();
		
		for(int i = 0; i <p1.apellido1.length(); i++) {
			if(i == 0)
				rfc = rfc + p1.apellido1.charAt(i);
			else {
				if(p1.apellido1.charAt(i)==65||p1.apellido1.charAt(i)==69||p1.apellido1.charAt(i)==73||p1.apellido1.charAt(i)==79||p1.apellido1.charAt(i)==85) {
					rfc = rfc + p1.apellido1.charAt(i);
					break;
				}
			}
		}
		rfc = rfc + p1.apellido2.charAt(0);
		if(p1.nombres.charAt(0)=='J'&& p1.nombres.charAt(1)=='O'&&p1.nombres.charAt(2)=='S'&&p1.nombres.charAt(3)=='E'&&p1.nombres.charAt(4)==' ') {
			rfc = rfc + p1.nombres.charAt(5);
		}
		else {
			if(p1.nombres.charAt(0)=='M'&& p1.nombres.charAt(1)=='A'&&p1.nombres.charAt(2)=='R'&&p1.nombres.charAt(3)=='I'&&p1.nombres.charAt(4)=='A'&&p1.nombres.charAt(5)==' ') {
				rfc = rfc + p1.nombres.charAt(6);
			}
			else 
				rfc = rfc + p1.nombres.charAt(0);
		}
		rfc = rfc + p1.year.charAt(2) + p1.year.charAt(3) + p1.mes.charAt(0) + p1.mes.charAt(1) + p1.dia.charAt(0) + p1.dia.charAt(1);
		
		for(int i=0; i<=1; i++) {
			if(((int)(gen.nextDouble()))==0)
				rfc = rfc + Character.toString((int)((gen.nextDouble()*25)+65));
			else
				rfc = rfc + Integer.toString((int)(gen.nextDouble()*9));
		}
		rfc = rfc + Integer.toString((int)(gen.nextDouble()*9));
		
		return rfc;
	}
}