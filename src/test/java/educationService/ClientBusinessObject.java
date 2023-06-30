package educationService;

import java.util.List;

public interface ClientBusinessObject {
    List<String> getAllStudentsBySubject(String subject);
    void markCurrentClassesInactive();

    List<Client> getAllClients();

    Client getClientById(String clientId);

    void addClient(Client client);

    void updateClient(Client client);

    void deleteClient(String clientId);
}