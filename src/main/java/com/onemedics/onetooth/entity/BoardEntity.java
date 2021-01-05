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
@Table(name = "board")
public class BoardEntity {
    @Id
    @GeneratedValue
    @Column(name = "board_no", nullable = false)
    private long boardNo;

    @Column(name = "board_title", nullable = false)
    private String boardTitle;

    @Column(name = "create_user", nullable = false)
    private String createUser;

    @Column(name = "board_password", nullable = false)
    private String boardPassword;

    @Column(name = "board_cont")
    private String boardCont;

    @Column(name = "create_at")
    private LocalDateTime createAt;

    @Column(name = "update_at")
    private LocalDateTime updateAt;
}
