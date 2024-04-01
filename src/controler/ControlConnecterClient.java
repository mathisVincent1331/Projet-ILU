package controler;

import entity.CarnetClientel;

public class ControlConnecterClient {
	private CarnetClientel carnetClientel;
	
	public ControlConnecterClient(CarnetClientel carnetClientel) {
		this.carnetClientel = carnetClientel;
	}
	
	public int connecterClient(String mail, String mdp) {	
		int numClient = carnetClientel.estClient(mail);
		
		if (numClient != -1){
			boolean mdpOk = carnetClientel.connecterClient(numClient, mdp);
			
			if (!mdpOk) {
				numClient = -1;
			}
		}
		
		return numClient;
	}
}
