package Anand_daily.Composite_primary_Key;

import Anand_daily.Composite_primary_Key.entity.Account;
import Anand_daily.Composite_primary_Key.entity.AccountPK;
import Anand_daily.Composite_primary_Key.repository.AccountRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class AccountService {
    private AccountRepository accRepo;

    public AccountService(AccountRepository accRepo) {
        this.accRepo = accRepo;
    }

    public void getDataUsingPK() {
        AccountPK pk = new AccountPK();
        pk.setAccId(101);
        pk.setAccType("Current");
        pk.setHolderName("IBM");

        Optional<Account> findById = accRepo.findById(pk);
        if (findById.isPresent()) {
            System.out.println(findById.get());
        }
    }

    public void saveAccData() {
        AccountPK pk = new AccountPK();
        pk.setAccId(104);
        pk.AccType("Savings");
        pk.setHolderName("TCS");

        Account acc = new Account();
        acc.setBranchName("Ameerpet");
        acc.setMinBal(5000.00);

        acc.setAccPk(pk);

        accRepo.save(acc);
    }
}
