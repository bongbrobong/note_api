package com.onemedics.onetooth.repository;

import com.onemedics.onetooth.entity.SubBoardEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SubBoardRepository extends JpaRepository<SubBoardEntity, Long> {
}
