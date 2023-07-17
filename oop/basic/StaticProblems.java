package oop.basic;

class Logger {

    public void log ()
    {
        System.out.println("Non-static method in a non-static class");
    }
    public static void logStatic (String msg)
    {
        System.out.printf("Static method in a non-static class %s\n", msg);
        System.out.println();
    }

    static class InnerStaticClass{
        public void log ()
        {
            System.out.println("Non-static method in a static class");
        }
        public static void logStatic ()
        {
            System.out.println("Static method in a static class");
        }
    }
}

public class StaticProblems {
    public static void main (String args[])
    {
        Logger loggerObj = new Logger();
        Logger.logStatic(": accessed without any instance reference");
        loggerObj.logStatic(": accessed via instance reference");
        loggerObj.log();
        //Logger.log();   //Non-static method 'log()' cannot be referenced from a static context

        Logger.InnerStaticClass.logStatic();
    }
}
