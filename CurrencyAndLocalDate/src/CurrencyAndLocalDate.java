import java.text.NumberFormat;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Locale;

public class CurrencyAndLocalDate {

  //Fra lønberegner opgavetekst:
  //NumberFormat fmt = NumberFormat.getCurrencyInstance();
  //System.out.println("Bruttoløn " + fmt.format(løn));

  //Fra lavet opgave med lønberegner:
  public void go(){
    numberFormatChanger(150);
  }
  public String numberFormatChanger (double pay) {
    Locale dk = new Locale("da", "DK");
    return NumberFormat.getCurrencyInstance(dk).format(pay);
  }

  public void doubleUpIfMonday(){
    int point=1;
    LocalDate today = LocalDate.now(); //laver localDate objekt "today". LocalDate henter dagen lige nu
    //den finder dato, ikke om det er mandag
    today.getDayOfWeek(); //ved at skrive today kom der en masse eksempler frem med hvilke funktioner

    if (today.getDayOfWeek().equals(DayOfWeek.MONDAY)){
      point = point*2;
    }
    System.out.println(today.getDayOfWeek());
  }

  //LocalDateTime yearOfBirth;
  int yearOfBirth;
  int age = LocalDateTime.now().getYear() - yearOfBirth; //denne metode bør være i en konstruktør
  //getYear returnere år som int og ikke som LocalDateTime
  //^ beregner alder fordi fødselsår minus år lige nu


  public static void main(String[] args) {
    new CurrencyAndLocalDate().go();
  }

}
