package Singleton;

public class Main {
    public static void main(String[] args) {

        Log logger = Log.getInstance();
        Log logger1 = Log.getInstance();

        logger.log(" Hola mundo");
        logger1.log("me fui mundial");

        System.out.println(logger);
        System.out.println(logger1);

        logger.setValue("Mensaje");
        System.out.println(logger1.getValue());


    }

}
