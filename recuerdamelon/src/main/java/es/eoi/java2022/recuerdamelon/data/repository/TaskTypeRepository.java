package es.eoi.java2022.recuerdamelon.data.repository;


import es.eoi.java2022.recuerdamelon.data.entity.Community;
import es.eoi.java2022.recuerdamelon.data.entity.TaskType;
import es.eoi.java2022.recuerdamelon.dto.TaskTypeDTO;
import org.springframework.data.jpa.repository.JpaRepository;


public interface TaskTypeRepository extends JpaRepository<TaskType,Integer> {
    TaskType findByName (String name);
}
