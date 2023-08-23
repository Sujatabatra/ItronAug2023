package com.sujata.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Data
@NoArgsConstructor
@ToString
@Entity
@Table(name = "HusbandHiber")
public class Husband {
    @Id
    private String husbandId;
    private String husbandName;

    @OneToOne
    private Wife wife;

    public Husband(String husbandId, String husbandName) {
        this.husbandId = husbandId;
        this.husbandName = husbandName;
    }
}
