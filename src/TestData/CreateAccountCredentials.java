package TestData;

import java.util.concurrent.ThreadLocalRandom;

public class CreateAccountCredentials {
    int min = 0;
    int max = 999999;
    int randomNum = ThreadLocalRandom.current().nextInt(min, max + 1);

    public String emailAddress = "automationTest@test" + randomNum + ".com";
    public String password = "automationTest12345";
    public String firstName = "Jan";
    public String lastName = "Kowalski";
    public String companyName = "KowalskiSoft";
    public String address = "Dworcowa 9999";
    public String city = "Gliwice";
    public String zipCode = "44100";
    public String additionalInformation = "Additional information test";
    public String homePhone = "123456789";
    public String mobilePhone = "987654321";
    public String addressAlias = "SGL";

}
