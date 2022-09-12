import java.util.Scanner;

public class OperadoresLogicosLogin {
    public static void main(String[] args) {

        String[] usernames = new String[3];
        String[] passwords = new String[3];

        usernames[0] = "Jose";
        usernames[1] = "Benito";
        usernames[2] = "Luis";

        passwords[0] = "123";
        passwords[1] = "123456";
        passwords[2] = "123456789";

        Scanner scanner = new Scanner(System.in);

        System.out.print("Capture su nombre de usuario: ");
        String u = scanner.next();

        System.out.print("Capture su contraseña: ");
        String p = scanner.next();

        boolean autentificacion = false;

        for(int i=0; i< usernames.length;i++){
            if(usernames[i].equals(u) && passwords[i].equals(p)) {
                autentificacion = true;
                break;
            }
        }
        if (autentificacion){
            System.out.println("Bienvenido al sistema ".concat(u).concat("!!!"));
        }else {
            System.out.println("Usuario o contraseña equivocado");
        }
    }
}
