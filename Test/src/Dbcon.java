

import java.sql.*;
public class Dbcon {
    public static void main (String[] args) {
        try {  
            Class.forName("com.mysql.jdbc.Driver");     //加载MYSQL JDBC驱动程序     
            //Class.forName("org.gjt.mm.mysql.Driver");  
           System.out.println("Success loading Mysql Driver!");  
          }  
          catch (Exception e) {  
            System.out.print("Error loading Mysql Driver!");  
            e.printStackTrace();  
          }  
          try {  
            Connection connect = DriverManager.getConnection(  
                "jdbc:mysql://localhost/mysql?useSSL=false&user=root&password=root");  
                 //连接URL为   jdbc:mysql//服务器地址/数据库名  ，后面的2个参数分别是登陆用户名和密码  
        
            System.out.println("Success connect Mysql server!");  
          }  
          catch (Exception e) {  
            System.out.print("get data error!");  
            e.printStackTrace();  
          } 
    }
}