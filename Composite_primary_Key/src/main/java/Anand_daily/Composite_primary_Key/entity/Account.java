package Anand_daily.Composite_primary_Key.entity;

import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name ="Bank_Accounts")
public class Account {

    @Column(name ="Branch_Name")
    private String branchName;

    @Column(name = "Min_Bal")
    private Double minBal;

    @EmbeddedId
    private AccountPK accPk;


    public void setBranchName(String cname) {
        branchName=cname;
    }

    public void setMinBal(double v) {
        minBal=v;
    }

    public void setAccPk(AccountPK pk) {
        accPk= pk;
    }
}
