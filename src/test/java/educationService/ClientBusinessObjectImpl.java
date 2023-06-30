package educationService;

import java.util.List;

public class ClientBusinessObjectImpl implements ClientBusinessObject {
    private final ClassDataObject classDao;

    public ClientBusinessObjectImpl(ClassDataObject clientDao) {
        this.classDao = clientDao;
    }

    public List<String> getAllStudentsBySubject(String subject) {
        return classDao.getAllStudentsBySubject(subject);
    }

    @Override
    public void markCurrentClassesInactive() {
    }

    @Override
    public List<Client> getAllClients() {
        return null;
    }

    @Override
    public Client getClientById(String clientId) {
        return null;
    }

    @Override
    public void addClient(Client client) {

    }

    @Override
    public void updateClient(Client client) {

    }

    @Override
    public void deleteClient(String clientId) {

    }

    public void getClassesByInstructor(String instructorId) {
    }

    public void getStudentsInClass(String classId) {
    }
}