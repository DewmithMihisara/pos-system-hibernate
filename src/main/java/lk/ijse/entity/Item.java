package lk.ijse.entity;

import lombok.Data;
import lombok.ToString;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
@Data
@ToString
@Entity
@Table(name = "items")
public class Item {
    @Id
    @Column(name = "code")
    private int code;
    @Column(name = "itm_description")
    private String description;
    @Column(name = "qtyOnHand")
    private int qtyOnHand;
    @Column(name = "unitPrice")
    private double unitPrice;
}
