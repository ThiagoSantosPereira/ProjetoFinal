package agendamento;

import java.util.Scanner;

public class SistemaAgendamento {

	private static final String String = null;

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		int QUANTIDADE_AGENDAMENTOS = 0;
		int QUANTIDADE_USUARIOS = 0;
		String[] agendamentos = new String[QUANTIDADE_AGENDAMENTOS];
		String[] horariosDisponiveis = new String[10];
		String[] usuarios = new String[QUANTIDADE_USUARIOS+1];
		String[] senhas = new String[QUANTIDADE_USUARIOS+1];
		
		int opcao = 0;
		
		System.out.println("Digite seu usu�rio");
		String nome2 = leitor.next();
		System.out.println("Digite sua senha");
		String senha2 = leitor.next();
		
			usuarios[QUANTIDADE_USUARIOS] = nome2;
			senhas[QUANTIDADE_USUARIOS] = senha2;
			QUANTIDADE_USUARIOS++;
			System.out.println("Usu�rio cadastrado com sucesso!");
			
		
		System.out.println("Digite seu usu�rio");
		String nome = leitor.next();
		System.out.println("Digite sua senha");
		String senha = leitor.next();
		
		
		for (int i =0; i<usuarios.length;i++) {
				if (	senhas[i].equals(senha) &&
					usuarios[i].equals(nome)) {
					System.out.println("Login bem sucedido!");
				}
	}
		
		//(FuncoesAgendamento.login(usuario, senha)){
			
		
		
			
			//System.exit(1);
		/*}else {System.out.println("Voc� precisa se cadastar no sistema, digite o nome do usu�rio: ");
		
		String cadastroUsuario = leitor.next();
		System.out.println("Agora digite sua senha: ");
		String cadastroSenha = leitor.next();
		FuncoesAgendamento.cadastrar(cadastroUsuario, cadastroSenha);
		
		}*/
	
		
		while(opcao!=4) {
			System.out.println("Digite 1 para ver os horarios dispon�veis de agendamento");
			System.out.println("Digite 2 para agendar um horario para entrega");
			System.out.println("Digite 3 para exibir a agenda de entregas");
			System.out.println("Digite 4 para sair do sistema");
		
			opcao = leitor.nextInt();
			
			switch(opcao) {
			case 1: 
				System.out.println("Digite os horarios dispon�veis para agendamento: ");
				String horarioDigitado;
				//Digitar todos os 10 hor�rios de agendamento dispon�veis para o dia
				
				//Dentro do loop que solicita a digita��o de cada hor�rio, chamar a seguinte fun��o para cada hor�rio digitado
				
				for (int i = 0; i<horariosDisponiveis.length;i++) {
					
					horarioDigitado = leitor.next();
					
					if (horariosDisponiveis[i]==null) {horariosDisponiveis[i] = horarioDigitado;
					
					 
					} }
				
				
			
				
				
				break;
				
			case 2:
				System.out.println("Digite o hor�rio desejado: ");
				String horarioDesejado = leitor.next();
				System.out.println("Digite o seu nome: ");
				String nomeCliente = leitor.next();
				
				
				
				for (int i =0;i<horariosDisponiveis.length;i++) {
				if (horariosDisponiveis[i].equals(horarioDesejado)) {
					
					QUANTIDADE_AGENDAMENTOS++;
					horariosDisponiveis[i] = horarioDesejado + "  " + nomeCliente;
					System.out.println("horario agendado com sucesso!");
					
					
				
					
					
				}
				}
					//Digitar um hor�rio de agendamento desejado. Se estiver dispon�vel, solicitar o nome do cliente e substituir no vetor o hor�rio original por hor�rio + nome do cliente
				//Fazer a verifica��o com a seguinte funcao
				//FuncoesAgendamento.verificaDisponibilidade(agendamentos, horarioDesejado)
				
				//Fazer a substitui��o com a seguinte fun��o
				
				
				
				
				
				
				
				break;
				
			case 3:
				System.out.println("Hor�rios agendados: " + QUANTIDADE_AGENDAMENTOS);
				for (int i = 0; i<horariosDisponiveis.length;i++) {
					System.out.println(horariosDisponiveis[i]);
					
				}
				
				break;
			
			case 4:
				System.out.println("Saindo do sistema...");
				break;
			default:
				System.out.println("Digite 1 para ver os horarios dispon�veis de agendamento");
				System.out.println("Digite 2 para agendar um horario para entrega");
				System.out.println("Digite 3 para exibir a agenda de entregas");
				System.out.println("Digite 4 para sair do sistema");
			
				break;
				
			}
			
		}

	}

}
