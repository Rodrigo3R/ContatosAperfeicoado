package model.entities;

import javax.swing.JOptionPane;

public class Listas {

	public static StringBuffer menu = new StringBuffer();

	public static String jopMenu() {
		
		menu = new StringBuffer();
		menu.append("1 - Adicionar o contato\n");
		menu.append("2 - Remover contato\n");
		menu.append("3 - Listar o contato\n");
		menu.append("4 - Listar o contato pela inicial\n");
		menu.append("5 - Pesquisar\n");
		menu.append("6 - Atualizar\n");
		menu.append("7 - Limpar lista\n");
		menu.append("0 - Sair\n");

		return menu.toString();
	}

	public static String jopStr(String msg) {

		return JOptionPane.showInputDialog(msg);
	}

	public static Integer jopInt(String msg) {

		return Integer.parseInt(JOptionPane.showInputDialog(msg));
	}

	public static void jop(String msg) {

		JOptionPane.showMessageDialog(null, msg);
	}

	
}
