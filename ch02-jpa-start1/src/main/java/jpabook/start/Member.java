package jpabook.start;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;  //**


@Getter @Setter
@Entity
@Table(name="MEMBER")
public class Member {

    @Id
    @Column(name = "ID")
    private String id;

    @Column(name = "NAME")
    private String username;

    // 매핑 정보가 없으면 필드명으로 매핑해준다!!
    private Integer age;
}
