package com.onemedics.note.entity;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "note")
public class NoteEntity {
    @Id
    @GeneratedValue
    @Column(name = "note_no", nullable = false)
    private long noteNo;

    @Column(name = "menu_no", nullable = false)
    private long menuNo;

    @Column(name = "note_ver")
    private String noteVer;

    @Column(name = "note_cont")
    private String noteCont;
}
