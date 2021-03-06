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
@Table(name = "note")
public class NoteEntity {
    @Id
    @GeneratedValue
    @Column(name = "note_no", nullable = false)
    public long noteNo;

    @Column(name = "note_ver")
    private String noteVer;

    @Column(name = "note_cont")
    private String noteCont;

    @Column(name = "release_file_path")
    private String releaseFilePath;

    @Column(name = "release_file_down_cnt")
    private int releaseFileDownCnt;

    @Column(name = "beta_file_path")
    private String betaFilePath;

    @Column(name = "beta_file_down_cnt")
    private int betaFileDownCnt;

    @Column(name = "create_mng_no")
    private int createMngNo;

    @Column(name = "create_at")
    private LocalDateTime createAt;

    @Column(name = "update_mng_no")
    private int updateMngNo;

    @Column(name = "update_at")
    private LocalDateTime updateAt;

}
