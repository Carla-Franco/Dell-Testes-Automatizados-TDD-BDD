package app;

import javax.swing.JButton;

public class TelaLogin {
	
	
	public static boolean informaUsuario(String user) {
		if(user == null) {
			return true;
		}
		
		user = user.trim();
		return user.length() == 0;
		
	}

	public static boolean preencheSenha(String senha) {
		if(senha == null) {
			return true;
		}
		
		senha = senha.trim();
		return senha.length() == 0;
	}

	public static boolean confirmarLogin(String botao) {
		if(botao == "OK") {
			return true;
	    }
		
		botao = botao.trim();
		return false;
	}
}

