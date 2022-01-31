/*
 * Created By dogfootmaster@gmail.com on 2022
 * This program is free software
 *
 * @author <a href=“mailto:dogfootmaster@gmail.com“>Jongsang Han</a>
 * @since 2022/01/04
 */

package com.jjong.jpastudy.repository;

import static org.assertj.core.api.Assertions.assertThat;

import com.jjong.jpastudy.domain.Client;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;
import org.springframework.transaction.annotation.Transactional;

/**
 * create on 2022/01/04. create by IntelliJ IDEA.
 *
 * <p> 클래스 설명 </p>
 * <p> {@link } and {@link }관련 클래스 </p>
 *
 * @author Jongsang Han
 * @version 1.0
 * @see
 * @since 1.0
 */
class ClientRepositoryTest extends RepositoryTest {

  @Autowired
  private ClientRepository repository;


  @Test
  public void Given_Client_When_Persist_Then_Success() {
    // given
    String name = "jongsang";
    String email = "jongsang@bigin.io";
    String phoneNumber = "0101234567";
    Client client = new Client(name, email, phoneNumber);

    // when
    repository.save(client);

    Client foundClient = repository.findById(client.getId());

    // then
    assertThat(foundClient).isNotNull();
    assertThat(foundClient.getName()).isEqualTo(name);
  }
}