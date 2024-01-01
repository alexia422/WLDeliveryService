package model;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.math.BigDecimal;
import java.util.Date;


    @Getter
    @Setter
    @Builder
    @ToString(callSuper = true)
    public class Order extends BaseModel {
       // private Customer customer;
        private Date submitDate;
        private OrderStatus status;
        private PaymentMeth paymentMethod;
        private BigDecimal cost;

    }

