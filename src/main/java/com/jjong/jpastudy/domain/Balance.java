/*
 * Created By dogfootmaster@gmail.com on 2022
 * This program is free software
 *
 * @author <a href=“mailto:dogfootmaster@gmail.com“>Jongsang Han</a>
 * @since 2022/01/04
 */

package com.jjong.jpastudy.domain;

import java.math.BigDecimal;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

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
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Entity
public class Balance {

  @Id
  @Column(name = "id", nullable = false)
  private Long id;

  private BigDecimal credit;
  private BigDecimal marketingCredit;

  @OneToOne(mappedBy = "balance")
  private Client client;

  public Balance(BigDecimal credit, BigDecimal marketingCredit) {
    this.credit = credit;
    this.marketingCredit = marketingCredit;
  }
}
