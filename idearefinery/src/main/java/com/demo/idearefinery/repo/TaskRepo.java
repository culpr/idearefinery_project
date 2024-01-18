package com.demo.idearefinery.repo;

import com.demo.idearefinery.model.Task;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface TaskRepo extends JpaRepository<Task, Long> {

    Optional<Task> findCustomerById(Long id);
}
