package javabdd01;
import java.util.Scanner;
import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;

public class JavaBdd01 {
    public static void main(String[] args) {
        String usuario="root";
        String clave="";
        Scanner in=new Scanner(System.in);
            try{
                Class.forName("org.gjt.mm.mysql.Driver");
                String url="jdbc:mysql://localhost:3306/inacap01";
                Connection con=DriverManager.getConnection(url,usuario,clave);
                //System.out.println("Conexion Establecida!!");
                Statement stmt=con.createStatement();
                System.out.println("Ingrese id a eliminar:");
                int id=Integer.parseInt(in.nextLine());
                stmt.executeUpdate("delete from usuarios where usuario_id='"+id+"'");
                System.out.println("Usuario Eliminado!!");
            }catch(Exception ex){
                System.out.println("Error"+ex.getMessage());
            }
    }
}
