package br.com.dev.backend.infrastruct.batch.dtos;

import java.math.BigDecimal;
import java.sql.Date;
import java.sql.Time;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public record Transaction(
        Long id,
        Integer type,
        Date dates,
        BigDecimal amount,
        Long cpf,
        String card,
        Time hours,
        String storeOwner,
        String storeName
) {
    public Transaction withValue(BigDecimal value) {
        return new Transaction(
                this.id(),
                this.type(),
                this.dates(),
                value,
                this.cpf(),
                this.card(),
                this.hours(),
                this.storeOwner().trim(),
                this.storeName().trim()
        );
    }

    public Transaction withDate(String data) throws ParseException {
        var dateFormat = new SimpleDateFormat("yyyyMMdd");
        var date = dateFormat.parse(data);
        return new Transaction(
                this.id(),
                this.type(),
                new Date(date.getTime()),
                this.amount(),
                this.cpf(),
                this.card(),
                this.hours(),
                this.storeOwner().trim(),
                this.storeName().trim()
        );
    }

    public Transaction withHour(String data) throws ParseException {
        var dateFormat = new SimpleDateFormat("HHmmss");
        var date = dateFormat.parse(data);
        return new Transaction(
                this.id(),
                this.type(),
                this.dates(),
                this.amount(),
                this.cpf(),
                this.card(),
                new Time(date.getTime()),
                this.storeOwner().trim(),
                this.storeName().trim()
        );
    }
}