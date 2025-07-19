package com.intuji.blogapi;

import org.springframework.data.jpa.repository.JpaRepository;

public interface BlogRepository extends JpaRepository<Blog, Long> {
    // No code needed! Spring auto-generates CRUD methods like save(), findAll(), etc.
}