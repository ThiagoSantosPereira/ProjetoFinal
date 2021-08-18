package agendamento;


import java.util.Scanner;

public class Funcoes {
	
	static Scanner leitor = new Scanner(System.in);
	static int QUANTIDADE_AGENDAMENTOS = 0;
	static int QUANTIDADE_USUARIOS = 0;
	static String[] agendamentos = new String[QUANTIDADE_AGENDAMENTOS];
	static String[] horariosDisponiveis = new String[10];
	static String[] usuarios = new String[QUANTIDADE_USUARIOS+1];
	static String[] senhas = new String[QUANTIDADE_USUARIOS+1];
	
	
	
	public static void sigIn(String nomeSignIn, String senhaSignIn) {
		usuarios[QUANTIDADE_USUARIOS] = nomeSignIn;
		senhas[QUANTIDADE_USUARIOS] = senhaSignIn;
		QUANTIDADE_USUARIOS++;
		System.out.println("Usuário cadastrado com sucesso!");
		System.out.println("");
		
	}
	
	public static void login (String nome, String senha) {
		
		for (int i =0; i<usuarios.length;i++) {
			if (	senhas[i].equals(senha) &&
				usuarios[i].equals(nome)) {
				System.out.println("Login bem sucedido!");
				System.out.println("");
			}else {System.out.println("Usuário não cadastrado... entrando como visitante!");
			System.out.println();}
}
	}
	
	public static void exibirMenu() {
		System.out.println("Digite 1 para ver os horarios disponíveis de agendamento");
		System.out.println("Digite 2 para agendar um horario para entrega");
		System.out.println("Digite 3 para exibir a agenda de entregas");
		System.out.println("Digite 4 para sair do sistema");
	}

	public static void inserirHorarios() {
		
		String horarioDigitado;
		
		for (int i = 0; i<horariosDisponiveis.length;i++) {
			
			horarioDigitado = leitor.next();
			
			if (horariosDisponiveis[i]==null) {horariosDisponiveis[i] = horarioDigitado;
			
			 
			} }
	}
	
	public static void agendar() {
		
		if (horariosDisponiveis[0] == null) {System.out.println("Primeiro insira os horarios disponiveis para agendamento no menu 1.");
		System.out.println("");
		}else {
		
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
		}
	}

	public static void exibirAgenda() {
		
		for (int i = 0; i<horariosDisponiveis.length;i++) {
			System.out.println(horariosDisponiveis[i]);
		
	}
	}
}


