package com.parabbits.PARAtime.persistence.shared;

import javax.persistence.*;
import java.io.Serializable;

@MappedSuperclass
public abstract class Order implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Long successor;
    private boolean head;
    private Long orderValue;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getSuccessor() {
        return successor;
    }

    public void setSuccessor(Long successor) {
        this.successor = successor;
    }

    public boolean isHead() {
        return head;
    }

    public void setHead(boolean head) {
        this.head = head;
    }

    public Long getOrderValue() {
        return orderValue;
    }

    public void setOrderValue(Long orderValue) {
        this.orderValue = orderValue;
    }
}
