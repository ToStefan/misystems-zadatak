package stefan.tflc.misystems.zadatak.service.impl;

import stefan.tflc.misystems.zadatak.web.dto.PageDTO;
import org.springframework.data.domain.Pageable;
import java.util.Set;

import org.springframework.stereotype.Service;
import javax.transaction.Transactional;

import stefan.tflc.misystems.zadatak.repository.UserRepository;
import stefan.tflc.misystems.zadatak.service.UserService;
import stefan.tflc.misystems.zadatak.web.dto.UserDTO;
import stefan.tflc.misystems.zadatak.web.mapper.UserMapper;

@Transactional
@Service
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;
    private final UserMapper userMapper;

    public UserServiceImpl(UserRepository userRepository, UserMapper userMapper) {
    	this.userRepository = userRepository;
    	this.userMapper = userMapper;
    }

    @Override
    public Set<UserDTO> findAll() {
        return userMapper.toDTOStripped(userRepository.findAll());
    }

    @Override
    public PageDTO<UserDTO> findAll(Pageable pageable) {
        return userMapper.toPageDTO(userRepository.findAll(pageable), pageable);
	}

    @Override
    public UserDTO findById(Long id) {
        return userMapper.toDTO(userRepository.getOne(id));
    }

    @Override
    public UserDTO create(UserDTO userDTO) {
        return userMapper.toDTO(userRepository.save(userMapper.toEntity(userDTO)));
    }

    @Override
    public UserDTO update(UserDTO userDTO) {
        return userMapper.toDTO(userRepository.save(userMapper.toEntityWithId(userDTO)));
    }

    @Override
    public void remove(Long userId) {
        userRepository.deleteById(userId);
    }

}