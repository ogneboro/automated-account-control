package ru.sps38.automated_account_control.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@Entity
@Table
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Post {
    @Id
    private String name;
    private String type;
    private boolean email;
    private boolean ad;
    private boolean uat;
    private boolean buh;
    private boolean doc;
    private boolean zup;
}
