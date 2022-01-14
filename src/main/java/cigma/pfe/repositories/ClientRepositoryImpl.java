package cigma.pfe.repositories;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import cigma.pfe.models.Client;

public class ClientRepositoryImpl implements ClientRepository {

	EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("client_save");
	EntityManager entityManager = entityManagerFactory.createEntityManager();

	@Override
	public boolean save(Client c) {
		entityManager.getTransaction().begin();

		entityManager.persist(c);

		entityManager.getTransaction().commit();

		System.out.println("DAO Layer : ClientRepositoryImpl Level");

		return true;
	}

	public ClientRepositoryImpl() {

	}

}
