package com.webdev.website.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;

@Entity
@Table(name = "SampleModel")
@Data
@AllArgsConstructor
public class SampleModel {
    @Id
    @Column(name = "P_ID")
    private int P_ID;

    @Column(name = "P_Name")
    private String P_NAME;

    @Column(name = "P_Salary")
    private int P_SALARY;

    public SampleModel() {}
}
