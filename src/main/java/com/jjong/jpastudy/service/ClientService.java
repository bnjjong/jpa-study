/*
 * Created By dogfootmaster@gmail.com on 2022
 * This program is free software
 *
 * @author <a href=“mailto:dogfootmaster@gmail.com“>Jongsang Han</a>
 * @since 2022/01/20
 */

package com.jjong.jpastudy.service;

import com.jjong.jpastudy.controller.dto.ClientForm;
import com.jjong.jpastudy.domain.Client;
import com.jjong.jpastudy.repository.ClientRepository;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * create on 2022/01/20. create by IntelliJ IDEA.
 *
 * <p> 클래스 설명 </p>
 * <p> {@link } and {@link }관련 클래스 </p>
 *
 * @author Jongsang Han
 * @version 1.0
 * @see
 * @since 1.0
 */
@Service
@RequiredArgsConstructor
@Transactional(readOnly = true)
public class ClientService {
  private final ClientRepository clientRepository;

  @Transactional
  public void save(ClientForm form) {
    ModelMapper mapper = new ModelMapper();
    Client client = mapper.map(form, Client.class);
    clientRepository.save(client);
  }
}
