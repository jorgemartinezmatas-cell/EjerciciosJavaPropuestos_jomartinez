package com.example;
import java.util.*;

public class EjerciciosJava30 {
    public static void main(String[] args) {
        int menu = -1;
        System.out.println("Bienvenido a los ejercicios de Java. porfa ponme un 10 :)");
        Scanner scanner = new Scanner(System.in);
        while (menu != 0) {
            System.out.println("\n");
            System.out.println("Menu de opciones");
            System.out.println("0. Salir del menu");
            System.out.println("1. ejercicio 1 Imprime los numeros pares del 1 al 100");
            System.out.println("2. ejercicio 2 Imprime los numeros impares del 1 al 100");
            System.out.println("3. ejercicio 3 Calcula la suma de los numeros del 1 al 50");
            System.out.println("4. ejercicio 4 Imprime la tabla de multiplicar de un numero dado");
            System.out.println("5. ejercicio 5 Calcula el factorial de un numero dado (tambien para numeros negativos)");
            System.out.println("6. ejercicio 6 Encuentra el numero mas alto de tres numeros dados");
            System.out.println("7. ejercicio 7 Calcula la media de 5 notas y determina si el alumno ha aprobado o suspendido");
            System.out.println("8. ejercicio 8 Calcula si un numero es positivo, negativo o cero");
            System.out.println("9. ejercicio 9 Calcula si un año es bisiesto o no");
            System.out.println("10. ejercicio 10 Dado un numero, imprime la serie de Fibonacci hasta ese numero");
            System.out.println("11. ejercicio 11 Calcula si un numero es par o impar");
            System.out.println("12. ejercicio 12 Calcula el area de un circulo dado su radio");
            System.out.println("13. ejercicio 13 Convierte grados Celsius a Fahrenheit");
            System.out.println("14. ejercicio 14 Encuentra el numero mas alto de tres numeros dados");
            System.out.println("15. ejercicio 15 Calcula el factorial de un numero");
            System.out.println("16. ejercicio 16 Cuenta el numero de vocales en una frase");
            System.out.println("17. ejercicio 17 Comprueba si una frase es un palíndromo");
            System.out.println("18. ejercicio 18 Calcula el mínimo común múltiplo (mcm) de dos números");
            System.out.println("19. ejercicio 19 Calcula la suma de los números en un arreglo");
            System.out.println("20. ejercicio 20 Calcula el promedio de los números en un arreglo");
            System.out.println("21. ejercicio 21 Invierte un arreglo de números");
            System.out.println("22. ejercicio 22 Busca un número en un arreglo");
            System.out.println("23. ejercicio 23 Ordena un arreglo de números");
            System.out.println("24. ejercicio 24 Elimina los duplicados de un arreglo de números");
            System.out.println("25. ejercicio 25 Intercala dos arreglos de números");
            System.out.println("26. ejercicio 26 Calcula la transpuesta de una matriz");
            System.out.println("27. ejercicio 27 Suma dos matrices");
            System.out.println("28. ejercicio 28 Multiplica dos matrices");
            System.out.println("29. ejercicio 29 Encuentra el numero mayor en una matriz");
            System.out.println("30. ejercicio 30 Encuentra los numeros mayores a un numero dado en una matriz");
            System.out.print("Introduzca el numero de la opcion: ");
            menu = scanner.nextInt();
            scanner.nextLine();
            System.out.println();

            switch (menu) {
                case 1:
                    ejercicio1();
                    break;
                case 2:
                    ejercicio2();
                    break;
                case 3:
                    ejercicio3();
                    break;
                case 4:
                    ejercicio4();
                    break;
                case 5:
                    ejercicio5();
                    break;
                case 6:
                    ejercicio6();
                    break;
                case 7:
                    ejercicio7();
                    break;
                case 8:
                    ejercicio8();
                    break;
                case 9:
                    ejercicio9();
                    break;
                case 10:
                    ejercicio10();
                    break;
                case 11:
                    System.out.print("Dime un numero: ");
                    int num = scanner.nextInt();
                    boolean esPar = ejercicio11(num);
                    System.out.println("El numero es " + (esPar ? "par" : "impar"));
                    break;
                case 12:
                    System.out.print("Dime el radio del circulo: ");
                    double radio = scanner.nextDouble();
                    final double PI = 3.14159;
                    double area = ejercicio12(radio, PI);
                    System.out.print("Area = " + PI + " * " + radio + "² = " + area);
                    break;
                case 13:
                    System.out.print("Dime los grados en celsius: ");
                    double celsius = scanner.nextDouble();
                    double fahrenheit = ejercicio13(celsius);
                    System.out.print(celsius + " grados Celsius = " + fahrenheit + " grados Fahrenheit");
                    break;
                case 14:
                    System.out.print("Dime el primer numero: ");
                    int num1 = scanner.nextInt();
                    System.out.print("Dime el segundo numero: ");
                    int num2 = scanner.nextInt();
                    System.out.print("Dime el tercer numero: ");
                    int num3 = scanner.nextInt();
                    int resultado = ejercicio14(num1, num2, num3);
                    System.out.println("El numero mas alto es: " + resultado);
                    break;
                case 15:
                    System.out.print("Dime un numero para hacer su factorial: ");
                    num = scanner.nextInt();
                    long factorial = ejercicio15(num);
                    System.out.println("El factorial de " + num + " es: " + factorial);
                    break;
                case 16:
                    System.out.print("Dime una frase: ");
                    String frase = scanner.nextLine();
                    int numVocales = ejercicio16(frase);
                    System.out.println("La frase es: " + frase);
                    System.out.println("El numero de vocales es: " + numVocales);
                    break;
                case 17:
                    System.out.print("Dime una frase: ");
                    frase = scanner.nextLine();
                    boolean esPalindromo = ejercicio17(frase);
                    System.out.println("La frase es: " + frase);
                    System.out.println("Es palindromo: " + (esPalindromo ? "Sí" : "No"));
                    break;
                case 18:
                    System.out.print("Dime un primer numero: ");
                    num1 = scanner.nextInt();
                    System.out.print("Dime un segundo numero: ");
                    num2 = scanner.nextInt();
                    int mcm = ejercicio18(num1, num2);
                    System.out.println("El mcm de " + num1 + " y " + num2 + " es: " + mcm);
                    break;
                case 19:
                    System.out.print("Dime longitud de un arreglo (cantidad de numeros a sumar): ");
                    num = scanner.nextInt();
                    int[] sumaArray = java.util.stream.IntStream.rangeClosed(1, num).toArray();
                    int suma = ejercicio19(sumaArray);
                    System.out.println("La suma de los numeros del 1 al " + num + " es: " + suma);
                    break;
                case 20:
                    System.out.print("Dime longitud de un arreglo (cantidad de numeros a hacer promedio): ");
                    num = scanner.nextInt();
                    int[] numerosArray = new int[num];
                    int numero = 0;
                    for (int i = 0; i < num; i++) {
                        System.out.print("Dime un numero: ");
                        numero = scanner.nextInt();
                        numerosArray[i] = numero;
                    }
                    double promedio = ejercicio20(numerosArray);
                    System.out.println("El promedio de los numeros es: " + promedio);
                    break;
                case 21:
                    ejercicio21();
                    break;
                case 22:
                    ejercicio22();
                    break;
                case 23:
                    ejercicio23();
                    break;
                case 24:
                    ejercicio24();
                    break;
                case 25:
                    ejercicio25();
                    break;
                case 26:
                    ejercicio26();
                    break;
                case 27:
                    ejercicio27();
                    break;
                case 28:
                    ejercicio28();
                    break;
                case 29:
                    ejercicio29();
                    break;
                case 30:
                    ejercicio30();
                    break;
                default:
                    break;
            }
        }
        scanner.close();
    }

    public static void ejercicio1() { // Imprime los numeros pares del 1 al 100
        int[] numeros = java.util.stream.IntStream.rangeClosed(1, 100).toArray();
        for (int i = 0; i < numeros.length; i++) {
            if (i % 2 != 0) {
                System.out.println(numeros[i]);
            }
        }
        return;
    }

    public static void ejercicio2() { // Imprime los numeros impares del 1 al 100
        int[] numeros = java.util.stream.IntStream.rangeClosed(1, 100).toArray();
        for (int i = 0; i < numeros.length; i++) {
            if (i % 2 == 0) {
                System.out.println(numeros[i]);
            }
        }
        return;
    }

    public static void ejercicio3() { // Calcula la suma de los numeros del 1 al 50
        int[] numeros = java.util.stream.IntStream.rangeClosed(1, 50).toArray();
        int suma = 0;
        for (int i = 0; i < numeros.length; i++) {
            suma += numeros[i];
        }
        System.out.print("La suma de los numeros del 1 al 50 es: " + suma);
        return;
    }

    public static void ejercicio4() { // Imprime la tabla de multiplicar de un numero dado
        Scanner scanner = new Scanner(System.in);
        int[] numeros = java.util.stream.IntStream.rangeClosed(1, 10).toArray();
        System.out.print("Dime un numero para ver su tabla de multiplicar: ");
        int num = scanner.nextInt();
        for (int i = 1; i < numeros.length + 1; i++) {
            System.out.println(i + " * " + num + " = " + (i * num));
        }
        return;
    }

    public static void ejercicio5() { // Calcula el factorial de un numero dado (tambien para numeros negativos)
        Scanner scanner = new Scanner(System.in);
        System.out.print("Dime un numero para hacer su factorial: ");
        int num = scanner.nextInt();
        int originalNum = num;
        long factorial = 1;
        boolean isNegative = false;
        if (num < 0) {
            num *= -1;
            isNegative = true;
        }
        while (num != 0) {
            factorial *= num;
            num--;
        }
        if (isNegative) {
            System.out.print("El factorial de " + originalNum + " es: " + (factorial *= -1));
        } else {
            System.out.print("El factorial de " + originalNum + " es: " + factorial);
        }
        return;
    }

    public static void ejercicio6() { // Encuentra el numero mas alto de tres numeros dados
        Scanner scanner = new Scanner(System.in);
        System.out.print("Dime un primer numero: ");
        int num1 = scanner.nextInt();
        System.out.print("Dime un segundo numero: ");
        int num2 = scanner.nextInt();
        System.out.print("Dime un tercer numero: ");
        int num3 = scanner.nextInt();
        if (num1 > num2 && num1 > num3 || num1 == num2 && num1 > num3 || num1 == num3 && num1 > num2) {
            System.out.println(num1 + " Es el numero mas alto");
        }
        else if (num2 > num1 && num2 > num3 || num2 == num1 && num2 > num3 || num2 == num3 && num2 > num1) {
            System.out.println(num2 + " Es el numero mas alto");
        }
        else if (num3 > num1 && num3 > num2 || num3 == num1 && num3 > num2 || num3 == num2 && num3 > num1) {
            System.out.println(num3 + " Es el numero mas alto");
        }
        else {
            System.out.println("Todos los numeros son iguales");
        }
        return;
    }
    
    public static void ejercicio7() { // Calcula la media de 5 notas y determina si el alumno ha aprobado o suspendido
        Scanner scanner = new Scanner(System.in);
        double suma = 0;
        for (int i = 0; i <= 4; i++) {
            System.out.print("Dime una nota: ");
            int nota = scanner.nextInt();
            suma += nota;
        }
        System.out.println("La media de las notas es: " + (suma / 5));
        if (suma / 5 >= 6) {
            System.out.println("El alumno ha aprobado");
        }
        else {
            System.out.println("El alumno ha suspendido");
        }
        return;
    }

    public static void ejercicio8() { // Calcula si un numero es positivo, negativo o cero
        Scanner scanner = new Scanner(System.in);
        System.out.print("Dime un numero para calcular si es positivo o negativo: ");
        int num = scanner.nextInt();
        if (num > 0) {
            System.out.println("El numero es positivo");
        }
        else if (num < 0) {
            System.out.println("El numero es negativo");
        }
        else {
            System.out.println("El numero es cero");
        }
        return;
    }

    public static void ejercicio9() { // Calcula si un año es bisiesto o no
        Scanner scanner = new Scanner(System.in);
        System.out.print("Dime un año para calcular si es bisiesto: ");
        int year = scanner.nextInt();
        if (year % 400 == 0 || year % 100 != 0 && year % 4 == 0) {
            System.out.println(year + " El año es bisiesto");
        }
        else {
            System.out.println(year + " El año no es bisiesto");
        }
        return;
    }

    public static void ejercicio10() { // Dado un numero, imprime la serie de Fibonacci hasta ese numero
        Scanner scanner = new Scanner(System.in);
        System.out.print("Dime un numero: ");
        int num = scanner.nextInt();
        long numero1 = 0;
        long numero2 = 1;
        for (int i = 1; i <= num; i++) {
            long numeroSiguiente = numero1 + numero2;
            numero1 = numero2;
            numero2 = numeroSiguiente;
            System.out.println(numero2);
        }
        return;
    }

    public static boolean ejercicio11(int num) { // Calcula si un numero es par o impar
        boolean esPar = (num % 2 == 0)? true : false;
        return(esPar);
    }

    public static double ejercicio12(double radio, double PI) { // Calcula el area de un circulo dado su radio
        double area = PI * Math.pow(radio, 2);
        return area;
    }

    public static double ejercicio13(double celsius) { // Convierte grados Celsius a Fahrenheit
        double fahrenheit = (celsius * 9/5) + 32;
        return fahrenheit;
    }

    public static int ejercicio14(int num1, int num2, int num3) { // Encuentra el numero mas alto de tres numeros dados
        if (num1 > num2 && num1 > num3 || num1 == num2 && num1 > num3 || num1 == num3 && num1 > num2) {
            return num1;
        }
        else if (num2 > num1 && num2 > num3 || num2 == num1 && num2 > num3 || num2 == num3 && num2 > num1) {
            return num2;
        }
        else if (num3 > num1 && num3 > num2 || num3 == num1 && num3 > num2 || num3 == num2 && num3 > num1) {
            return num3;
        }
        else {
            return num1;
        }
    }

    public static long ejercicio15(int num) { // Calcula el factorial de un numero
   
        long factorial = 1;
        boolean isNegative = false;
        if (num < 0) {
            num *= -1;
            isNegative = true;
        }
        while (num != 0) {
            factorial *= num;
            num--;
        }
        if (isNegative) {
            return factorial * -1;
        } else {
            return factorial;
        }
    }

    public static int ejercicio16(String frase) { // Cuenta el numero de vocales en una frase
        int vocales = 0;
        for (int i = 0; i < frase.length(); i++) {
            char c = frase.charAt(i);
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' || c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U') {
                vocales++;
            }
        }
        return vocales;
    }

    public static boolean ejercicio17(String frase) { // Comprueba si una frase es un palíndromo
        String fraseInvertida = "";
        for (int i = 0; i < frase.length(); i++) {
            char c = frase.charAt(i);
            fraseInvertida = c + fraseInvertida;
        }
        if (frase.equals(fraseInvertida)) {
            return true;
        }
        else {
            return false;
        }
    }

    public static int ejercicio18(int num1, int num2) { // Calcula el mínimo común múltiplo (mcm) de dos números
        int mcm = 0;
        for (int i = 1; i <= num1 * num2; i++) {
            if (i % num1 == 0 && i % num2 == 0) {
                mcm = i;
                break;
            }
        }
        return mcm;
    }

    public static int ejercicio19(int[] sumaArray) { // Calcula la suma de los números en un arreglo
        int suma = 0;
        for (int i = 0; i < sumaArray.length; i++) {
            suma += sumaArray[i];
        }
        return suma;
    }

    public static double ejercicio20(int[] numerosArray) { // Calcula el promedio de los números en un arreglo
        int suma = 0;
        for (int i = 0; i < numerosArray.length; i++) {
            suma += numerosArray[i];
        }
        double promedio = (double) suma / numerosArray.length;
        return promedio;
    }

    public static void ejercicio21() { // Invierte un arreglo de números
        Scanner scanner = new Scanner(System.in);
        System.out.print("Dime longitud de un arreglo (cantidad de numeros a invertir): ");
        int num = scanner.nextInt();
        int[] numerosArray = new int[num];
        int numero = 0;
        for (int i = 0; i < num; i++) {
            System.out.print("Dime un numero: ");
            numero = scanner.nextInt();
            numerosArray[i] = numero;
        }
        int[] numerosInvertidos = new int[num];
        for (int i = numerosArray.length - 1; i >= 0; i--) {
            numerosInvertidos[numerosArray.length - 1 - i] = numerosArray[i];
        }
        System.out.println("El arreglo invertido es: ");
        for (int i = 0; i < num; i++) {
            System.out.println(numerosInvertidos[i] + " ");
        }
        return;
    }

    public static void ejercicio22() { // Busca un número en un arreglo
        Scanner scanner = new Scanner(System.in);
        System.out.print("Dime longitud de un arreglo (cantidad de numeros en el arreglo): ");
        int num = scanner.nextInt();
        int[] numerosArray = new int[num];
        int numero = 0;
        for (int i = 0; i < num; i++) {
            System.out.print("Dime un numero: ");
            numero = scanner.nextInt();
            numerosArray[i] = numero;
        }
        System.out.println("Dime el numero a buscar: ");
        int numeroABuscar = scanner.nextInt();
        boolean encontrado = false;
        for (int i = 0; i < num; i++) {
            if (numerosArray[i] == numeroABuscar) {
                encontrado = true;
                break;
            }
        }
        if (encontrado) {
            System.out.println("El numero " + numeroABuscar + " fue encontrado en el arreglo.");
        } else {
            System.out.println("El numero " + numeroABuscar + " no fue encontrado en el arreglo.");
        }
        return;
    }

    public static void ejercicio23() { // Ordena un arreglo de números
        Scanner scanner = new Scanner(System.in);
        System.out.print("Dime longitud de un arreglo (cantidad de numeros en el arreglo): ");
        int num = scanner.nextInt();
        int[] numerosArray = new int[num];
        int numero = 0;
        for (int i = 0; i < num; i++) {
            System.out.print("Dime un numero: ");
            numero = scanner.nextInt();
            numerosArray[i] = numero;
        }
        boolean ordenado = false;
        while (!ordenado) {
            ordenado = true;
            for (int i = 0; i < numerosArray.length - 1; i++) {
                if (numerosArray[i] > numerosArray[i + 1]) {
                    int temp = numerosArray[i];
                    numerosArray[i] = numerosArray[i + 1];
                    numerosArray[i + 1] = temp;
                    ordenado = false;
                }
            }
        }
        System.out.println("Arreglo ordenado:");
        for (int i = 0; i < numerosArray.length; i++) {
            System.out.print(numerosArray[i] + " ");
        }
        return;
    }

    public static void ejercicio24() { // Elimina los duplicados de un arreglo de números
        Scanner scanner = new Scanner(System.in);
        System.out.print("Dime longitud de un arreglo (cantidad de numeros en el arreglo): ");
        int num = scanner.nextInt();
        ArrayList<Integer> numerosArray = new ArrayList<>();
        int numero = 0;
        for (int i = 0; i < num; i++) {
            System.out.print("Dime un numero: ");
            numero = scanner.nextInt();
            numerosArray.add(numero);
        }
        boolean tieneDuplicados = false;
        while (!tieneDuplicados) {
            tieneDuplicados = true;
            for (int i = 0; i < numerosArray.size(); i++) {
                for (int j = i + 1; j < numerosArray.size(); j++) {
                    if (numerosArray.get(i) == numerosArray.get(j)) {
                        numerosArray.remove(j);
                        tieneDuplicados = false;
                    }
                }
            }
        }
        for (int i = 0; i < numerosArray.size(); i++) {
            for (int j = i + 1; j < numerosArray.size(); j++) {
                if (numerosArray.get(i) == numerosArray.get(j)) {
                    numerosArray.remove(j);
                }
            }
        }
        System.out.println("Arreglo sin duplicados:");
        for (int i = 0; i < numerosArray.size(); i++) {
            System.out.print(numerosArray.get(i) + " ");
        }
        return;
    }

    public static void ejercicio25() { // Intercala dos arreglos de números
        Scanner scanner = new Scanner(System.in);
        System.out.print("Dime longitud de un arreglo (cantidad de numeros en el arreglo): ");
        int num1 = scanner.nextInt();
        ArrayList<Integer> numerosArray1 = new ArrayList<>();
        int numero = 0;
        for (int i = 0; i < num1; i++) {
            System.out.print("Dime un numero: ");
            numero = scanner.nextInt();
            numerosArray1.add(numero);
        }
        System.out.print("Dime longitud de otro arreglo (cantidad de numeros en el arreglo): ");
        int num2 = scanner.nextInt();
        ArrayList<Integer> numerosArray2 = new ArrayList<>();
        numero = 0;
        for (int i = 0; i < num2; i++) {
            System.out.print("Dime un numero: ");
            numero = scanner.nextInt();
            numerosArray2.add(numero);
        }
        ArrayList<Integer> arrayIntercalado = new ArrayList<>();
        for (int i = 0; i < (num1 < num2 ? num1 : num2); i++) {
            arrayIntercalado.add(numerosArray1.get(i));
            arrayIntercalado.add(numerosArray2.get(i));
        }
        for (int i = (num1 < num2 ? num1 : num2); i < (num1 > num2 ? num1 : num2); i++) {
            if (num1 > num2) {
                arrayIntercalado.add(numerosArray1.get(i));
            } else {
                arrayIntercalado.add(numerosArray2.get(i));
            }
        }
        System.out.println("Arreglo intercalado:");
        for (int i = 0; i < arrayIntercalado.size(); i++) {
            System.out.print(arrayIntercalado.get(i) + " ");
        }
        return;
    }

    public static void ejercicio26() { // Calcula la transpuesta de una matriz
        Scanner scanner = new Scanner(System.in);
        System.out.print("Dime la altura de la matriz: ");
        int altura = scanner.nextInt();
        System.out.print("Dime la anchura de la matriz: ");
        int anchura = scanner.nextInt();
        int[][] matriz = new int[altura][anchura];
        int numero = 0;
        for (int i = 0; i < altura; i++) {
            for (int j = 0; j < anchura; j++) {
                System.out.print("Dime un numero (" + i + "," + j + "): ");
                numero = scanner.nextInt();
                matriz[i][j] = numero;
            }
        }
        int[][] matrizTranspuesta = new int[anchura][altura];
        for (int i = 0; i < altura; i++) {
            for (int j = 0; j < anchura; j++) {
                matrizTranspuesta[j][i] = matriz[i][j];
            }
        }
        System.out.println("Matriz original:");
        for (int i = 0; i < altura; i++) {
            for (int j = 0; j < anchura; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("Matriz transpuesta:");
        for (int i = 0; i < anchura; i++) {
            for (int j = 0; j < altura; j++) {
                System.out.print(matrizTranspuesta[i][j] + " ");
            }
            System.out.println();
        }
        return;
    }

    public static void ejercicio27() { // Suma dos matrices
        Scanner scanner = new Scanner(System.in);
        System.out.print("Dime la altura de la primera matriz: ");
        int altura1 = scanner.nextInt();
        System.out.print("Dime la anchura de la primera matriz: ");
        int anchura1 = scanner.nextInt();
        int[][] matriz1 = new int[altura1][anchura1];
        int numero = 0;
        for (int i = 0; i < altura1; i++) {
            for (int j = 0; j < anchura1; j++) {
                System.out.print("Dime un numero (" + i + "," + j + "): ");
                numero = scanner.nextInt();
                matriz1[i][j] = numero;
            }
        }
        System.out.print("Dime la altura de la segunda matriz: ");
        int altura2 = scanner.nextInt();
        System.out.print("Dime la anchura de la segunda matriz: ");
        int anchura2 = scanner.nextInt();
        int[][] matriz2 = new int[altura2][anchura2];
        numero = 0;
        for (int i = 0; i < altura2; i++) {
            for (int j = 0; j < anchura2; j++) {
                System.out.print("Dime un numero (" + i + "," + j + "): ");
                numero = scanner.nextInt();
                matriz2[i][j] = numero;
            }
        }
        int[][] matrizSumada = new int[(anchura1 > anchura2)? anchura1 : anchura2][(altura1 > altura2)? altura1 : altura2];
        for (int i = 0; i < altura1; i++) {
            for (int j = 0; j < anchura1; j++) {
                matrizSumada[j][i] = matriz1[i][j];
            }
        }
        for (int i = 0; i < altura2; i++) {
            for (int j = 0; j < anchura2; j++) {
                matrizSumada[j][i] += matriz2[i][j];
            }
        }
        System.out.println("Matriz 1:");
        for (int i = 0; i < altura1; i++) {
            for (int j = 0; j < anchura1; j++) {
                System.out.print(matriz1[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("Matriz 2:");
        for (int i = 0; i < altura2; i++) {
            for (int j = 0; j < anchura2; j++) {
                System.out.print(matriz2[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("Matriz sumada:");
        for (int i = 0; i < ((anchura1 > anchura2) ? anchura1 : anchura2); i++) {
            for (int j = 0; j < ((altura1 > altura2) ? altura1 : altura2); j++) {
                System.out.print(matrizSumada[i][j] + " ");
            }
            System.out.println();
        }
        return;
    }

    public static void ejercicio28() { // Multiplica dos matrices
        Scanner scanner = new Scanner(System.in);
        System.out.print("Dime la altura de la primera matriz: ");
        int altura1 = scanner.nextInt();
        System.out.print("Dime la anchura de la primera matriz: ");
        int anchura1 = scanner.nextInt();
        int[][] matriz1 = new int[altura1][anchura1];
        int numero = 0;
        for (int i = 0; i < altura1; i++) {
            for (int j = 0; j < anchura1; j++) {
                System.out.print("Dime un numero (" + i + "," + j + "): ");
                numero = scanner.nextInt();
                matriz1[i][j] = numero;
            }
        }
        System.out.print("Dime la altura de la segunda matriz: ");
        int altura2 = scanner.nextInt();
        System.out.print("Dime la anchura de la segunda matriz: ");
        int anchura2 = scanner.nextInt();
        int[][] matriz2 = new int[altura2][anchura2];
        numero = 0;
        for (int i = 0; i < altura2; i++) {
            for (int j = 0; j < anchura2; j++) {
                System.out.print("Dime un numero (" + i + "," + j + "): ");
                numero = scanner.nextInt();
                matriz2[i][j] = numero;
            }
        }
        int[][] matrizMultiplicada = new int[(anchura1 > anchura2)? anchura1 : anchura2][(altura1 > altura2)? altura1 : altura2];
        for (int i = 0; i < altura1; i++) {
            for (int j = 0; j < anchura1; j++) {
                matrizMultiplicada[j][i] = matriz1[i][j];
            }
        }
        for (int i = 0; i < altura2; i++) {
            for (int j = 0; j < anchura2; j++) {
                matrizMultiplicada[j][i] *= matriz2[i][j];
            }
        }
        System.out.println("Matriz 1:");
        for (int i = 0; i < altura1; i++) {
            for (int j = 0; j < anchura1; j++) {
                System.out.print(matriz1[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("Matriz 2:");
        for (int i = 0; i < altura2; i++) {
            for (int j = 0; j < anchura2; j++) {
                System.out.print(matriz2[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("Matriz multiplicada:");
        for (int i = 0; i < ((anchura1 > anchura2) ? anchura1 : anchura2); i++) {
            for (int j = 0; j < ((altura1 > altura2) ? altura1 : altura2); j++) {
                System.out.print(matrizMultiplicada[i][j] + " ");
            }
            System.out.println();
        }
        return;
    }

    public static void ejercicio29() { // Encuentra el numero mayor en una matriz
        Scanner scanner = new Scanner(System.in);
        System.out.print("Dime la altura de la matriz: ");
        int altura = scanner.nextInt();
        System.out.print("Dime la anchura de la matriz: ");
        int anchura = scanner.nextInt();
        int[][] matriz = new int[altura][anchura];
        int numero = 0;
        for (int i = 0; i < altura; i++) {
            for (int j = 0; j < anchura; j++) {
                System.out.print("Dime un numero (" + i + "," + j + "): ");
                numero = scanner.nextInt();
                matriz[i][j] = numero;
            }
        }
        int numeroMayor = matriz[0][0];
        System.out.println("Matriz:");
        for (int i = 0; i < altura; i++) {
            for (int j = 0; j < anchura; j++) {
                System.out.print(matriz[i][j] + " ");
                if (matriz[i][j] > numeroMayor) {
                    numeroMayor = matriz[i][j];
                }
            }
            System.out.println();
        }
        System.out.println("El numero mayor es: " + numeroMayor);
        return;
    }

    public static void ejercicio30() { // Encuentra los numeros mayores a un numero dado en una matriz
        Scanner scanner = new Scanner(System.in);
        System.out.print("Dime la altura de la matriz: ");
        int altura = scanner.nextInt();
        System.out.print("Dime la anchura de la matriz: ");
        int anchura = scanner.nextInt();
        int[][] matriz = new int[altura][anchura];
        int numero = 0;
        for (int i = 0; i < altura; i++) {
            for (int j = 0; j < anchura; j++) {
                System.out.print("Dime un numero (" + i + "," + j + "): ");
                numero = scanner.nextInt();
                matriz[i][j] = numero;
            }
        }
        System.out.print("Dime los numeros que quieres buscar que sean mayores a: ");
        int numeroBuscado = scanner.nextInt();
        List<Integer> numerosMayores = new ArrayList<>();
        System.out.println("Matriz:");
        for (int i = 0; i < altura; i++) {
            for (int j = 0; j < anchura; j++) {
                System.out.print(matriz[i][j] + " ");
                if (matriz[i][j] > numeroBuscado) {
                    numerosMayores.add(matriz[i][j]);
                }
            }
            System.out.println();
        }
        System.out.println("Los numeros mayores a " + numeroBuscado + " son: ");
        for (int i = 0; i < numerosMayores.size(); i++) {
            System.out.print(numerosMayores.get(i) + " ");
        }
        return;
    }
}