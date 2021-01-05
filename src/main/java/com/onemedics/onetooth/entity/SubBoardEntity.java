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
@Table(name = "sub_board")
public class SubBoardEntity {
    @Id
    @GeneratedValue
    @Column(name = "sub_board_no", nullable = false)
    private long subBoardNo;

    @Column(name = "board_no", nullable = false)
    private long boardNo;

    @Column(name = "sub_board_cont")
    private String subBoardCont;

    @Column(name = "create_user", nullable = false)
    private String createUser;

    @Column(name = "sub_board_password", nullable = false)
    private String subBoardPassword;

    @Column(name = "create_at")
    private LocalDateTime createAt;

    @Column(name = "update_at")
    private LocalDateTime updateAt;
}
