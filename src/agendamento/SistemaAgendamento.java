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
		
		System.out.println("Digite seu usuário");
		String nome2 = leitor.next();
		System.out.println("Digite sua senha");
		String senha2 = leitor.next();
		
			usuarios[QUANTIDADE_USUARIOS] = nome2;
			senhas[QUANTIDADE_USUARIOS] = senha2;
			QUANTIDADE_USUARIOS++;
			System.out.println("Usuário cadastrado com sucesso!");
			
		
		System.out.println("Digite seu usuário");
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
		/*}else {System.out.println("Você precisa se cadastar no sistema, digite o nome do usuário: ");
		
		String cadastroUsuario = leitor.next();
		System.out.println("Agora digite sua senha: ");
		String cadastroSenha = leitor.next();
		FuncoesAgendamento.cadastrar(cadastroUsuario, cadastroSenha);
		
		}*/
	
		
		while(opcao!=4) {
			System.out.println("Digite 1 para ver os horarios disponíveis de agendamento");
			System.out.println("Digite 2 para agendar um horario para entrega");
			System.out.println("Digite 3 para exibir a agenda de entregas");
			System.out.println("Digite 4 para sair do sistema");
		
			opcao = leitor.nextInt();
			
			switch(opcao) {
			case 1: 
				System.out.println("Digite os horarios disponíveis para agendamento: ");
				String horarioDigitado;
				//Digitar todos os 10 horários de agendamento disponíveis para o dia
				
				//Dentro do loop que solicita a digitação de cada horário, chamar a seguinte função para cada horário digitado
				
				for (int i = 0; i<horariosDisponiveis.length;i++) {
					
					horarioDigitado = leitor.next();
					
					if (horariosDisponiveis[i]==null) {horariosDisponiveis[i] = horarioDigitado;
					
					 
					} }
				
				
			
				
				
				break;
				
			case 2:
				System.out.println("Digite o horário desejado: ");
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
					//Digitar um horário de agendamento desejado. Se estiver disponível, solicitar o nome do cliente e substituir no vetor o horário original por horário + nome do cliente
				//Fazer a verificação com a seguinte funcao
				//FuncoesAgendamento.verificaDisponibilidade(agendamentos, horarioDesejado)
				
				//Fazer a substituição com a seguinte função
				
				
				
				
				
				
				
				break;
				
			case 3:
				System.out.println("Horários agendados: " + QUANTIDADE_AGENDAMENTOS);
				for (int i = 0; i<horariosDisponiveis.length;i++) {
					System.out.println(horariosDisponiveis[i]);
					
				}
				
				break;
			
			case 4:
				System.out.println("Saindo do sistema...");
				break;
			default:
				System.out.println("Digite 1 para ver os horarios disponíveis de agendamento");
				System.out.println("Digite 2 para agendar um horario para entrega");
				System.out.println("Digite 3 para exibir a agenda de entregas");
				System.out.println("Digite 4 para sair do sistema");
			
				break;
				
			}
			
		}

	}

}
