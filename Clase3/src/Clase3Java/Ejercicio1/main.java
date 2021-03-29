package Clase3Java.Ejercicio1;

public class main {
    public static void main(String[] args) {
        Password pass= new Password("^(?=.*[a-z])(?=.*[A-Z])(?=.*[0-9])(?=.*[$@!])\\S{6,12}$");

        Password pass1= new Password("^(?=.*[a-z])(?=.*[A-Z])(?=.*[0-9])(?=.*[$@!])\\S{6,12}$");

        Password pass2=new PasswordFuerte();

        System.out.println(pass1);
        System.out.println(pass);
        System.out.println(pass2);
    }
}
