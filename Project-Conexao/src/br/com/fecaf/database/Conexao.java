package br.com.fecaf.database;

import java.sql.Connection;
import java.sql.DriverManager;

public class Conexao {

    private String servidor, banco, user, password;
    public Connection conexao;

    public Conexao () {
        servidor = "localhost";
        banco = "db_java";
        user = "root";
        password = "admin123";
    }


    public Boolean connectDrive() {

        try {

            this.conexao = DriverManager.getConnection("jdbc:mysql://" + servidor + "/" + banco, user, password );
            return true;

        } catch (Exception e) {
            System.out.println(e);
            return false;
        }
    }

    public Connection getConnection () {
        boolean validaConexao = connectDrive();

        if (validaConexao){
            return conexao;
        }

        return null;
    }


}
