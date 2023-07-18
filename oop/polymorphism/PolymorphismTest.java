package oop.polymorphism;

import java.util.Date;

class Logger {
    public void log (){
        System.out.println("Generic logs generated.");
    }
    public void log (String source){
        System.out.println("Method overloading (string) :: " +source);
    }
    public void log (int line){
        System.out.println("Method overloading (int) :: " +line);
    }
    public void log (int line, String log){
        System.out.println("Method overloading (no. of parameters) :: Line# " +line+ " \nLog: " +log);
    }
}
public class PolymorphismTest {
    public static void main (String args[]){
        Logger logger = new Logger();
        logger.log();
        logger.log("Cusotmized");
        logger.log(22);
        logger.log(23, new Date().toString());
    }
}
