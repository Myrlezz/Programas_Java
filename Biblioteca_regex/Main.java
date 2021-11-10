/*
Título: Biblioteca_regex
Autor: Jonathan Sánchez de Jesús
Fecha: 10/11/2021
Versión: 1.0
Descripción: Este programa verifica que un correo este correctamente escrito
Funcionamiento: Escribir en la cadena el correo a comprobar y ejecutar el programa
Requisitos:
  - java.util.regex
*/

// Biblioteca de Expresiones Regulares
import java.util.regex.*;
class Main {
  public static void main(String[] args) {
    String cadena = "jon@correo.com";
    String patron = "^[^@]+@[^@]+\\.[a-zA-Z]{2,}$";
    Pattern pat = Pattern.compile(patron);
    Matcher mat = pat.matcher(cadena);
    if (mat.matches()){
      System.out.println("Si");
    }
    else System.out.println("No");
  }
}
