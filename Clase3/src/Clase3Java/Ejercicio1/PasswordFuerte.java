package Clase3Java.Ejercicio1;

public class PasswordFuerte extends Password{

    public PasswordFuerte() {
        super("^(?=.*[a-z])(?=.*[A-Z])(?=.*[0-9])(?=.*[$@!])\\S{6,12}$");
    }

    @Override
    public void setValue(String pwd) {
        try{
            super.setValue(pwd);
        }catch (Exception ex){
            ex.getMessage();
        }
    }
}
