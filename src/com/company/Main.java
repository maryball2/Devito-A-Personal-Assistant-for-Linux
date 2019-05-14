package com.company;
/*
Title: Devito: A desktop linux personal assistant for all your personal assistant needs!
Author: Riley Carpenter
License: You think I'm professional enough to get one of those?
TODO: Fix stripping of string in respond
 */


import java.util.Scanner;

public class Main {

    private static String askQuestion(Scanner reader){
        reader = new Scanner(System.in);
        String question = reader.nextLine();
        return question;
    }



    private static String respond(String question){
        String response = "";
        question = question.replaceAll("\\p{Punct}", "");
        //System.out.println(question);
        question = question.replaceAll("Devito","");
        //System.out.println(question.toUpperCase());




        if (question.toUpperCase().equals("HOW ARE YOU")){
            response = "I'm good!";
        }






        return response;
    }

    //Main method
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
	    System.out.print("Hello! What can I help you with today? ");
	    String ques = askQuestion(reader);
	    System.out.println(respond(ques));
	    System.out.println();
	    while (ques.toUpperCase().compareTo("GOODBYE") != 0 || ques.toUpperCase().compareTo("BYE") != 0 || ques.toUpperCase().compareTo("BYE DEVITO") != 0){
	        System.out.print("What else can I help you with? ");
	        ques = askQuestion(reader);
	        System.out.println(respond(ques));
	        System.out.println();
        }
	    reader.close();
	    System.out.println("Have a great day! ");
    }
}
