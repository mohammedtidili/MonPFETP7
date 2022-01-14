package cigma.pfe.controllers;

import cigma.pfe.models.Client;
import cigma.pfe.services.ClientService;
import lombok.*;

@Data
public class ClientController {

	ClientService clientService;

	public boolean save(Client c) {
		

		return clientService.save(c);

	}

	public ClientController() {
		System.out.println("je suis ici ClientController");
	}

	public ClientController(ClientService clientService) {
		this.clientService = clientService;
	}

}
