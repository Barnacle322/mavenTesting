package com.comapny.Payments.entity;

import lombok.*;
import lombok.experimental.FieldDefaults;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
@Table(name = "transactions")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Transaction {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Long id;

    @ManyToOne
    @JoinColumn(name = "sender_account_number", referencedColumnName = "account_number")
    String senderAccountNumber;

    @ManyToOne
    @JoinColumn(name = "receiver_account_number", referencedColumnName = "account_number")
    String receiverAccountNumber;

    @Column(name = "transfer_amount")
    BigDecimal transferAmount;

    @Column(name = "currency")
    String currency;
}
