import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.text.ParseException;
import java.util.Scanner;

import models.Contact;
import models.ContactManager;

public class Main {
    
    static ContactManager manager = new ContactManager();

    public static void main(String[] args) {
        try{
        loadContacts("contacts.txt");
        System.out.println("CONTACTS LOADED \n\n");
        System.out.println(manager);
        manageContacts();
        } catch (FileNotFoundException e){
            System.out.println(e.getMessage());
        }
    }


        //     manager.addContact(new Contact("Ryan", "6135012424", "11/11/1992"));
        //     manager.addContact(new Contact("Gio", "6477092344", "11/11/1993"));
        //     manager.addContact(new Contact("Thomas", "8192256979", "11/11/1994"));
            
        //     manager.removeContact("Gio");
        //     System.out.println(manager);
        // } catch (ParseException e){
        //     System.out.println(e.getMessage());
        // } finally{
        //     System.out.println("Process Complete");
        // }

            //     Contact contact = new Contact("Alan Turing", "87984566", "07/23/1912");
        //     Contact contact2 = new Contact(contact);
        //     System.out.println(contact);

        //     contact2.setBirthDate("09/02/1950");
        // System.out.println(contact2);

    /**
     * Name: manageContacts
     *
     * Inside the function:
     *   • 1. Starts a new instance of Scanner;
     *   • 2. In an infinite loop, the user can choose to a) add b) remove a contact c) exit.
     *   •        case a: ask for the name, phone number and birthDate.
     *   •        case b: ask who they'd like to remove.
     *   •        case c: break the loop.
     *   • 3. close Scanner.
     */



    /**
     * Name: loadContacts
     * @param fileName (String)
     * @throws FileNotFoundException
     *
     * Inside the function:
     *   • 1. loads contacts from <fileName>;
     *   • 2. From the manager object, it adds all contacts to the contacts list.
     *        Hint: use scan.next to grab the next String separated by white space.
     */

     public static void loadContacts(String fileName) throws FileNotFoundException{
        FileInputStream fis = new FileInputStream(fileName);
        Scanner scanFile = new Scanner(fis);
        while(scanFile.hasNextLine()){
            try{
            Contact contact = new Contact(scanFile.next(), scanFile.next(), scanFile.next());
            manager.addContact(contact);
            }  catch (ParseException e){
                System.out.println(e.getMessage());
            }
        }
        scanFile.close();
     }

     public static void manageContacts(){
        Scanner scan = new Scanner(System.in);
        while(true){
            System.out.println("Would you like to \n\ta) add another contact\n\tb) remove a contact \n\tc) exit");
            String response = scan.nextLine();
            if(response.equals("a")){
            System.out.print("\tName: ");
            String name = scan.nextLine();
            System.out.print("\tPhone Number: ");
            String phoneNumber = scan.nextLine();
            System.out.print("\tBirth Date: ");
            String birthDate = scan.nextLine();
            if(name.isBlank()|| phoneNumber.isBlank() || phoneNumber.length()<5 ){
                System.out.println("The input you provided is not valid - registration faild");
            }
            else{
                try{
                    manager.addContact(new Contact(name,phoneNumber,birthDate));
                    } catch(ParseException e){
                        System.out.println(e.getMessage());
                    } finally{
                        System.out.println("\n\nUPDATED CONTACTS\n\n" + manager);
                    }
            }
            }
            else if(response.equals("b")){
                System.out.println("\nWho would you like to remove?");
                manager.removeContact(scan.nextLine());
                System.out.println("\n\nUPDATED CONTACTS\n\n" + manager);
            } else{
                break;
            }
        }
        scan.close();
     }

     }
    


