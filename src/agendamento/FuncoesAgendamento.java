package agendamento;

import java.util.Scanner;



public class FuncoesAgendamento {
	static int QUANTIDADE_AGENDAMENTOS=1;
	static int QUANTIDADE_USUARIOS=2;
	static String usuarios[] =  {"leo", "gabi"};//new String[QUANTIDADE_USUARIOS];
	static String senhas[] = {"123","2"}; //new String[QUANTIDADE_USUARIOS];
	static Scanner leitor = new Scanner(System.in);
	static String[] horariosAgendados = new String[10];

	
	
	public static int getQuantidadeAgendamentos() {
		return QUANTIDADE_AGENDAMENTOS;
	}
	
	

	public static boolean login(String usuario, String senha) {
		for (int i = 0 ; i <usuarios.length;i++) {
			
			if (usuarios[i].equalsIgnoreCase(usuario)) {
		return true;}}
		
		
	}
	public static void cadastrar(String cadastroUsuario, String cadastroSenha) {
		
		for (int i = 0; i<usuarios.length; i++) {
			if (usuarios[i] == null) {
				usuarios[i] = cadastroUsuario;
				senhas[i]= cadastroSenha;
			}
			
		}QUANTIDADE_USUARIOS++;
	}

		

	public static void exibirMenu() {
		
	}

	public static String[] inserirHorario(String horarioDigitado) {
		
		for (int i = 0; i<horariosAgendados.length;i++) {
			
			horarioDigitado = leitor.next();
			System.out.println("Informe o horarios disponiveis para agendamento: ");
			if (horariosAgendados[i]==null) {horariosAgendados[i] = horarioDigitado;
			 
			} }
		QUANTIDADE_AGENDAMENTOS++;
		
			
		   
			return horariosAgendados;
			
		
				
			}
	

	public static void agendar(String[] agendamentos, String horarioDesejado, String nomeCliente) {
		
		
	}
			
	//Digitar um horário de agendamento desejado. Se estiver disponível, solicitar o nome do cliente e substituir no vetor o horário original por horário + nome do cliente
	//Fazer a verificação com a seguinte funcao
	//FuncoesAgendamento.verificaDisponibilidade(agendamentos, horarioDesejado)
	
	//Fazer a substituição com a seguinte função
	
	
	String horarioDesejado;
	FuncoesAgendamento.agendar(agendamentos, horarioDesejado, String nomeCliente);
	horarioDesejado = leitor.next();
	
	nomeCliente = leitor.next();



	public static String exibirAgenda(String[] agendamentos) {
		// TODO Auto-generated method stub
		return null;
	}
		
}
}

	
	

