package entity;

import base.domain.BaseEntity;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = SoldTicket.TABLE_NAME)
@Getter
@Setter
public class SoldTicket extends BaseEntity<Long> {

    public static final String TABLE_NAME = "sold_ticket";
    public static final String PHONE_NUMBER = "phone_number";
    public static final String NATIONAL_CODE = "national_code";
    public static final String PASSENGER_NAME = "passenger_name";

    @Column(name = SoldTicket.PHONE_NUMBER, nullable = false)
    private Integer phone_number;

    @Column(name = SoldTicket.NATIONAL_CODE, nullable = false)
    private Long national_code;

    @Column(name = SoldTicket.PASSENGER_NAME, nullable = false)
    private String passenger_name;

}
