package entity;

import base.domain.BaseEntity;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = Airline.TABLE_NAME)
@Getter
@Setter
public class Airline extends BaseEntity<Long> {

    public static final String TABLE_NAME = "airline";
    public static final String ADDRESS = "address";
    public static final String FNAME = "first_name";
    public static final String LNAME = "last_name";
    public static final String PASS = "password";

    @Column(name = Airline.ADDRESS, nullable = false)
    private String address;

    @Column(name = Airline.FNAME, nullable = false)
    private String first_name;

    @Column(name = Airline.LNAME, nullable = false)
    private String last_name;

    @Column(name = Airline.PASS, nullable = false)
    private String password;



}
