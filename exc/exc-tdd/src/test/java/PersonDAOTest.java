import org.junit.jupiter.api.Test;

import com.edu.fatec.exc002.Email;
import com.edu.fatec.exc002.Person;
import com.edu.fatec.exc002.PersonDao;

import java.util.Arrays;
import java.util.Collections;
import static org.junit.jupiter.api.Assertions.*;

public class PersonDAOTest {
    
    private final PersonDao dao = new PersonDao();
    
    @Test
    void testPersonValida(){
        Email email = new Email(1, "teste@fatec.com");
        Person person = new Person(1, "João Silva", 25, Arrays.asList(email));
        assertTrue(dao.isValidToInclude(person).isEmpty());
    }

    @Test 
    void testNomeInvalidoApenasUmaParteOuComNumeros(){
        Email email = new Email(1, "teste@email.com");
        Person pUmaParte = new Person(1, "Joao", 25, Arrays.asList(email));
        assertFalse(dao.isValidToInclude(pUmaParte).isEmpty());

        Person pComNumero = new Person(1, "Joao 123", 25, Arrays.asList(email));
        assertFalse(dao.isValidToInclude(pComNumero).isEmpty());
    }
    @Test
    void testIdadeForaDoIntervalo() {
        Email email = new Email(1, "teste@fatec.com");

        Person pIdadeZero = new Person(1, "Joao Silva", 0, Arrays.asList(email));
        assertFalse(dao.isValidToInclude(pIdadeZero).isEmpty());

        Person pIdadeAlta = new Person(1, "Joao Silva", 201, Arrays.asList(email));
        assertFalse(dao.isValidToInclude(pIdadeAlta).isEmpty());
    }

    @Test
    void testSemEmailAssociado() {
        Person person = new Person(1, "Joao Silva", 25, Collections.emptyList());
        assertFalse(dao.isValidToInclude(person).isEmpty());
    }

    @Test
    void testEmailFormatoInvalido() {
        Email emailInvalido = new Email(1, "email-invalido");
        Person person = new Person(1, "Joao Silva", 25, Arrays.asList(emailInvalido));
        assertFalse(dao.isValidToInclude(person).isEmpty());
    }
}   
