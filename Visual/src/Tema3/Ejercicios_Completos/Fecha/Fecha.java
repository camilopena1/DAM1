package Tema3.Ejercicios_Completos.Fecha;

public class Fecha {
    private int dia;
	private int mes;
	private int anno;

	public Fecha() {
		this.dia = 0;
		this.mes = 0;
		this.anno = 0;
	}

	public Fecha(int dia, int mes, int anno) {
		this.dia = dia;
		this.mes = mes;
		this.anno = anno;
	}

	public boolean esBisiesto(int i) {
		return (anno % 4 == 0 && anno % 100 != 0) || (anno % 400 == 0);
	}

	// Método para calcular días transcurridos entre dos fechas
	public int diasTranscurridos(int otroDia, int otroMes, int otroAnno) {
		// Validar fechas
		if (!validarFecha(otroDia, otroMes, otroAnno)) {
			System.out.println("Fecha no válida.");
			return -1;
		}

		int dias = 0;

		// Sumar días de los años completos
		for (int i = anno; i < otroAnno; i++) {
			dias += esBisiesto(i) ? 366 : 365;
		}

		// Sumar días del año actual hasta la fecha introducida
		dias += diasHastaFinalDeAnno();
		// Sumar días del año introducido hasta la fecha
		dias -= new Fecha(otroDia, otroMes, otroAnno).diasHastaInicioDeAnno();

		// Restar un día si la fecha final ya pasó
		if (otroAnno > anno || (otroAnno == anno && otroMes > mes)
				|| (otroAnno == anno && otroMes == mes && otroDia > dia)) {
			dias--;
		}

		return dias;
	}

	// Método para calcular días bisiestos en un año específico
	private int diasBisiestosEnAnno(int anno) {
		return (anno % 4 == 0 && anno % 100 != 0) || (anno % 400 == 0) ? 1 : 0;
	}

	// Método para obtener días hasta el final del año
	private int diasHastaFinalDeAnno() {
		int dias = 0;
		for (int i = mes + 1; i <= 12; i++) {
			dias += diasEnMes(i); // Usar el método díasEnMes
		}
		return dias;
	}

	// Método para obtener días hasta el inicio del año
	private int diasHastaInicioDeAnno() {
		int dias = 0;
		for (int i = 1; i < mes; i++) {
			dias += diasEnMes(i); // Usar el método díasEnMes
		}
		return dias;
	}

	// Método para obtener la cantidad de días en un mes
	private int diasEnMes(int mes) {
		return 30; // Todos los meses tienen 30 días (simplificación)
	}

	// Método para obtener la fecha como cadena en formato DD/MM/AAAA
	public String obtenerFechaComoCadena() {
		return String.format("%02d/%02d/%04d", dia, mes, anno);
	}

	// Método para comparar dos fechas
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null || getClass() != obj.getClass()) {
			return false;
		}
		Fecha otraFecha = (Fecha) obj;
		return dia == otraFecha.dia && mes == otraFecha.mes && anno == otraFecha.anno;
	}

	// Método para validar una fecha
	public static boolean validarFecha(int dia, int mes, int anno) {
		if (mes < 1 || mes > 12 || dia < 1 || dia > 31) {
			System.out.println("Fecha no válida. Mes o día fuera de rango.");
			return false;
		}
		return true;
	}
}
