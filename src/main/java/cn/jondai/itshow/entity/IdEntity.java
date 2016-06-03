package cn.jondai.itshow.entity;

import javax.persistence.*;

import com.google.gson.annotations.Expose;
import org.hibernate.annotations.GenericGenerator;

import java.util.Date;

/**
 * 统一定义id的entity基类.
 * <p/>
 * 基类统一定义id的属性名称、数据类型、列名映射及生成策略.
 * 子类可重载getId()函数重定义id的列名映射和生成策略.
 *
 * @author Pitt Dong
 */
//JPA 基类的标识
@MappedSuperclass
public abstract class IdEntity {

	@Expose
    protected Long id;

    @Column(name = "create_time")
    protected Date createTime;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    //@GeneratedValue(strategy = GenerationType.SEQUENCE)
//    @GeneratedValue(generator = "system-uuid")
//    @GenericGenerator(name = "system-uuid", strategy = "uuid")
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}
