package model;

import lombok.Data;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
@Data
@Table(name = "`order`")
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ORD_ID")
    private int ordId;
    @Column(name = "ORD_DATE")
    private LocalDateTime ordDate;
    @Column(name = "ORD_PRICE")
    private BigDecimal ordPrice;
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "ORD_USR_ID", referencedColumnName = "USR_ID")
    private User user;
}