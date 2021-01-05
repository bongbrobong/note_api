package com.onemedics.note.repository;

import com.onemedics.note.entity.AttachmentEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AttachmentRepository extends JpaRepository<AttachmentEntity, Long> {
    Iterable<AttachmentEntity> findAllBySubType(String subType);
}
