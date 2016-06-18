package com.programmingfree.springservice.repository;

import java.util.List;

import com.programmingfree.springservice.model.Task;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface TaskRepository extends CrudRepository<Task, Integer> {

	List<Task> findByTaskArchived(@Param("archivedfalse") int taskArchivedFalse);
	List<Task> findByTaskStatus(@Param("status") String taskStatus);

}
