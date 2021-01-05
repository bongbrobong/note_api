package com.onemedics.note.repository;

import com.onemedics.note.entity.ManagerEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ManagerRepository extends JpaRepository<ManagerEntity, Long> {
    Iterable<ManagerEntity> findByMngPassword(String password);
}
