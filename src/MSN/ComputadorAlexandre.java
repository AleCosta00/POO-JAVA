package src.MSN;

/*
 * Simulação do uso da classe MSNMessenger
 */
public class ComputadorAlexandre {
	public static void main(String[] args) {
		//abrindo MSN Messenger
		MSNMessenger msn = new MSNMessenger();
				
		msn.enviarMensagem();
		
		msn.receberMensagem();
	}
}
