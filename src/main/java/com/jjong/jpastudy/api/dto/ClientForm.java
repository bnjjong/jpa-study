/*
 * Created By dogfootmaster@gmail.com on 2022
 * This program is free software
 *
 * @author <a href=“mailto:dogfootmaster@gmail.com“>Jongsang Han</a>
 * @since 2022/01/20
 */

package com.jjong.jpastudy.api.dto;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

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
@Getter
@ToString
@NoArgsConstructor
public class ClientForm {
  private Long id;

  @NotBlank(message = "name field is empty!")
  private String name;

  @NotBlank(message = "email field is empty!")
  @Email(message = "it is not email address.")
  private String email;

  @NotBlank(message = "phone_number field is empty!")
  private String phoneNumber;
}
