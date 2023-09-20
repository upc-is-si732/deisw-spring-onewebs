package pe.edu.upc.onewebs.business.mapper;

import pe.edu.upc.onewebs.business.dto.DetenidoDto;
import pe.edu.upc.onewebs.entity.Detenido;

public class DetenidoMapper {
    public static Detenido dtoToDetenido(DetenidoDto dto) {
        Detenido detenido = new Detenido();
        detenido.setDni(dto.getDni());
        detenido.setApellidos(dto.getApellidos());
        detenido.setNombres(dto.getNombres());
        detenido.setFechaNacimiento(dto.getFechaNacimiento());
        return detenido;
    }
    public static DetenidoDto detenidoToDto(Detenido detenido) {
        DetenidoDto dto = new DetenidoDto();
        dto.setDni(detenido.getDni());
        dto.setApellidos(detenido.getApellidos());
        dto.setNombres(detenido.getNombres());
        dto.setFechaNacimiento(detenido.getFechaNacimiento());
        return dto;
    }
}
