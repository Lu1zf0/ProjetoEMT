//package dao;
//import java.sql.*;
//
//public class FazerConexao {
//    
//    public static Connection conector(){
//        java.sql.Connection conexao = null;
//        String driver = "com.mysql.cj.jdbc.Driver"; 
//        String url = "jdbc:mysql://localhost:3306/?user=root";
//        String user = "root";
//        String password = "1234";
//        
//        try {
//            Class.forName(driver);
//            conexao = DriverManager.getConnection(url, user, password);
//            return conexao;
//        } catch (Exception e) {
//            System.out.println(e);
//            return null;
//        }
//    }
//}
