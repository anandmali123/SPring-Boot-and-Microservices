package Anand_daily.Composite_primary_Key.entity;

import jakarta.persistence.Embeddable;
import lombok.Data;

import java.io.Serializable;
@Data
@Embeddable
public class AccountPK implements Serializable {
    private Integer accId;
    private String accType;

    private String holderName;

    public Integer getAccId(){
        return accId;
    }

    public void setAccId(Integer accId){
        this.accId = accId;
    }

    public String getAccType(){
        return accType;
    }

   public void setHolderName(String cname){
        holderName=cname;
   }


    public void setAccType(String current) {

    }

    public void AccType(String cname) {
        accType=cname;
    }
}
