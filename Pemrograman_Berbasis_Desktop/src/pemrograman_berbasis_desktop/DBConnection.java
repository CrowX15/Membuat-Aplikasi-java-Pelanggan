
package pemrograman_berbasis_desktop;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnection 
{
    private static Connection connection;
    
    public static Connection newInstant()
    {
        if (connection == null){
        try
        {
            DriverManager.registerDriver(new com.mysql.jdbc.Driver());
            String url = "jdbc:mysql://localhost:3306/pemrograman_desktop0057";
            String user = "root";
            String password = "";
            connection = DriverManager.getConnection(url, user, password);
        }
        catch (Throwable throwable){
                
                throwable.printStackTrace();
                }
    }
    return connection;
    }
}

