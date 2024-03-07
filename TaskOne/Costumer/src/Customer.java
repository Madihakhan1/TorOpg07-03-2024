public class Customer {



    //1.a Lav en klasse, Customer, med attributterne (felterne/instansvariablene):

    private String firstName;

    private String lastName;

    private String username;

    private int id;

    private static int counter;



    //1.b Klassen skal have en konstruktør, der tager kundens navn og brugernavn som parametre.

    Customer(String firstName, String lastName, String username) {



        this.firstName = firstName;

        this.lastName = lastName;

        this.username = username;



        //1.c Sørg for at counter tælles op med 1, hver gang konstruktoren bliver kaldt. Brug counter til at initialisere id

        counter++;

        id = counter;


    }


    //1.d Giv klassen en toString() metode, der printer kundens detaljer pænt ud. Gør alle klassens felter private, og tilføj getters().




    public String getFirstName() {

        return firstName;

    }



    public String getLastName(){



        return lastName;

    }



    public String getUserName(){

        return username;

    }



    public int getId(){



        return 0;

    }



    public int getCounter(){



        return 0;

    }



    @Override

    public String toString(){



        return "Firstname: "+firstName + " Lastname: "+lastName + " username: " + username;

    }



}