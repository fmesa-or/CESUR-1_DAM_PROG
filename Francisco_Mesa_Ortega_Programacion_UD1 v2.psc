Proceso CalcularModulo
	// Definimos las variables de enteros donde almacenar el dividendo 'N' y el divisor 'M'
	Definir N, M Como Entero;
	
	// Las inicializamos a 0
	N <- 0;
	M <- 0;
	// Creamos un bucle mientras N sea 0 o menor
	//Mostramos en pantalla un mensaje solicitando un valor y almacenamos el valor como dividendo
	//Si sigue siendo menor que 1, mostramos un mensaje de error, y el bucle se reinicia.
	Mientras N < 1 Hacer
		Escribir 'Ingrese el numero: ';
		Leer N;
		Si N < 1 Entonces
			Escribir 'Error: El valor ingresado debe ser mayor que cero.';
		FinSi
	FinMientras
	// Creamos un bucle mientras M sea 0 o menor
	//Mostramos en pantalla un mensaje solicitando un valor y almacenamos el valor como dividendo
	//Si sigue siendo menor que 1, mostramos un mensaje de error, y el bucle se reinicia.
	Mientras M < 1 Hacer
		Escribir 'Ingrese divisor: ';
		Leer M;
		Si M < 1 Entonces
			Escribir 'Error: El valor ingresado debe ser mayor que cero.';
		FinSi
	FinMientras
	// Si el modulo es igual a 0, mostramos en pantalla el mensaje del "divisor exacto"
	Si N MOD M = 0 Entonces
		Escribir M, ' es divisor exacto de ', N, '.';
		// De lo contrario, mostramos por pantalla el valor del resto con el siguiente mensaje
	SiNo
		Escribir 'El resto de dividir ', N, ' por ', M, ' es: ', N MOD M;
	FinSi
FinProceso
