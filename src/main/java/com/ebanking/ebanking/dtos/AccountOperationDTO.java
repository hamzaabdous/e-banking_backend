package com.ebanking.ebanking.dtos;

import com.ebanking.ebanking.enums.OperationType;
import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Data
public class AccountOperationDTO {
    private Long id;
    private Date operationDate;
    private double amount;
    private OperationType type;
    private String description;
}