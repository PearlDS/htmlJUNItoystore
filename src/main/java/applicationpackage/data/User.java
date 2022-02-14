package applicationpackage.data;

import javax.persistence.*;

@Entity
public class User {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    Integer id;
    @Column(nullable = false)
    String userName;
    @Column(nullable = false)
    String passWord;
    @OneToOne( cascade = CascadeType.PERSIST)
    ShoppingCart shoppingCart;

    public User() {
    }

    public User(String userName, String passWord, ShoppingCart shoppingCart) {
        this.userName = userName;
        this.passWord = passWord;
        this.shoppingCart = shoppingCart;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }

    public ShoppingCart getShoppingCart() {
        return shoppingCart;
    }

    public void setShoppingCart(ShoppingCart shoppingCart) {
        this.shoppingCart = shoppingCart;
    }
}
