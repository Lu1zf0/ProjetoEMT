//package dao;
//import java.sql.*;
//
//public class FazerConexao {
//    
//    public static Connection conector(){
//        java.sql.Connection conexao = null;
//        String driver = "com.mysql.cj.jdbc.Driver";
//        String url = "us-cdbr-east-06.cleardb.net";
//        String user = "b695d0510e00e8";
//        String password = "8b4485be";
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
