/*
Titulo: Moneda defectuosa
Autor: Jonathan Sanchez de Jesus
Fecha: 14/sep/21
Versión 1.0

Descripción:
Este programa calcula el numero de pasos para encontrar una moneda defectuosa
*/

class Main {
  public static void main(String[] args) {

    int monedas = 200;
    int m_defectuosas = 20;
    float resultado;

    // Probabilidad de encontrar una moneda defectuosa
    resultado = (float)m_defectuosas/monedas;
    System.out.println("Encontrar una modena defectuosa");
    System.out.printf("Probabilidad: %.2f%%\n", resultado*100);
    System.out.println("Pasos: " + resultado*monedas);
  }
}
