public class Main {


    //2.b Create a class called Main with a main method.

    public static void main(String[] args) {


        //2.g In the main method create a new instance of the Cafe class and call its loadMenuData() -method.

        //Instansere cafe klassen ved at skrive Cafe cafe = new Cafe();
        Cafe cafe = new Cafe();

        //Kalder metoden LoadMenuData();
        cafe.loadMenuData();

        //2.h Still in the main method, print all the elements of the attribute coffeeMenu of the Cafe instance you just created.


        cafe.printMenu();



    }
}