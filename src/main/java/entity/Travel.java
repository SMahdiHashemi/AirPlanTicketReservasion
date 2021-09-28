package entity;

import base.domain.BaseEntity;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.sql.Time;

@Entity
@Table(name = Travel.TABLE_NAME)
@Getter
@Setter
public class Travel extends BaseEntity<Long> {

    public static final String TABLE_NAME = "travel";
    public static final String IS_READY_FOR_SELLING = "is_ready_to_sell";
    public static final String CAPACITY = "capacity";
    public static final String START_TIME = "start_time";
    public static final String COST_PER_EACH_TICKET = "cost_per_each_ticket";

    @Column(name = Travel.IS_READY_FOR_SELLING, nullable = false)
    private Boolean is_ready_to_sell;

    @Column(name = Travel.CAPACITY, nullable = false)
    private Integer capacity;

    @Column(name = Travel.START_TIME, nullable = false)
    private Time start_time;

    @Column(name = Travel.COST_PER_EACH_TICKET, nullable = false)
    private Long cost_per_each_ticket;

}
