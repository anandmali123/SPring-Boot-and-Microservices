package Anand_daily.Composite_primary_Key.repository;

import Anand_daily.Composite_primary_Key.entity.Account;
import Anand_daily.Composite_primary_Key.entity.AccountPK;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AccountRepository extends JpaRepository<Account, AccountPK> {
}
