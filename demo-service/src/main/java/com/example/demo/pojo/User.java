package com.example.demo.pojo;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import java.io.Serializable;

/**
 * 用户
 */
@Entity
@Table(name = "hole_user")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class User implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @NotBlank(message = "用户名不能为空")
    @Column(name = "user_name")
    private String userName;
    @NotBlank(message = "密码不能为空")
    @Column(name = "user_pass")
    private String userPass;
}
