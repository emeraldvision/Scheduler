package org.launchcode.scheduler.models.data;

import org.launchcode.scheduler.models.Task;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;

@Repository
@Transactional
public interface TaskDao extends CrudRepository<Task, Integer> {
}
