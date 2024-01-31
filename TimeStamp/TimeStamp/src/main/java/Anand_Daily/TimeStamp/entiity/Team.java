package Anand_Daily.TimeStamp.entiity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.Generated;
import org.hibernate.annotations.UpdateTimestamp;

import java.time.LocalDateTime;
import java.time.LocalTime;

@Entity
@Data
@Table(name ="Team")
public class Team {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name= "Team_id")
    public Long Teamid;
    @Column(name="Candidate_Name")
    public String Name;
    @Column(name ="Salary")
    public Double Salary;
    @CreationTimestamp
    @Column(name="CreatedTime", updatable = false)
    public LocalDateTime CreatedTime;

    @UpdateTimestamp
    @Column(name = "UpdateTime", insertable = false)
    public LocalDateTime UpdateTime;



}
