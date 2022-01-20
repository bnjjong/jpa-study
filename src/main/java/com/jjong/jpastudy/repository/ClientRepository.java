/*
 * Created By dogfootmaster@gmail.com on 2022
 * This program is free software
 *
 * @author <a href=“mailto:dogfootmaster@gmail.com“>Jongsang Han</a>
 * @since 2022/01/04
 */

package com.jjong.jpastudy.repository;

import com.jjong.jpastudy.domain.Client;
import javax.persistence.EntityManager;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

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
@RequiredArgsConstructor
@Repository
public class ClientRepository {

  private final EntityManager em;

  public void save(Client client) {
    em.persist(client);
  }

  public Client findById(Long id) {
    return em.find(Client.class, id);
  }


}
