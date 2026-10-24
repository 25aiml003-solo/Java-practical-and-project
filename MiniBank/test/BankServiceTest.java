import exception.*;
import model.Account;
import org.junit.jupiter.api.Test;
import repository.Repository;
import service.BankService;

import java.nio.file.Paths;

import static org.junit.jupiter.api.Assertions.*;

public class BankServiceTest {
    @Test
    void depositIncreasesBalance() throws Exception {
        Repository<Account> repo = new Repository<>();
        BankService bank = new BankService(repo, Paths.get("test-data/accounts.dat"),
                Paths.get("test-data/log.log"));
        bank.openAccount("AC1", "Test", 100);
        bank.deposit("AC1", 50);
        assertEquals(150, repo.findById("AC1").getBalance());
    }

    @Test
    void withdrawalOverBalanceThrows() throws Exception {
        Repository<Account> repo = new Repository<>();
        BankService bank = new BankService(repo, Paths.get("test-data/accounts.dat"),
                Paths.get("test-data/log.log"));
        bank.openAccount("AC1", "Test", 100);
        assertThrows(InsufficientFundsException.class,
                () -> bank.withdraw("AC1", 200));
    }
}