package com.example.demo.pojo;

import lombok.*;

import javax.persistence.*;

/**
 * 角色
 */
@Entity
@Table(name="role_table")
@Data
@ToString
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Role {
    /**
     * 角色id@NoArgsConstructor
     */
    @Id
    @GeneratedValue
    @Column(name = "role_id",length = 150,nullable=true)
    private Long roleId;
    /**
     * 角色名字
     */
    @Column(name = "role_name",length = 150,nullable=true)
    private String roleName;

}
