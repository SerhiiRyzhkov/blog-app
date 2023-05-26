package com.had0uken.blog_app.repository;

import com.had0uken.blog_app.entity.Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepository extends JpaRepository<Role, Long> {
}
