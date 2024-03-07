import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Cafe {


    //2.c Create another class called Cafe. Give it an attribute called 'coffeeMenu' of type ArrayList<String>.
    // (Later you will fill this ArrayList with the names of the coffees from the textfile).

    private ArrayList<String> coffeeMenu = new ArrayList<>();


//2.c In the Cafe class, add a method loadMenuData Have the method load the coffees.txt file like this: File file = new File("coffees.txt)
//(make sure that the path is right)

  public void  loadMenuData() {


      // Opretter en filreference til stien til din kaffemenu-fil

      File file = new File("C:/Users/madih/ideaProjects/cafe/scr/coffees.txt");



      //2.e Inside the try block from the last step, you will now add this piece of code that loops over the lines of the textfile:
      //Use a while loop with the hasNextLine() and nextLine() -methods called on the Scanner instance, to loop over the lines of the file and add the lines to the coffees ArrayList in this class.
      try {
          Scanner scan = new Scanner(file);


          while (scan.hasNextLine()) {

              // Tilføj den læste linje til coffeeMenu (antages at coffeeMenu er en liste)
              coffeeMenu.add(scan.nextLine());

          }
      }catch(FileNotFoundException e){

              System.out.println("File not found. Check path and filename");

          }
      }


    //you should use a for loop, and in the body of the loop use the get() method of ArrayList, to get hold of the item before printing it.
    public void printMenu() {
        for (String menu : coffeeMenu) {
            System.out.println(menu);
        }
    }



  }


