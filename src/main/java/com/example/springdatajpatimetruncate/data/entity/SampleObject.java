package com.example.springdatajpatimetruncate.data.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.time.OffsetDateTime;
import java.util.Objects;
import java.util.UUID;

@Entity
@Table(name = "sample_object")
public class SampleObject {

    @Id
    private UUID id;

    private OffsetDateTime businessDate;

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public OffsetDateTime getBusinessDate() {
        return businessDate;
    }

    public void setBusinessDate(OffsetDateTime businessDate) {
        this.businessDate = businessDate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SampleObject that = (SampleObject) o;
        return Objects.equals(id, that.id) && Objects.equals(businessDate, that.businessDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, businessDate);
    }

    @Override
    public String toString() {
        return "SampleObject{" +
                "id=" + id +
                ", businessDate=" + businessDate +
                '}';
    }
}
