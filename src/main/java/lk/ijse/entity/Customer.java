package lk.ijse.entity;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
@Data
@ToString
@Entity
@Table(name = "customer")
public class Customer {
    @Id
    @Column(name = "cus_id", length = 30)
    private int id;
    @Column(name = "cus_name",length = 40)
    private String name;
    @Column(name = "cus_address",length = 100)
    private String address;
}
