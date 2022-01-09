package com.example.MyOnboardingClass;

import java.util.Scanner;

public class UserRandomPicker {
    public static void main(String[] args) {
        Scanner myUserInput = new Scanner(System.in);
        System.out.print("Enter name");
        String name = myUserInput.nextLine();
        System.out.println("Tus participantes son " + name);


//        //Scanner class, create an object of the class and use any of the available methods found in the Scanner class documentation.
//        Scanner myUserInput = new Scanner(System.in);
//        System.out.print("Enter names");
//
//        // String input
//        String name = myUserInput.nextLine();
//
//        // Output input by user
//        System.out.println("Name: " + name);
    }

}
//    int number, total = 0;
//    Scanner sc = new Scanner(System.in);
//      do{
//              System.out.println("Please enter number: ");
//              number = sc.nextInt();
//              total += number;
//              }while (number != 0);
//              System.out.println("Total is = " + total);
//              sc.close();

//    public static void main(String[] args) {
//        Scanner myUserInput = new Scanner(System.in);
//        char choice;
//        do {
//            System.out.print("Introduce nombre del voluntario");
//            String [] name = myUserInput.nextLine();
//            System.out.println("Voluntario/a " + name);
//
//            System.out.println("Do You Want To Continue(Y/N)");
//            choice = myUserInput.next().charAt(0);
//            myUserInput.close();
//            System.out.println("Voluntario/as");
//            for( String counter=0, counter<name;counter++){
//                System.out.println(name[counter]);
//            }
//
//        } while(choice == 'Y'|| choice == 'y');
//    }
/*import java.util.Scanner;

class Scratch {
    public static void main(String[] args) {
        int number, total = 0;
        Scanner myUserInput = new Scanner(System.in);

        do{
            System.out.print("Introduce nombre");
            String name = myUserInput.nextLine();
            total += number;
        }while(number !=0);


        System.out.println("Nombre del voluntario/a " + total);
    }
}
//user input in loop
//print all user input
//stop user input pressing esc key the user enter esc key to stop loop java  https://www.programiz.com/java-programming/examples
/*Scanner myUserForm = new Scanner(System.in);
        String arr[] = new String[];
        System.out.println("Enter an name:");
        String myUserAnswer = myUserForm.nextLine();
        System.out.println("Nombre del voluntario/a "+ myUserAnswer);

        for (int i = 0; i < arr.length ; i++) {
            arr[i]=myUserForm.next();


        }
        System.out.println("los volunarios son"+"\n");
        for (int i = 0; i < arr.length ; i++) {
            System.out.print(arr[i]+" ");
        }
        class Scratch{
    public static void main(String[] args) {
        Scanner myUserForm = new Scanner(System.in);
        System.out.println("Enter a name:");
        String myUserAnswer = myUserForm.nextLine();
        System.out.println("Nombre introducido: "+myUserAnswer);
    }
}
import java.util.Scanner;
/*class scratch_1, every application begins with a class definition,and the name of the class should match the filename in Java.
Java Class is a blueprint for the object "BOCETO/PLANO",

 */
/*public class scratch_1 {
    compiler"TRANSLATE instructions into machine language" starts executing the code from the main method
    main function is the entry point of your Java application, and it's mandatory in a Java program,
    public=access modifier
    , static
    , void
    behavior or method=are used to perform some operations

    public static void main(String[] args) {
        //create an object of Scanner/Scanner object,  class of the java.util package is used to read input data from different sources
        Scanner=java class, myUserInput=object/instance of a class; new=keyword Scanner()= constructor
        constructor+methods have the same name as a class
        Class ObjectOfClass = Constructor

        Scanner myUserForm = new Scanner(System.in);
        //print statement,system= class,out=public static field:accepts output data,println()=method to display the string
        System.out.println("Enter an name: ");
        //take input from the user, "string=data type of the variable, name=variable", name is an object of the String class
        // state or field=used to store data
        String myUserAnswer = myUserForm.nextLine();
        //print statement, system= class,out=public static field:accepts output data,println()=method to display the string
        System.out.println("Nombre del voluntario/a "+ myUserAnswer);
    }
//    public static void main(String[] args) {
//        System.out.println("Enter a year to check if it is a leap year");
//        while(true){
//            Scanner input = new Scanner(System.in);
//            int year = input.nextInt();
//            if(year == 0)
//                break;
//            if((year % 100 == 0 && year % 400 == 0) || (year % 4 == 0 && year % 100 != 0))
//                System.out.println(year + " is a leap year");
//            else
//                System.out.println(year + " is not a leap year");
//        }
//    }

}

import java.util.Scanner;

class Scratch {
    public static void main(String[] args) {
        String[] myUserArrayInput = new String[];

        System.out.println("Enter an name:");
        Scanner myUserForm = new Scanner(System.in);
        for (int i = 0; i < myUserArrayInput.length ; i++){

            myUserArrayInput[i] = myUserForm.nextLine();
            System.out.println("Nombre del voluntario/a "+ myUserArrayInput.length());
        }
    }
}



//        while (true) {
//            System.out.println("Enter an name: ");
//            Scanner myUserForm = new Scanner(System.in);
//            String myUserAnswer = myUserForm.nextLine();
//            System.out.println("Nombre del voluntario/a "+ myUserAnswer);
//
//        }

//        Scanner myUserForm = new Scanner(System.in);
//        String arr[] = new String[];
//        System.out.println("Enter an name:");
//        String myUserAnswer = myUserForm.nextLine();
//        System.out.println("Nombre del voluntario/a "+ myUserAnswer);
//
//        for (int i = 0; i < arr.length ; i++) {
//            arr[i]=myUserForm.next();
        }
        System.out.println("los volunarios son"+"\n");
       for (int i = 0; i < arr.length ; i++) {
            System.out.print(arr[i]+" ");
        }

*/