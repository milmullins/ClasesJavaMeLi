package Clase3Java;

import java.util.regex.*;

public class Password {

    public static void main(String[] args){
        Password pass = new Password("^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[!@#&()–[{}]:;',?/*~$^+=<>]).{8,20}$");
        pass.setValue("Milt78965()");

        System.out.println(pass.getPass());
    }

    private String regex = "";
    private String pass = "";
    private Pattern pattern;
    private Matcher matcher;

    public Password(String regex) {
        this.regex=regex;
    }

    public void setValue(String pwd){
        try{
            if(pwd.matches(regex))
                this.pass = pwd;
            else
                System.out.println("El password ingresado no coincide con regex");
        }catch (PatternSyntaxException pse){
            System.out.println("Password Error");
            pse.getDescription();
        }

        /*try{
            pattern = Pattern.compile(regex);
            matcher = pattern.matcher(pwd);
        }
        catch(PatternSyntaxException pse){
            System.out.println("There is a problem with the regular expression!%n");
            System.exit(0);
        }*/

    }

    public String getPass() {
        return pass;
    }

}
