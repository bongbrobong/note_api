package com.onemedics.note.entity;

import lombok.*;

import javax.persistence.*;
import java.time.LocalDateTime;

@Data
@Getter
@Setter
@Entity
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@Table(name = "menu")
public class MenuEntity {
    @Id
    @GeneratedValue
    @Column(name = "menu_no", nullable = false)
    private long menuNo;

    @Column(name = "menu_p_no", nullable = false)
    private long menuPNo;

    @Column(name = "menu_name")
    private String menuName;

    @Column(name = "menu_order")
    private int menuOrder;

    @Column(name = "menu_at")
    private boolean menuAt;

    @Column(name = "create_dt")
    private LocalDateTime createDt;

    @Column(name = "update_dt")
    private LocalDateTime updateDt;
}
