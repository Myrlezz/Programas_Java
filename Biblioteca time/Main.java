/*
Título: Biblioteca_time
Autor: Jonathan Sánchez de Jesús
Fecha: 10/11/2021
Versión: 1.0
Descripción: Uso de la biblioteca time
Funcionamiento: Ejecutar programa
Requisitos:
  - java.time
*/

// Biblioteca de fechas, horas, instantes y duraciones
import java.time.*;

class Main {
  public static void main(String[] args) {
    System.out.println("La fecha actual es: " + LocalDate.now() +
      "\nLa hora actual es: " + LocalTime.now() +
      "\nLa fecha y hora actuales son: " + LocalDateTime.now() +
      "\nEl instante actual es: " + Instant.now() +
      "\nLa fecha y hora actuales con zona horaria son: " + ZonedDateTime.now() +
      "\nDía actual: " + LocalDate.now().getDayOfWeek() +
      "\nMes actual: " + LocalDate.now().getMonth() +
      "\nAño actual: " + LocalDate.now().getYear() +
      "\nHora actual: " + LocalTime.now().getHour() +
      "\nMinuto actual: " + LocalTime.now().getMinute() +
      "\nSegundo actual: " + LocalTime.now().getSecond() +
      "\nNanosegundo actual: " + LocalTime.now().getNano());
  }
}
