package es.eoi.java2022.recuerdamelon.dto.service.mapper;

import es.eoi.java2022.recuerdamelon.data.entity.TaskType;
import es.eoi.java2022.recuerdamelon.dto.TaskTypeDTO;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface TaskTypeServiceMapper extends IEntityMapper<TaskType,TaskTypeDTO> {
}

