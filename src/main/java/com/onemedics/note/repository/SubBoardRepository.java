package com.onemedics.note.repository;

import com.onemedics.note.entity.SubBoardEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SubBoardRepository extends JpaRepository<SubBoardEntity, Long> {
    Iterable<SubBoardEntity> findAllByBoardNo(int boardNo);
}
