package com.example.demo.Dao;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Date;

@Data
@Entity
public class AbnormalDao {
    @Id
    private String Openid;
    private Integer Healthcondition;
    private Integer Temperature = 0;
    private Integer Symptom = 0;
    private Integer Isolation = 0;

    private Integer Risklocation;
    private Integer Todaylocation = 0;
    private Integer Fourteenlocation = 0;

    private Integer Riskcontact;
    private Integer Peoplecontact = 0;
    private Integer Communitycontact = 0;

    private double Longitude;
    private double Latitude;
    private Date Time;
}
