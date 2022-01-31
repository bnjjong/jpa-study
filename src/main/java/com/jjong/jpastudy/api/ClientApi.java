/*
 * Created By dogfootmaster@gmail.com on 2022
 * This program is free software
 *
 * @author <a href=“mailto:dogfootmaster@gmail.com“>Jongsang Han</a>
 * @since 2022/01/20
 */

package com.jjong.jpastudy.api;

import com.jjong.jpastudy.api.dto.ClientForm;
import com.jjong.jpastudy.api.dto.ClientResponse;
import com.jjong.jpastudy.domain.Client;
import com.jjong.jpastudy.service.ClientService;
import java.util.List;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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

@RestController
@Slf4j
@RequestMapping("/client")
@RequiredArgsConstructor
public class ClientApi {
  private final ClientService clientService;

  /**
   * Api for saving client.
   *
   * @param form
   * @return
   */
  @PostMapping("")
  public ResponseEntity save(@RequestBody ClientForm form) {
    log.info("form : {}", form);
    clientService.save(form);
    return ResponseEntity.status(HttpStatus.CREATED).body("success to save client data");
  }

  @GetMapping("/all")
  public ResponseEntity getAll() {
    List<ClientResponse> clients = clientService.findAll();
    return ResponseEntity.status(HttpStatus.OK).body(clients);
  }

  @GetMapping("/{clientId}")
  public ResponseEntity getOne(@PathVariable("clientId") Long clientId) {
    Client client = clientService.findById(clientId);
    return ResponseEntity.status(HttpStatus.OK).body(client);
  }

  @PutMapping("")
  public ResponseEntity update(@RequestBody ClientForm form) {
    log.info("form : {}", form);
    clientService.update(form);
    return ResponseEntity.status(HttpStatus.ACCEPTED).body("success to update client data");
  }

}
