package entity;

import base.domain.BaseEntity;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = AirPort.TABLE_NAME)
@Getter
@Setter
public class AirPort extends BaseEntity<Long> {

    public static final String TABLE_NAME = "air_port";
    public static final String TYPE = "airport_type";
    public static final String NAME = "airport_name";

    @Column(name = AirPort.TYPE, nullable = false)
    private String airport_type;

    @Column(name = AirPort.NAME, nullable = false)
    private String airport_name;

}
