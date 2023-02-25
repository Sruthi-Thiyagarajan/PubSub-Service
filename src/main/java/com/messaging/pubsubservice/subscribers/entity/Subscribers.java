package com.messaging.pubsubservice.subscribers.entity;


import com.messaging.pubsubservice.users.entity.User;
import jakarta.persistence.*;

@Entity
public class Subscribers {
    @Id
    @GeneratedValue
    private int id;

    @OneToOne
    @JoinColumn(name="user_id")
    private User usr;

    @OneToOne
    @JoinColumn(name="sub_shop_id")
    private Shops shp;

    @OneToOne
    @JoinColumn(name="sub_fixed_deals_id")
    private FixedDeals fixedDeals;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public User getUsr() {
        return usr;
    }

    public void setUsr(User usr) {
        this.usr = usr;
    }

    public Shops getShp() {
        return shp;
    }

    public void setShp(Shops shp) {
        this.shp = shp;
    }

    public FixedDeals getFixedDeals() {
        return fixedDeals;
    }

    public void setFixedDeals(FixedDeals fixedDeals) {
        this.fixedDeals = fixedDeals;
    }
}
