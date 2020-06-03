package application;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import javax.swing.JOptionPane;

import model.entities.Aluno;
import model.entities.Listas;

public class Program {

	public static List<Aluno> contacts = new ArrayList<Aluno>();
	public static StringBuffer sb = new StringBuffer();

	public static void main(String[] args) {

		
		/*
		 * Pro
		 */
		
		StringBuffer list = new StringBuffer();

		Integer matricula = -1;
		String celPhone = "";
		String name = "";
		int result = -1;
		int control = -1;
		String letra = "";

		while (control != 0) {

			control = Listas.jopInt(Listas.jopMenu());

			if (control < 9) {

				switch (control) {

				case 1: 

					try {

						matricula = Listas.jopInt("Matrícula:");

						while (hasId(contacts, matricula)) {

							Listas.jop("Essa matrícula já existe, tente denovo");
							matricula = Listas.jopInt("Matrícula:");
						}
						name = Listas.jopStr("Nome:");
						celPhone = Listas.jopStr("celular");

						contacts.add(new Aluno(matricula, name, celPhone));

					} catch (IllegalArgumentException e) {
						Listas.jop("Opção inválida, entre com número inteiro");
					}
					break;
				case 2: // 2 - Remover contato

					if (!contacts.isEmpty()) {

						result = Listas.jopInt("Entre com o numero da matricula que deseja remover");

						for (int i = 0; i < contacts.size(); i++) {

							if (contacts.get(i).getMatricula() == result) {

								contacts.remove(i);
								break;
							}
						}

					} else {
						Listas.jop("Lista vazia");
					}

					break;
				case 3: // 3 - Listar o contato\

					list = new StringBuffer();

					if (!contacts.isEmpty()) {

						for (Aluno x : contacts) {
							if (x.getName().charAt(0) == 'a') {
								list.append(x.getMatricula() + " - " + x.getName() + "\n");
							}
						}
						for (Aluno x : contacts) {
							if (x.getName().charAt(0) == 'b') {
								list.append(x.getMatricula() + " - " + x.getName() + "\n");
							}
						}
						for (Aluno x : contacts) {
							if (x.getName().charAt(0) == 'c') {
								list.append(x.getMatricula() + " - " + x.getName() + "\n");
							}
						}
						for (Aluno x : contacts) {
							if (x.getName().charAt(0) == 'd') {
								list.append(x.getMatricula() + " - " + x.getName() + "\n");
							}
						}
						for (Aluno x : contacts) {
							if (x.getName().charAt(0) == 'e') {
								list.append(x.getMatricula() + " - " + x.getName() + "\n");
							}
						}
						for (Aluno x : contacts) {
							if (x.getName().charAt(0) == 'f') {
								list.append(x.getMatricula() + " - " + x.getName() + "\n");
							}
						}
						for (Aluno x : contacts) {
							if (x.getName().charAt(0) == 'g') {
								list.append(x.getMatricula() + " - " + x.getName() + "\n");
							}
						}
						for (Aluno x : contacts) {
							if (x.getName().charAt(0) == 'h') {
								list.append(x.getMatricula() + " - " + x.getName() + "\n");
							}
						}
						for (Aluno x : contacts) {
							if (x.getName().charAt(0) == 'i') {
								list.append(x.getMatricula() + " - " + x.getName() + "\n");
							}
						}
						for (Aluno x : contacts) {
							if (x.getName().charAt(0) == 'j') {
								list.append(x.getMatricula() + " - " + x.getName() + "\n");
							}
						}
						for (Aluno x : contacts) {
							if (x.getName().charAt(0) == 'k') {
								list.append(x.getMatricula() + " - " + x.getName() + "\n");
							}
						}
						for (Aluno x : contacts) {
							if (x.getName().charAt(0) == 'l') {
								list.append(x.getMatricula() + " - " + x.getName() + "\n");
							}
						}
						for (Aluno x : contacts) {
							if (x.getName().charAt(0) == 'm') {
								list.append(x.getMatricula() + " - " + x.getName() + "\n");
							}
						}
						for (Aluno x : contacts) {
							if (x.getName().charAt(0) == 'n') {
								list.append(x.getMatricula() + " - " + x.getName() + "\n");
							}
						}
						for (Aluno x : contacts) {
							if (x.getName().charAt(0) == 'o') {
								list.append(x.getMatricula() + " - " + x.getName() + "\n");
							}
						}
						for (Aluno x : contacts) {
							if (x.getName().charAt(0) == 'p') {
								list.append(x.getMatricula() + " - " + x.getName() + "\n");
							}
						}
						for (Aluno x : contacts) {
							if (x.getName().charAt(0) == 'q') {
								list.append(x.getMatricula() + " - " + x.getName() + "\n");
							}
						}
						for (Aluno x : contacts) {
							if (x.getName().charAt(0) == 'r') {
								list.append(x.getMatricula() + " - " + x.getName() + "\n");
							}
						}
						for (Aluno x : contacts) {
							if (x.getName().charAt(0) == 's') {
								list.append(x.getMatricula() + " - " + x.getName() + "\n");
							}
						}
						for (Aluno x : contacts) {
							if (x.getName().charAt(0) == 't') {
								list.append(x.getMatricula() + " - " + x.getName() + "\n");
							}
						}
						for (Aluno x : contacts) {
							if (x.getName().charAt(0) == 'u') {
								list.append(x.getMatricula() + " - " + x.getName() + "\n");
							}
						}
						for (Aluno x : contacts) {
							if (x.getName().charAt(0) == 'v') {
								list.append(x.getMatricula() + " - " + x.getName() + "\n");
							}
						}
						for (Aluno x : contacts) {
							if (x.getName().charAt(0) == 'w') {
								list.append(x.getMatricula() + " - " + x.getName() + "\n");
							}
						}
						for (Aluno x : contacts) {
							if (x.getName().charAt(0) == 'x') {
								list.append(x.getMatricula() + " - " + x.getName() + "\n");
							}
						}
						for (Aluno x : contacts) {
							if (x.getName().charAt(0) == 'y') {
								list.append(x.getMatricula() + " - " + x.getName() + "\n");
							}
						}
						for (Aluno x : contacts) {
							if (x.getName().charAt(0) == 'z') {
								list.append(x.getMatricula() + " - " + x.getName() + "\n");
							}
						}
						Listas.jop(list.toString());

					} else {

						Listas.jop("Lista está vazia");
					}

					break;
				case 4:// 4 - Listar o contato pela inicial\n

					List<String> lista1 = new ArrayList<String>();
					list = new StringBuffer();

					if (!contacts.isEmpty()) {

						for (Aluno string : contacts) {
							lista1.add(string.getName() + "\n");
						}

						String letras = Listas.jopStr("Digite a letra inicial:");

						List<String> iniciais = lista1.stream().filter(x -> x.charAt(0) == letras.charAt(0))
								.collect(Collectors.toList());

						for (String f : iniciais) {
							list.append(f);
						}

						JOptionPane.showMessageDialog(null, list);

					} else {
						Listas.jop("Lista vazia");
					}

					break;
				case 5: // "6 - Pesquisar

					if (!contacts.isEmpty()) {

						name = Listas.jopStr("Digite o nome que queira pesquisar:");
						pesquisar(name);

					} else {
						Listas.jop("Lista vazia");
					}

					break;
				case 6: // "6 - Atualizar

					if (!contacts.isEmpty()) {

						name = Listas.jopStr("Digite o nome que queira atualizar");
						celPhone = Listas.jopStr("Digite o telefone que queira atualizar");

						for (int i = 0; i < contacts.size(); i++) {

							if (contacts.get(i).getName() == name) {

								contacts.get(i).setName(name);
								contacts.get(i).setCelPhone(celPhone);
								;
							}

						}
						Listas.jop("Aluno atualizado com sucesso.");
					} else {
						Listas.jop("Lista vazia");
					}

					break;
				case 7: // "6 - LImpar

					if (!contacts.isEmpty()) {

						int r = JOptionPane.showConfirmDialog(null, "Tem certeza que deseja limpar a lista?");
						if (r == 0) {
							contacts.clear();
						}
					} else {
						Listas.jop("A lista já está vazia");
					}

					break;
				case 0: // 0 - Sair

					control = JOptionPane.showConfirmDialog(null, "Tem certeza que deseja sair?");
					if (control == 0) {
						control = 0;
					} else {
						control = -1;
					}
					break;

				default:
					break;
				}
			}
			else {
				Listas.jop("Essa opção só aceita numeros inteiros de 0 - 7");
				control = -1;
			}
		}

	}

	public static boolean hasId(List<Aluno> contacts, int matricula) {

		Aluno emp = contacts.stream().filter(x -> x.getMatricula() == matricula).findFirst().orElse(null);
		return emp != null;
	}
	public static void pesquisar(String parametro) {

		sb = new StringBuffer();

		for (Aluno x : contacts) {

			if (x.getName().equalsIgnoreCase(parametro)) {

				sb.append(x + " consta na lista");
				

				break;
			}

		}
		Listas.jop(sb.toString());

	}

}
