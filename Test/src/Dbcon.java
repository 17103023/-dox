

import java.sql.*;
public class Dbcon {
    public static void main (String[] args) {
        try {  
            Class.forName("com.mysql.jdbc.Driver");     //����MYSQL JDBC��������     
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
                 //����URLΪ   jdbc:mysql//��������ַ/���ݿ���  �������2�������ֱ��ǵ�½�û���������  
        
            System.out.println("Success connect Mysql server!");  
          }  
          catch (Exception e) {  
            System.out.print("get data error!");  
            e.printStackTrace();  
          } 
    }
}