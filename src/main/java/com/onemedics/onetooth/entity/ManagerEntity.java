package com.onemedics.onetooth.entity;

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

    @Column(name = "mng_enable")
    private boolean mngEnable;

    @Column(name = "create_at")
    private LocalDateTime createAt;

    @Column(name = "update_at")
    private LocalDateTime updateAt;
}
