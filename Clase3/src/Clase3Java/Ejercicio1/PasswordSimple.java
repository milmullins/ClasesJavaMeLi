package Clase3Java.Ejercicio1;

public class PasswordSimple extends Password{

    public PasswordSimple() {
        super("^(?=.*[a-z])(?=.*[0-9])\\S{6,8}$");
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
