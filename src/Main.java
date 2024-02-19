//Crea un oggetto data da questa stringa 2023-03-01T13:00:00Z
        //aggiungi un anno
        //sottrai un mese
        //aggiungi 7 giorni
        //Stampa il risultato localizzata per l'Italia
import java.time.*;

public class Main {
    public static void main(String[] args) {
        String dataString = "2023-03-01T13:00:00Z";
        OffsetDateTime data = OffsetDateTime.parse(dataString);

        //aggiungi un anno
        OffsetDateTime dopoUnAnno = data.plusYears(1);

        //sottrai un mese
        OffsetDateTime dopoUnMese = dopoUnAnno.minusMonths(1);

        //aggiungi 7 giorni
        OffsetDateTime dopoSetteGiorni = dopoUnMese.plusDays(7);


        ZonedDateTime oraLocaleIt = dopoSetteGiorni.atZoneSameInstant(ZoneId.of("Europe/Rome"));
        //Stampa il risultato localizzata per l'Italia
        System.out.println("Data localizzata per l'Italia: " + oraLocaleIt);
    }
}