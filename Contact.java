public class Contact{
    /* Variables and Fields
     * contactName > name
     * contactGender > gender
     * contactAge > age
     * contactJob > job
     * contactLocation > location
     * contactHoroscope > horoscope
     * contactIncome > income
     */
    String contactName;
    char contactGender;
    int contactAge;
    String contactJob;
    String contactLocation;
    String contactHoroscope;
    double contactIncome;
    // Contact Class Constructor or method
    public Contact(
        String name,
        char gender,
        int age,
        String job,
        String location,
        String horoscope,
        double income
        ) {
        contactName = name;
        contactGender = gender;
        contactAge = age;
        contactJob = job;
        contactLocation = location;
        contactHoroscope = horoscope;
        contactIncome = income;
    }
}
