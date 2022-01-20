/*
 * Created By dogfootmaster@gmail.com on 2022
 * This program is free software
 *
 * @author <a href=“mailto:dogfootmaster@gmail.com“>Jongsang Han</a>
 * @since 2022/01/20
 */

package com.jjong.jpastudy.controller;

import com.jjong.jpastudy.controller.dto.ClientForm;
import com.jjong.jpastudy.service.ClientService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
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


  @PostMapping("")
  public ResponseEntity save(@RequestBody ClientForm form) {
    log.info("request form data is {}", form);
    clientService.save(form);
    return ResponseEntity.status(HttpStatus.CREATED).body("success to save client.");
  }

}
