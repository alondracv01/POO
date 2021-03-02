public class Imprimir {
	public static void ImprimirCURP(Persona p1)
	{
		System.out.println();
		System.out.println("\nNombre: "+p1.nombres+" "+p1.apellido1+" "+p1.apellido2);
		System.out.println("Fecha de nacimiento: "+p1.dia+"/"+p1.mes+"/"+p1.year);
		System.out.println("Sexo: "+p1.sexo);
		System.out.println("Estado de nacimiento: "+p1.estado);
		System.out.println("\nCURP: "+p1.curp);
	}
	public static void ImprimirRFC(Persona p1)
	{
		System.out.println();
		System.out.println("\nNombre: "+p1.nombres+" "+p1.apellido1+" "+p1.apellido2);
		System.out.println("Fecha de nacimiento: "+p1.dia+"/"+p1.mes+"/"+p1.year);
		System.out.println("\nRFC: "+p1.rfc);
	}
	public static void ImprimirAmbas(Persona p1)
	{
		System.out.println();
		System.out.println("\nNombre: "+p1.nombres+" "+p1.apellido1+" "+p1.apellido2);
		System.out.println("Fecha de nacimiento: "+p1.dia+"/"+p1.mes+"/"+p1.year);
		System.out.println("Sexo: "+p1.sexo);
		System.out.println("Estado de nacimiento: "+p1.estado);
		System.out.println("\nCURP: "+p1.curp);
		System.out.println("RFC: "+p1.rfc);
	}
}
