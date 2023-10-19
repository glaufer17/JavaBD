package principal;

import java.sql.SQLException;
import persistencia.DatabaseConnection;
import java.sql.Statement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import modelo.Aluno;

/**
 *
 * @author GLAUFER
 */
public class Main {

    public static void main(String[] args) {
        
        List<Aluno> alunos = new ArrayList<>();
        
        try {
            DatabaseConnection.getConnection();
            Statement st = DatabaseConnection.getConnection().createStatement();
            st.executeUpdate("delete from aluno");
            st.executeUpdate("insert into aluno (idaluno, nome, cpf) values (1, 'geovane','049078')");
            st.executeUpdate("insert into aluno (idaluno, nome, cpf) values (2, 'mateus','083466')");
            st.executeUpdate("insert into aluno (idaluno, nome, cpf) values (3, 'kaique','116761')");
            
            ResultSet rs = st.executeQuery("select * from aluno");
            while(rs.next()) {
                int idAluno = rs.getInt("idaluno");
                String nome = rs.getString("nome");
                String cpf = rs.getString("cpf");
                
                Aluno al = new Aluno();
                al.setIdAluno(idAluno);
                al.setNome(nome);
                al.setCpf(cpf);
                
                alunos.add(al);
            } 
            
            st.close();
            //DatabaseConnection.getConnection().commit();
            DatabaseConnection.getConnection().close();
            
        } catch (SQLException ex) {
            System.out.println("Erro!\n" + ex.getMessage());
        } 
        
        for (Aluno aluno : alunos) {
            System.out.println(alunos);
        }
        
    }
    
}
