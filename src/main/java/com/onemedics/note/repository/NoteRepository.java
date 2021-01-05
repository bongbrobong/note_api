package com.onemedics.note.repository;

import com.onemedics.note.entity.NoteEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface NoteRepository extends JpaRepository<NoteEntity, Long> {
    @Query("select a.noteNo, a.menuNo, a.noteVer, a.noteCont," +
            "       a.releaseFilePath, a.releaseFileDownCnt," +
            "       a.betaFilePath, a.betaFileDownCnt," +
            "       a.createMngNo, a.createDt," +
            "       a.updateMngNo, a.updateDt," +
            "       b.fileNo, b.fileAt, b.filePath, b.subNo, b.subType" +
            "       from NoteEntity a left outer join AttachmentEntity b on a.noteNo=b.subNo"
            )
    Iterable<NoteEntity> findAllIncludeAttachments();
}
