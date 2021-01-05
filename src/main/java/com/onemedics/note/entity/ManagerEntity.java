package com.onemedics.note.entity;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDateTime;

@Data
@Getter
@Setter
@Entity
@Table(name = "manager")
public class ManagerEntity {
    @Id
    @GeneratedValue
    @Column(name = "mng_no", nullable = false)
    private long mngNo;

    @Column(name = "mng_name")
    private String mngName;

    @Column(name = "mng_password")
    private String mngPassword;

    @Column(name = "mng_auth")
    private String mngAuth;

    @Column(name = "mng_at")
    private boolean mngAt;

    @Column(name = "create_dt")
    private LocalDateTime createDt;

    @Column(name = "update_dt")
    private LocalDateTime updateDt;
}
