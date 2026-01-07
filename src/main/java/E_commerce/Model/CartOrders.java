package E_commerce.Model;

import java.sql.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class CartOrders {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "orderid")
    private Long orderid;
    private String Name;
    private Date dateofmanufactire;
    private long price;
    private String size;
    private String shirtname;

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    
    public String getName() {
        return Name;
    }
    public void setName(String name) {
        Name = name;
    }
    public Date getDateofmanufactire() {
        return dateofmanufactire;
    }
    public void setDateofmanufactire(Date dateofmanufactire) {
        this.dateofmanufactire = dateofmanufactire;
    }
    public long getPrice() {
        return price;
    }
    public void setPrice(long price) {
        this.price = price;
    }
    public String getSize() {
        return size;
    }
    public void setSize(String size) {
        this.size = size;
    }
    public String getShirtname() {
        return shirtname;
    }
    public void setShirtname(String shirtname) {
        this.shirtname = shirtname;
    }


}
