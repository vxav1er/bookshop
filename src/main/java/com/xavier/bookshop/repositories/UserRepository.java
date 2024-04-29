package com.xavier.bookshop.repositories;

import com.xavier.bookshop.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
