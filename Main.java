//Users of the System
//
//        Admin
//        Libraian
//        Functional Requirements
//
//        1. Admin
//        Can add/edit/view/delete librarian
//        Can logout
//        2. Librarian
//        Can add/edit/delete/view books
//        Can issue books
//        View issued books

import java.sql.SQLOutput;
import java.util.*;
import static java.lang.System.exit;

public class Main {
    public static void main(String[] args) {
        System.out.println("************* Welcome *************");
        System.out.println("*** Chooce one of the options ***");
        System.out.println("\t1.Librarian\n\t2.Admin\n");
        Scanner temp = new Scanner(System.in);
        int option = temp.nextInt();
        if(option >= 4 && option <= 0){
            System.out.println("Choose a VALID Option");
            exit(0);
        }
        else{
            switch (option){
                case 1 :
                    System.out.print(" Welcome Librarian enter your name : ");
                    temp = new Scanner(System.in);
                    String name = temp.next();
                    System.out.println("\t1.AddBooks\n\t2.EditBooks\t3.IssueBooks\t\n4.ViewBooks");
                    System.out.print("Choose one of the above options : ");
                    temp = new Scanner(System.in);
                    int opt = temp.nextInt();
                    switch(opt){
                        case 1 :
                            System.out.print("Name of the book   : ");
                            temp = new Scanner(System.in);
                            String bookName = temp.next();
                            System.out.print("Writer of the book : " );
                            temp = new Scanner(System.in);
                            String writerName = temp.next();
                            System.out.print("Cost of teh book   : ");
                            temp = new Scanner(System.in);
                            int bookCost = temp.nextInt();

                        case 2 :
                            System.out.print("Name of the book   : ");
                            temp = new Scanner(System.in);
                            bookName = temp.next();
                            System.out.print("Writer of the book : " );
                            temp = new Scanner(System.in);
                            writerName = temp.next();
                            System.out.print("Name of the book   : ");
                            temp = new Scanner(System.in);
                            bookName = temp.next();

                        case 3 :
                            System.out.print("Enter the name of Student : ");
                            temp = new Scanner(System.in);
                            String studentNmae = temp.next();
                            System.out.print("Name of the book          : ");
                            temp = new Scanner(System.in);
                            bookName = temp.next();
                            System.out.print("Number of days Borrowed   : ");
                            temp = new Scanner(System.in);
                            int borrowDays = temp.nextInt();

                        case 4 :
                            System.out.println("*********** The List of the Books is below ***********");

                    }
                case 2 :
                    System.out.print(" Welcome Admin enter your name : ");
                    temp = new Scanner(System.in);
                    name = temp.next();
            }
        }
    }
}