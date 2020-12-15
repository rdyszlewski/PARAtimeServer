package com.parabbits.PARAtime.persistence.shared;

import javax.persistence.MappedSuperclass;

@MappedSuperclass
public class Order {

    protected Long successor;
    protected boolean head;
    protected Long orderValue;

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
