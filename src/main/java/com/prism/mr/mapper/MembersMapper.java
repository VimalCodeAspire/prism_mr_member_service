package com.prism.mr.mapper;

import com.prism.mr.dto.MembersDto;
import com.prism.mr.model.Members;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface MembersMapper {

    Members toEntity(MembersDto membersDto);

    MembersDto toDto(Members members);

}
