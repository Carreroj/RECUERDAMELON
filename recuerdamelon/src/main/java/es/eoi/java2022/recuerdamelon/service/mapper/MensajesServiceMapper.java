package es.eoi.java2022.recuerdamelon.service.mapper;

import es.eoi.java2022.recuerdamelon.data.entity.ChatMessage;
import es.eoi.java2022.recuerdamelon.data.entity.Mensajes;
import es.eoi.java2022.recuerdamelon.dto.MensajesDTO;
import es.eoi.java2022.recuerdamelon.dto.MessagesDTO;
import org.mapstruct.Mapper;


@Mapper(componentModel = "spring", uses = {MensajesServiceMapper.class})
public interface MensajesServiceMapper extends IEntityMapper<Mensajes, MensajesDTO> {
}
