import org.joda.time.DateTime;

public class ExternalLibrary {
    public static void main(String[] args) {

        DateTime dt = new DateTime();
        System.out.println("The Day: " + dt.dayOfMonth().getAsShortText());
    }
}
