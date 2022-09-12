import java.util.Scanner;

public class OperadoresLogicosLogin {
    public static void main(String[] args) {

        String username = "Jose";
        String password = "123456";

        String username2 = "Benito";
        String password2 = "123456";

        Scanner scanner = new Scanner(System.in);

        System.out.print("Capture su nombre de usuario: ");
        String u = scanner.next();

        System.out.print("Capture su contraseña: ");
        String p = scanner.next();

        boolean autentificacion = false;

        if(username.equals(u) && password.equals(p) || username2.equals(u) && password2.equals(p)){
            autentificacion=true;
        }else{
            System.out.println("Username o Password equivocado");
        }
        if (autentificacion){
            System.out.println("Bienvenido al sistema ".concat(u).concat("!!!"));
        }
    }
}
