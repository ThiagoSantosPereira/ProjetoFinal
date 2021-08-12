package agendamento;

import java.util.Scanner;

public class SistemaAgendamento {

	private static final String String = null;

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		String[] agendamentos = new String[QUANTIDADE_AGENDAMENTOS];
		String[] horariosDisponiveis = {"8:00", "9:00", "10:00","11:00","12:00","13:00","14:00","15:00","16:00","17:00"};
		int opcao = 0;
		String usuario, senha;
		System.out.println("Para entrar no sistema voc� deve informar seu usu�rio e sua senha");
		System.out.println("Digite seu usu�rio");
		usuario = leitor.next();
		System.out.println("Digite sua senha");
		senha = leitor.next();

		if(FuncoesAgendamento.login(usuario, senha)){
			System.out.println("Login bem sucedido!");
		}else {
			System.out.println("Usu�rio ou senha incorretos.");
			System.exit(1);
		}
		
		
		
		while(opcao!=4) {
			FuncoesAgendamento.exibirMenu();
			opcao = leitor.nextInt();
			
			switch(opcao) {
			case 1:
				//Digitar todos os 10 hor�rios de agendamento dispon�veis para o dia
				
				//Dentro do loop que solicita a digita��o de cada hor�rio, chamar a seguinte fun��o para cada hor�rio digitado
				for (int i = 0; i<horariosDisponiveis.length;i++) {
				
				String horarioDigitado = leitor.next();
				FuncoesAgendamento.inserirHorario(horariosDisponiveis, horarioDigitado);
				}
				
				break;
				
			case 2:
				
				String horarioDesejado = leitor.next();
				for (int i =0;i<horariosDisponiveis.length;i++) {
				if (horariosDisponiveis[i].equals(horarioDesejado)) {
					
					String nomeCliente = leitor.next();
					
					
				}
					
					
					
				}
					//Digitar um hor�rio de agendamento desejado. Se estiver dispon�vel, solicitar o nome do cliente e substituir no vetor o hor�rio original por hor�rio + nome do cliente
				//Fazer a verifica��o com a seguinte funcao
				//FuncoesAgendamento.verificaDisponibilidade(agendamentos, horarioDesejado)
				
				//Fazer a substitui��o com a seguinte fun��o
				
				
				
				FuncoesAgendamento.agendar(agendamentos, horarioDesejado, String nomeCliente);
				
				
				String nomeCliente = leitor.next();
				break;
				
			case 3:
				//Exibir a agenda completa
				FuncoesAgendamento.exibirAgenda(agendamentos);
				break;
			
			case 4:
				//Mensagem de sa�da
				break;
			default:
				//Mensagem de op��o inv�lida
				break;
				
			}
			
		}

	}

}
