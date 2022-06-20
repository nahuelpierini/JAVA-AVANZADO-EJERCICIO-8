package Singleton;

public class Log {
    private static Log log;
    private String value;


    private Log(){

    }

    public static Log getInstance(){
        if(log == null)
            log = new Log();

        return log;
    }

    public void log(String mensaje){
        System.out.println(mensaje);
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }




}
