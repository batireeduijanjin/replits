package Part2;

import java.util.Scanner;

public class repl078 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String message = scan.nextLine();
        String sender;
        String phoneNumber;
        String messageBody;
/*
        sender = message.substring(message.indexOf("<")+1, message.indexOf(">"));
        phoneNumber = message.substring(message.indexOf("[")+1, message.indexOf("]"));
        messageBody = message.substring(message.indexOf("{")+1, message.indexOf("}"));


 */
        sender = message.substring(message.indexOf("<")+1,message.indexOf(">"));
        phoneNumber = message.substring(message.indexOf("["+1),message.indexOf("]"));
        messageBody = message.substring(message.indexOf("{")+1,message.indexOf("}"));

        System.out.println("Sender: "+sender);
        System.out.println("Phone number: "+phoneNumber);
        System.out.println("Message body: "+messageBody);
    }
}
