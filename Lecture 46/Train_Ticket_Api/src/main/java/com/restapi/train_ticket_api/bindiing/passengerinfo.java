package com.restapi.train_ticket_api.bindiing;

import lombok.Data;

@Data
public class passengerinfo {
      private String name;
      private long phno;
      private String jdate;
      private String from;
      private String to;
      private Integer trainNumber;
}