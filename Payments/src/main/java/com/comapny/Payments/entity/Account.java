package com.comapny.Payments.entity;

import lombok.*;
import lombok.experimental.FieldDefaults;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
@Table(name = "account")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Account {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Long id;

    @Column(name = "account_number")
    String accountNumber;

    @ManyToOne
    @JoinColumn(name =  "client_id", referencedColumnName = "id")
    Client client;

    @Column(name = "balance")
    BigDecimal balance;

    @Column(name = "currency")
    String currency;
}
