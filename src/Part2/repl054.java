package Part2;

import java.util.Scanner;

public class repl054 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter status code:");
        int code = scan.nextInt();
       String num = "";
        switch (code){

            case 200:
                num = "OK";
                break;
            case 201:
                num = "Created";
                break;
            case 202:
                num = "Accepted";
                break;
            case 301:
                num = "Moved Permanently";
                break;
            case 303:
                num = "See Other";
                break;
            case 304:
                num = "Not Modified";
                break;
            case 307:
                num = "Temporary Redirect";
                break;
            case 400:
                num = "Bad Request";
                break;
            case 401:
                num = "Unauthorized";
                break;
            case 403:
                num = "Forbidden";
                break;
            case 404:
                num = "Not Found";
                break;
            case 410:
                num = "Gone";
                break;
            case 500:
                num = "Internal Server Error";
                break;
            case 503:
                num = "Service Unavailable";
                break;
            default:
                num = "Invalid status code!";
        }

        System.out.println(num);




    }
}
