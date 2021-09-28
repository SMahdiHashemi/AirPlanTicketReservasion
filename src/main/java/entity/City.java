package entity;

import base.domain.BaseEntity;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = City.TABLE_NAME)
@Getter
@Setter
public class City extends BaseEntity<Long> {

    public static final String TABLE_NAME = "city";
    public static final String NAME = "city_name";

    @Column(name = City.NAME, nullable = false)
    private String city_name;

}
