package br.com.supera.tennis.store;

import org.springframework.beans.factory.annotation.Value;

import java.math.BigDecimal;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Product {

    @Id
    @GeneratedValue
    private long id;

    private String name;

    private BigDecimal price;

    private short score;

    private String image;

    public Product() {
    }

    public Product(long id, String name, BigDecimal price, short score, String image) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.score = score;
        this.image  = image;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public short getScore() {
        return score;
    }

    public void setScore(short score) {
        this.score = score;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Produto{");
        sb.append("id=").append(id);
        sb.append(", nome='").append(name).append('\'');
        sb.append(", preço=").append(price);
        sb.append(", score='").append(score).append('\'');
        sb.append("}");
        return sb.toString();
    }
}