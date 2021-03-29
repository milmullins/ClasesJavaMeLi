package Clase3Java.Ejercicio1;

public class PasswordIntermedia extends Password{

    public PasswordIntermedia() {
        super("^(?=.*[a-z])(?=.*[A-Z])(?=.*[0-9])\\S{6,8}$");
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
