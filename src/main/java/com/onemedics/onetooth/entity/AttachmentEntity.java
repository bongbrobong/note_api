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
@Table(name = "attachment")
public class AttachmentEntity {
    @Id
    @GeneratedValue
    @Column(name = "file_no", nullable = false)
    private long fileNo;

    @Column(name = "note_no")
    public long noteNo;

    @Column(name = "board_no")
    public long boardNo;

    @Column(name = "file_path", nullable = false)
    private String filePath;

    @Column(name = "file_enable")
    private boolean fileEnable;

    @Column(name = "create_dt")
    private LocalDateTime createDt;

    @Column(name = "update_dt")
    private LocalDateTime updateDt;
}
