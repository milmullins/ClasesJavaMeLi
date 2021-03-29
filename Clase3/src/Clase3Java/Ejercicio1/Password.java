package Clase3Java.Ejercicio1;

import java.util.regex.*;

public class Password {

    private String regex;
    private String password;

    public Password() {
    }

    public Password(String regular){
        this.regex=regular;
        Pattern.compile(this.regex);
    }

    public void setValue(String pwd){
        Pattern pattern = Pattern.compile(this.regex);
        Matcher matcher = pattern.matcher(pwd);
        boolean matchFound = matcher.find();
        if(matchFound){
            this.password=pwd;
        }else{
            throw new IllegalArgumentException();
        }
    }

    public String getPass() {
        return password;
    }

}
