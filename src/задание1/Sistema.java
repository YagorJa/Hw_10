package задание1;

import java.util.Objects;

public class Sistema {
 private String name;
 private int chislo;
 private String string;

    public Sistema(String name, int chislo, String string) {
        this.name = name;
        this.chislo = chislo;
        this.string = string;
    }
    public boolean equals(Object o) {
       // сказано же просто переопределить
        // не сказано как
        if (this == o) {
            return true;
        }
        Sistema sistema = (Sistema) o;
        return name.equals(sistema.name);
    }
    public int hashCode(){
        return Objects.hash(name,chislo,string);
    }

    public String toString() {
        return chislo + "," + string + " " + name;
    }
}
