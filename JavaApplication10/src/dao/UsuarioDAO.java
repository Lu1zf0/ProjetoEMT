package dao;
import java.sql.*;
import model.Usuario;

public class UsuarioDAO {
    
    private final Connection connection;
    
    public UsuarioDAO(Connection connection){
        this.connection = connection;
    }
    
    public void insert(Usuario usuario ) throws SQLException{
        
        String sql = "insert into usuario(nome,email,senha,cre) values(' "+usuario.getNomedeUsuario()+" ',' "+usuario.getEmaildeUsuario()+" ',' "+usuario.getSenhadeUsuario()+" ',' "+usuario.getCREUsuario()+" ');";
        
        PreparedStatement statement = connection.prepareStatement(sql);
        statement.execute();
        connection.close();
    }
}
