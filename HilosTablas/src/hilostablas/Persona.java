package hilostablas;

public class Persona {

    String Nickname, Nombre, Edad;
    
    public Persona() {

    }

    public Persona(String nickname, String nombre, String edad) {
        this.Nickname = nickname;
        this.Nombre = nombre;
        this.Edad = edad;
    }

    public void setNick(String nickname) {
        this.Nickname = nickname;
    }

    public void setNombre(String nombre) {
        this.Nombre = nombre;
    }

    public void setEdad(String edad) {
        this.Edad = edad;
    }

    public String getNick() {
        return this.Nickname;
    }

    public String getNombre() {
        return this.Nombre;
    }

    public String getEdad() {
        return this.Edad;
    }
    
    String[] getRow() {
        String [] row = new String[3];
        row[0] = Nickname;
        row[1] = Nombre;
        row[2] = Edad;
        return row;
    }
    
}