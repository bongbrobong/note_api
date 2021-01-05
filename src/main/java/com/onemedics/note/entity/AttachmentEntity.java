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
@Table(name = "attachment")
public class AttachmentEntity {
    @Id
    @GeneratedValue
    @Column(name = "file_no", nullable = false)
    private long fileNo;

    @Column(name = "sub_no")
    public long subNo;

    @Column(name = "sub_type")
    private String subType;

    @Column(name = "file_path")
    private String filePath;

    @Column(name = "file_at")
    private boolean fileAt;

    @Column(name = "create_dt")
    private LocalDateTime createDt;

    @Column(name = "update_dt")
    private LocalDateTime updateDt;
}
