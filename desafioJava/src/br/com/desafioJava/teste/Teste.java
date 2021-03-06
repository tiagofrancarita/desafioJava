package br.com.desafioJava.teste;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDate;

import br.com.desafioJava.domain.Cliente;

public class Teste {

	public static void main(String[] args) throws SQLException   {
		
		Cliente rodrigo = new Cliente();
		
		//Long l = new Long(1);
		
		rodrigo.setId(1l);
		rodrigo.setCpf("13385796874");
		rodrigo.setNome("Rodrigo");
		rodrigo.setEmail("rfranca@gmail.com");
		rodrigo.setDtnasc(LocalDate.now()); // como configurar uma data no localdate;
		rodrigo.setSexo("M");
		rodrigo.setEstadocivil("Casado");
		rodrigo.setAtivo("A");
		
		System.out.println(rodrigo.toString());
		
		//DriverManager.getConnection("jdbc:mysql://localhost/db_clientes,"root","Bia@tico68");"
		
		// conexão com o banco de dados MySql
		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost/db_clientes?useTimezone=true&serverTimezone=UTC", "root", "Biatico68");
		
		Statement stm = connection.createStatement();
		
		/*Retorna os 
		boolean result = stm.execute("select * from tb_cliente");
		
		ResultSet resultSet = stm.getResultSet();
		
		System.out.println(result);
		
		boolean next = resultSet.next();
		
		System.out.println(next);
		
		rodrigo.setId(resultSet.getLong(1));
		rodrigo.setCpf(resultSet.getString(2));
		rodrigo.setNome(resultSet.getString(3));
		rodrigo.setEmail(resultSet.getString(4)); 
		rodrigo.setDtnasc(resultSet.getDate(5).toLocalDate());
		rodrigo.setSexo(resultSet.getString(6));
		rodrigo.setEstadocivil (resultSet.getString(7));
		rodrigo.setAtivo (resultSet.getString(8));
		
		System.out.println(rodrigo.toString());
		*/
		
		//Faz insert no banco e retorna o id cadastrado.
		stm.execute("INSERT INTO `db_clientes`.`tb_cliente`"
		+ "(cpf,nome,email,dtnasc,sexo,estadocivil,ativo)"
		+ "VALUES('114414','Tiago','tfranca@teste.com','1995-11-01','M','Solteiro','S')",Statement.RETURN_GENERATED_KEYS);
		
		ResultSet resultSet = stm.getResultSet();
		resultSet = stm.getGeneratedKeys();
		Long id = resultSet.getLong(1);
		System.out.println(id);
		
		connection.close();
	}
}
