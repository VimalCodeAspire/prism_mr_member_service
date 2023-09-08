package com.prism.mr.service;

import com.prism.mr.dto.MembersDto;
import com.prism.mr.mapper.MembersMapper;
import com.prism.mr.repository.MembersRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class MemberService {

    private final MembersRepository membersRepository;
    private final MembersMapper membersMapper;

    public MembersDto addOrUpdateMember(MembersDto membersDto) {
       return membersMapper.toDto(membersRepository.save(membersMapper.toEntity(membersDto)));
    }
}
