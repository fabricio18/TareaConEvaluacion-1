
public class MiClase
{// Ejercicios realizado en grupo con iveth sabillon
	//devuelve la suma de a y b
	static int sumarNumeros(int a, int b)
	// con esta operacion podemos hacer el calculo de la suma de dos variables.
	{
		return a+b;
	}
	
	//devuelve la resta de a y b
	static int restarNumeros(int a, int b)
	// con esta operacion podemos hacer el calculo de la resta de dos variables.
	{
		return a-b;
	}
	
	//devuelve la multiplicación de a y b
	static int multiplicarNumeros(int a, int b)
	// con esta operacion podemos hacer el calculo de la multiplicacion de dos variables.
	{
		return a*b;
	}
	
	//devuelve true si num es par, de lo contrario, devuelve false
	
	static boolean esPar(int num){
		//con esta operacion podemos realizar el calculo de la variable y verificar si el numero es par o divisible de lo contrario el resultado
		//va ser falso.
	if(num%2==0)
        return true;
     else
         return false;
}
	
	//devuelve el numero mayor entre a, b o c
	//con esta operacion simplemente podemos ver el numero mayor entre los tres numeros que podamos introducir.
	static int getMayor(int a, int b, int c)
	{
		if(a > b)
	           if(a>c)
	              return a;
	           else
	              return c;
	        else if(b>c)
	              return b;
	                else
	              return c;
	}
	
	//devuelve num elevado a la potencia
	//con esta operacion se declara una variable y se da como resultado  el operador logico.
	static int potencia(int num, int potencia)
	{
		int resultado = (int) Math.pow(num, potencia);
		return resultado;
	}
	
	//devuelve el numero mayor del arreglo
	//es la calculo de la suma de variables del arreglo.
	static int sumarArreglo(int arreglo[])
	{
		int sumarArreglo=0; 
		for (int i=0; i< arreglo.length; i++) 
		sumarArreglo+=arreglo[i]; 
		
	
		return sumarArreglo;
	}
	
	//devuelve el numero mayor de un arreglo
	// se declaran variable para obtener el numero mayor.
	static int getMayorArreglo(int arreglo[])
	{
		int imayor =0;
		for(int i=1;i<arreglo.length;i++)
			if(arreglo[i]>arreglo[imayor])
				imayor = i;
		return arreglo[imayor];

}
	
	
	//devuelve el numero menor de un arreglo
	//se declaran variable para obtener el numero menor.
	static int getMenorArreglo(int arreglo[])
	{
	int imenor =0;
	for(int i=1;i<arreglo.length;i++)
		if(arreglo[i]<arreglo[imenor])
			imenor = i;
	return arreglo[imenor];
	}
	
	//devuelve true si encuentra cadena dentro arreglo
	//ccn esto se obtiene una variable que si con tiene texto nos va a dar un resultado verdadero de lo contrario nos va dar falso.
	static boolean existe(String arreglo[],String cadena)
	{
		for(int x =0; x<arreglo.length; x++)
		{
			if(arreglo[x].equals(cadena))
				return true;
		}
		return false;
	}
	public static void main(String args[])
	{
		System.out.print("hola");
	
	}
}
