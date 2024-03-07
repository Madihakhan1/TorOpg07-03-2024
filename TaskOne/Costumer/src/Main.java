
import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {


        //1.e Skriv en Main klasse med en main metode, hvor der oprettes en ArrayList, som du kalder 'customers'.
        //(Du kan oprette instanserne først, og så add'e dem til array'et. Du kan også adde og instantiere i samme linie.)


        Customer customer1 = new Customer("Awes", "Raja", "Awes1");
        Customer customer2 = new Customer("Madiha", "Khan", "Madi1");
        Customer customer3 = new Customer("Dan", "Jensen", "Dan1");

        ArrayList<Customer> customers = new ArrayList<>();
        customers.add(customer1);
        customers.add(customer2);
        customers.add(customer3);

        printCustomers(customers);

    }


    //1.f Skriv en static metode i Main kaldet printCustomers(ArrayList customers),
    // hvor du printer alle kunderne ud ved at gennemløbe 'customers' med et ’for each’ loop.
    // Test metoden fra main ved at kalde den med din ArrayList som argument.

    public static void printCustomers(ArrayList<Customer> customers) {

        for (Customer c : customers) {
            System.out.println(c);
        }

    }

}