package com.tcs.springwithoracledb.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "Contacts")
@Builder
public class Contacts {
    @Id
    private Integer contactId;
    private String contactName;
    private long contactNumber;
}
