package dao;

import model.Conexao;
import model.Contato;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ContatoDAO {

    public void cadastrar(Contato contato){
        String sql = "INSERT INTO contato (nome, telefone) VALUES (?,?)";

        try(Connection conn = Conexao.conectar();
            PreparedStatement stmt = conn.prepareStatement(sql)){

            stmt.setString(1, contato.getNome());
            stmt.setString(2, contato.getTelefone());
            stmt.executeUpdate();

            System.out.println("\nContato cadastrado com sucesso!");
        }
        catch (SQLException e){
            e.printStackTrace();
        }
    }

    public void deletar(Contato contato){
        String sql = "DELETE FROM contato WHERE id = ?";

        try(Connection conn = Conexao.conectar();
            PreparedStatement stmt = conn.prepareStatement(sql)){

            stmt.setInt(1, contato.getId());
            stmt.executeUpdate();

            System.out.println("\nContato deletado com sucesso!");
        }
        catch (SQLException e){
            e.printStackTrace();
        }
    }

    public void alterar(Contato contato){
        String sql = "UPDATE contato SET telefone = ? WHERE id = ?";

        try(Connection conn = Conexao.conectar();
            PreparedStatement stmt = conn.prepareStatement(sql)){

            stmt.setString(1, contato.getTelefone());
            stmt.setInt(2, contato.getId());

            stmt.executeUpdate();

            System.out.println("\nContato alterado com sucesso!");
        }
        catch (SQLException e){
            e.printStackTrace();
        }
    }

    public static List<Contato> listar(){
        String sql = "SELECT id, nome, telefone FROM contato";
        List<Contato> lista = new ArrayList<>();

        try(Connection conn = Conexao.conectar();
            PreparedStatement stmt = conn.prepareStatement(sql)){

            ResultSet rs = stmt.executeQuery();

            while (rs.next()){
                int id = rs.getInt("id");
                String nome = rs.getString("nome");
                String telefone = rs.getString("telefone");

                Contato contato = new Contato(id, nome, telefone);
                lista.add(contato);
            }
        }
        catch (SQLException e){
            e.printStackTrace();
        }
        return lista;
    }

    public static Contato buscarPorNome(String nome){
        String sql = "SELECT id, nome, telefone FROM contato WHERE nome = ? LIKE ?";
        int id = 0;
        String newNome = "";
        String telefone = "";

        try(Connection conn = Conexao.conectar();
            PreparedStatement stmt = conn.prepareStatement(sql)){

            stmt.setString(1, nome);

            ResultSet rs = stmt.executeQuery();

            if (rs.next()){
                newNome = rs.getString("nome");
                id = rs.getInt("id");
                telefone = rs.getString("telefone");
            }
        }
        catch (SQLException e){
            e.printStackTrace();
        }
        return new Contato(id, newNome, telefone);
    }
}
