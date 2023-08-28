import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Data {
    public static void main(String[] args){

        // Cria um objeto DateTimeFormatter com o padrão "dd/MM/yyyy"
        DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        // Cria um objeto DateTimeFormatter com o padrão "dd/MM/yyyy HH:mm"
        DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");


        LocalDate d01 = LocalDate.now();  // Cria um objeto LocalDate que representa a data atual
        LocalDateTime d02 = LocalDateTime.now();  // Cria um objeto LocalDateTime que representa a data e hora atual
        Instant d03 = Instant.now();  // Cria um objeto Instant que representa um ponto específico no tempo (data e hora atual em UTC)

        LocalDate d04 = LocalDate.parse("2022-10-23"); // Cria um objeto LocalDate com a data específica "2022-10-23"
        LocalDateTime d05 = LocalDateTime.parse("2022-07-20T01:30:26");  // Cria um objeto LocalDateTime com a data e hora específicas "2022-07-20T01:30:26"
        Instant d06 = Instant.parse("2022-07-20T01:30:26Z"); // Cria um objeto Instant com a data e hora específicas em UTC "2022-07-20T01:30:26Z"

        Instant d07 = Instant.parse("2022-07-20T01:30:26-03:00"); // Cria um objeto Instant com a data e hora específicas e fuso horário "-03:00" "2022-07-20T01:30:26-03:00"
        LocalDate d08 = LocalDate.parse("20/07/2022", fmt1);  // Cria um objeto LocalDate com a data específica "20/07/2022", usando o formato definido pelo fmt1

        LocalDateTime d09 = LocalDateTime.parse("20/07/2022 01:30", fmt2); // Cria um objeto LocalDateTime com a data e hora específicas "20/07/2022 01:30", usando o formato definido pelo fmt2

        LocalDate d10 = LocalDate.of(2022, 7, 20); // Cria um objeto LocalDate com a data específica "2022-07-20" utilizando o método of()
        LocalDateTime d11 = LocalDateTime.of(d10, null); // Cria um objeto LocalDateTime com a data "2022-07-20" e horário null, resultando em uma exceção NullPointerException

        System.out.println("d01 = " + d01.toString());
        System.out.println("d02 = " + d02.toString());
        System.out.println("d03 = " + d03.toString());
        System.out.println("d04 = " + d04.toString());
        System.out.println("d05 = " + d05.toString());
        System.out.println("d06 = " + d06.toString());
        System.out.println("d07 = " + d07.toString());
        System.out.println("d08 = " + d08.toString());
        System.out.println("d09 = " + d09.toString());
        System.out.println("d010 = " + d10.toString());
        System.out.println("d011 = " + d11.toString());

    }
}