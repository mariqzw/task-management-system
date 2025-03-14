package org.mariqzw.repositories;

import org.mariqzw.models.Task;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;
import java.util.UUID;

@Repository
public interface TaskRepository extends JpaRepository<Task, UUID> {

    Optional<Task> findByTitle(String title);
    Optional<Task> findByAssigneeUsername(String username);
    Optional<Task> findByAuthorUsername(String username);
    Optional<Task> findById(UUID id);
}
