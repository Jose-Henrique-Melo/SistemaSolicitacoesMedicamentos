package TesteSistema;

import java.util.Optional;
import java.util.Scanner;
import EntidadeSistema.Usuario;
import AcessoSistemaDao.UsuarioDao;

public class TesteMain {
	Scanner entradaValor = new Scanner(System.in);

	public String getValue(String msg) {

		System.out.println(msg);
		return entradaValor.nextLine();
	}

	public static void main(String[] args) {
		UsuarioDao usuarioDao = new UsuarioDao();
		TesteMain testeMain = new TesteMain();
		Scanner entradaValor = new Scanner(System.in);

		while (true) {

			System.out.println(
					"                                                                                                                                                         \r\n"
							+ "                           ____                                                                                                                          \r\n"
							+ "                         ,'  , `.                                                              ____                         ___                          \r\n"
							+ "                      ,-+-,.' _ |               ,---,  ,--,                                  ,'  , `.                     ,--.'|_                        \r\n"
							+ "                   ,-+-. ;   , ||             ,---.'|,--.'|                               ,-+-,.' _ |             ,---,   |  | :,'   ,---.               \r\n"
							+ "                  ,--.'|'   |  ;|             |   | :|  |,                             ,-+-. ;   , ||         ,-+-. /  |  :  : ' :  '   ,'\\   .--.--.    \r\n"
							+ "                 |   |  ,', |  ':  ,---.      |   | |`--'_       ,---.     ,--.--.    ,--.'|'   |  || ,---.  ,--.'|'   |.;__,'  /  /   /   | /  /    '   \r\n"
							+ "                 |   | /  | |  || /     \\   ,--.__| |,' ,'|     /     \\   /       \\  |   |  ,', |  |,/     \\|   |  ,\"' ||  |   |  .   ; ,. :|  :  /`./   \r\n"
							+ "                 '   | :  | :  |,/    /  | /   ,'   |'  | |    /    / '  .--.  .-. | |   | /  | |--'/    /  |   | /  | |:__,'| :  '   | |: :|  :  ;_     \r\n"
							+ "                 ;   . |  ; |--'.    ' / |.   '  /  ||  | :   .    ' /    \\__\\/: . . |   : |  | ,  .    ' / |   | |  | |  '  : |__'   | .; : \\  \\    `.  \r\n"
							+ "                 |   : |  | ,   '   ;   /|'   ; |:  |'  : |__ '   ; :__   ,\" .--.; | |   : |  |/   '   ;   /|   | |  |/   |  | '.'|   :    |  `----.   \\ \r\n"
							+ "                 |   : '  |/    '   |  / ||   | '/  '|  | '.'|'   | '.'| /  /  ,.  | |   | |`-'    '   |  / |   | |--'    ;  :    ;\\   \\  /  /  /`--'  / \r\n"
							+ "                 ;   | |`-'     |   :    ||   :    :|;  :    ;|   :    :;  :   .'   \\|   ;/        |   :    |   |/        |  ,   /  `----'  '--'.     /  \r\n"
							+ "                 |   ;/          \\   \\  /  \\   \\  /  |  ,   /  \\   \\  / |  ,     .-./'---'          \\   \\  /'---'          ---`-'             `--'---'   \r\n"
							+ "                 '---'            `----'    `----'    ---`-'    `----'   `--`---'                    `----'                                              \r\n"
							+ "                                 JOSE HENRIQUE DE MELO - ENGENHARIA DA COMPUTA��O - LINKEDIN: jos�-henrique-melo-a7597616a - @J_M_H                         ");

			System.out.println(
					"                                           _____________________________________________________________________");
			System.out.println(
					"                                           ||  OP ||                Cliente - Medicamento                     ||");
			System.out.println(
					"                                           ||  1  || Cliente - Medicamento || Solicitar                       ||");
			System.out.println(
					"                                           ||  2  || Cliente - Medicamento || Atualizar Solicita��o           ||");
			System.out.println(
					"                                           ||  3  || Cliente - Medicamento || Consultar Solicita��o           ||");
			System.out.println(
					"                                           ||  4  || Cliente - Medicamento || Cancelar Solicita��o            ||");

			// @Jos� Henrique de Melo || Eng.Computa��o

			System.out.println(
					"                                                             ______________________________");
			System.out.println(
					"                                                             ||  OP ||      Sistema     ||");
			System.out.println(
					"                                                             ||  9  || Sistema || Sair  ||");
			System.out.println(
					"                                                             ||  0  || Sistema || Sobre ||");
			System.out.println(
					"\n\n                                              ***** Escolha uma das op��es (OP) acima para prosseguir: ***** \n");

			int opcao = 0;

			try {
				opcao = entradaValor.nextInt();
			} catch (Exception erro) {
				System.out.println("O valor n�o pode ser escolhido! Digite um dos valores informado nas op��es");
				System.out.println("Saindo do Sistema...");
				System.exit(0);
			}

			switch (opcao) {

			case 0:
				System.out.println(
						"                                                    ||__________________________________________||");
				System.out.println(
						"                                                    ||		                                ||");
				System.out.println(
						"                                                      ||Desenvolved by: @Jose Henrique de Melo||");
				System.out.println(
						"                                                        ||   Gradution in Computer Engineer ||");
				System.out.println(
						"                                                          ||         Unopar Catua�        ||");
				System.out.println(
						"                                                            ||                          ||");
				System.out.println(
						"                                                              ||                      ||");
				System.out.println(
						"                                                                ||__________________||");

				break;

			case 1:

				Usuario usuario = new Usuario();

				usuario.setNome(testeMain.getValue("Digite o Nome do Usu�rio:"));

				usuario.setEmail(testeMain.getValue("Digite o E-mail do Usu�rio:"));

				usuario.setTelefone(testeMain.getValue("Digite o Telefone do Usu�rio:"));

				usuario.setNomeMedicamento(testeMain.getValue("Digite o Nome do Medicamento:"));

				usuario.setDose(testeMain.getValue("Digite a Dosagem do Medicamento:"));

				usuario.setCpf(testeMain.getValue("Digite o CPF:"));

				usuarioDao.salvar(usuario);

				System.out.println("\nSolicita��o cadastrada com sucesso!");

				
				break;

			case 2:

				Usuario usuario1 = new Usuario();

				System.out.println(
						"__________________________________________________________________________________________________________________________________________________________________________");
				System.out.println(
						"||                                                                               SOLICITA��O                                                                            ||");

				usuarioDao.buscarTodos().forEach(System.out::println);

				usuario1.setId(Integer.valueOf(testeMain.getValue("Escolha o c�digo da Solicita��o que deseja atualizar: ")));

				usuario1.setNome(testeMain.getValue("Digite o Nome do Usu�rio:"));

				usuario1.setEmail(testeMain.getValue("Digite o E-mail do Usu�rio:"));

				usuario1.setTelefone(testeMain.getValue("Digite o Telefone do Usu�rio:"));

				usuario1.setNomeMedicamento(testeMain.getValue("Digite o Nome do Medicamento:"));

				usuario1.setDose(testeMain.getValue("Digite a Dosagem do Medicamento:"));

				usuario1.setCpf(testeMain.getValue("Digite o CPF:"));

				usuarioDao.atualizar(usuario1, null);

				System.out.println("\nSolicita��o atualizada com sucesso!");

				
				break;

			case 3:

				System.out.println(
						"__________________________________________________________________________________________________________________________________________________________________________");
				System.out.println(
						"||                                                                               SOLICITA��O                                                                            ||");
				usuarioDao.buscarTodos().forEach(System.out::println);

				System.out.println("\nSolicita��o consultada com sucesso!");

				
				break;
			case 4:
				
				System.out.println(
						"__________________________________________________________________________________________________________________________________________________________________________");
				System.out.println(
						"||                                                                               SOLICITA��O                                                                            ||");
				usuarioDao.buscarTodos().forEach(System.out::println);	
				System.out.println("Digite o c�digo da Solicita��o de Medicamento que deseja cencelar: ");
				long id3 = entradaValor.nextLong();
						Optional<Usuario> usuario4 = usuarioDao.buscar(id3);
				
						usuarioDao.deletar(usuario4.get());
						
				System.out.println("\nSolicita��o removida com sucesso!");

				break;

			case 9:
				System.out.println("Finalizando...");
				System.exit(0);
				break;

			default:
				System.out.println("Op��o n�o encontrada. Tente novamente!");

			}

			System.out.println("\n\n\nDeseja terminar sess�o ? [S] ou [N] ");
			String opcao2 = entradaValor.next();

			if (opcao2.equals("S") || opcao2.equals("s")) {
				System.out.println("Finalizando...");
				System.exit(0);
				// @Jos� Henrique de Melo || Eng.Computa��o
			}
		}
	}
}