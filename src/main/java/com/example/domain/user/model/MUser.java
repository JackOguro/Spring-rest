package com.example.domain.user.model;

import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.Data;

/**
 * @Entity データベースのテーブルとマッピングするクラスに付ける。
 *          このアノテーションを付けるとクラスメイト同じテーブル名を作成してくれる
 * @Table JPAでは、クラス名と同じテーブル名のデータをマッピングしようする。
 *         クラス名とテーブル名が異なる場合は、@Tableアノテーションを付ける。
 * @Transient O/Rマッピングしたくないフィールドには、一時的に付ける
 */

@Data
@Entity
@Table(name="m_user")
public class MUser {
	@Id
    private String userId;
    private String password;
    private String userName;
    private Date birthday;
    private Integer age;
    private Integer gender;
    private Integer departmentId;
    private String role;
    
    /**
     * @ManyToOne 多対一の関係を表す場合付ける。ユーザーマスタ(Many)、部署マスタ(One)
     *             optional属性では、テーブルの結合方法を指定する。
     *             optional=true→nullを許容, left join optional=false→nullを非許容, inner join
     * @JoinColumn 結合するカラムを指定する。name属性には結合先のカラム名を指定
     *              insertable, updatable属性はフィールドをinsertとupdate対象に含めるか指定する
     */
    
    @ManyToOne(optional=true)
    @JoinColumn(insertable=false, updatable=false, name="departmentId")
    private Department department;
    
    @OneToMany
    @JoinColumn(insertable=false, updatable=false, name="userId")
    private List<Salary> salaryList;
}
