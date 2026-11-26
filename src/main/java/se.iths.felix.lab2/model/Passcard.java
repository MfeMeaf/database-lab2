package main.java.se.iths.felix.lab2.model;

import java.time.LocalDate;
import java.util.Objects;

public class Passcard {
    private final Integer cardNumber;
    private final LocalDate issueDate;
    private final LocalDate expireDate;

    public Passcard(Integer cardNumber, LocalDate issueDate, LocalDate expireDate) {
        this.cardNumber = Objects.requireNonNull(cardNumber, "Card number can not be null");
        this.issueDate = Objects.requireNonNull(issueDate, "Issue date can not be null");
        this.expireDate = Objects.requireNonNull(expireDate, "Expire date can not be null");
    }

    public Integer getCardNumber() {
        return cardNumber;
    }

    public LocalDate getIssueDate() {
        return issueDate;
    }

    public LocalDate getExpireDate() {
        return expireDate;
    }

    @Override
    public String toString() {
        return "Passcard{" +
                "cardNumber=" + cardNumber +
                ", issueDate=" + issueDate +
                ", expireDate=" + expireDate +
                '}';
    }
}
