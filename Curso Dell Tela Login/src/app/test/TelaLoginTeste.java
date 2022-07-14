package app.test;

import java.awt.event.ActionEvent;

import javax.swing.JOptionPane;

import org.junit.Assert;
import org.junit.Test;

import app.TelaLogin;

public class TelaLoginTeste {
	
	@Test
	public void TelaLoginTeste() {
		boolean login = TelaLogin.informaUsuario("roncarcla");
		Assert.assertFalse(login);
		
		login = TelaLogin.informaUsuario(null);
		Assert.assertTrue(login);
		
		login = TelaLogin.informaUsuario("");
		Assert.assertTrue(login);
		System.out.println("Usuario Ok");
	}
	
	@Test
	public void preencheSenhaTeste() {
		boolean password = TelaLogin.preencheSenha("123456");
		Assert.assertFalse(password);
		
		password = TelaLogin.preencheSenha(null);
		Assert.assertTrue(password);
		
		password = TelaLogin.preencheSenha("");
		Assert.assertTrue(password);
		System.out.println("Senha Ok");
	}
	
	@Test
	public void confirmarLoginTeste() {
		boolean confirmar = TelaLogin.confirmarLogin("OK");
		Assert.assertTrue(confirmar);
		System.out.println("Login realizado com sucesso!");
	}
	
}
