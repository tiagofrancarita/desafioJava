package br.com.desafioJava.domain;

import java.time.LocalDate;

public class Cliente {

	private Long id;
	private String cpf;
	private String nome;
	private String email;
	private LocalDate dtnasc;
	private char sexo;
	private String estadocivil;
	private char ativo;
	
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public LocalDate getDtnasc() {
		return dtnasc;
	}
	public void setDtnasc(LocalDate dtnasc) {
		this.dtnasc = dtnasc;
	}
	public char getSexo() {
		return sexo;
	}
	public void setSexo(char sexo) {
		this.sexo = sexo;
	}
	public String getEstadocivil() {
		return estadocivil;
	}
	public void setEstadocivil(String estadocivil) {
		this.estadocivil = estadocivil;
	}
	public char getAtivo() {
		return ativo;
	}
	public void setAtivo(char ativo) {
		this.ativo = ativo;
	}
	@Override
	public String toString() {
		return "Cliente [id=" + id + ", cpf=" + cpf + ", nome=" + nome + ", email=" + email + ", dtnasc=" + dtnasc
				+ ", sexo=" + sexo + ", estadocivil=" + estadocivil + ", ativo=" + ativo + "]";
	}
	
	
	
}
