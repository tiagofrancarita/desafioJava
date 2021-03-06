package br.com.desafioJava.teste;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
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
		rodrigo.setSexo('M');
		rodrigo.setEstadocivil("Casado");
		rodrigo.setAtivo('A');
		
		System.out.println(rodrigo.toString());
		
		//DriverManager.getConnection("jdbc:mysql://localhost/db_clientes,"root","Bia@tico68");"
		
		// conexão com o banco de dados MySql
		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost/db_clientes?useTimezone=true&serverTimezone=UTC", "root", "Biatico68");
		
		connection.close();
	
	}

}
