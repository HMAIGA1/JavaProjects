public class Main{
  // Main class Method
  public static void main(String[] args) {
    // Main System Output
    System.out.println("Java Main System Online");
    // System Objects
    Contact Wife = new Contact("Ajah", 'F', 28, "BookKeeper", "East Brunswick", "Picses", 60);
    Contact Boss = new Contact("Mike Bloomberg",'M', 82, "CEO", "New York", "Aquarius", 106);
    // System Output
    System.out.println(Wife.contactName);
    System.out.println("Income is $"+Wife.contactIncome+" Thousand!");
    System.out.println("Boss income is "+Boss.contactIncome+" Billion!");
    System.out.println(Boss.contactName);
  }
}
