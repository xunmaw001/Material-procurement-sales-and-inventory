package com.entity.model;

import com.entity.KehuEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;


/**
 * 客户
 * 接收传参的实体类
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了）
 * 取自ModelAndView 的model名称
 * @author 
 * @email
 * @date 2021-04-22
 */
public class KehuModel implements Serializable {
    private static final long serialVersionUID = 1L;




    /**
     * 主键
     */
    private Integer id;


    /**
     * 客户姓名
     */
    private String kehuName;


    /**
     * 客户手机号
     */
    private String kehuPhone;


    /**
     * 客户身份证号
     */
    private String kehuIdNumber;


    /**
     * 客户头像
     */
    private String kehuPhoto;


    /**
     * 客户性别
     */
    private Integer sexTypes;


    /**
     * 创建时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    private Date createTime;


    /**
	 * 获取：主键
	 */
    public Integer getId() {
        return id;
    }


    /**
	 * 设置：主键
	 */
    public void setId(Integer id) {
        this.id = id;
    }
    /**
	 * 获取：客户姓名
	 */
    public String getKehuName() {
        return kehuName;
    }


    /**
	 * 设置：客户姓名
	 */
    public void setKehuName(String kehuName) {
        this.kehuName = kehuName;
    }
    /**
	 * 获取：客户手机号
	 */
    public String getKehuPhone() {
        return kehuPhone;
    }


    /**
	 * 设置：客户手机号
	 */
    public void setKehuPhone(String kehuPhone) {
        this.kehuPhone = kehuPhone;
    }
    /**
	 * 获取：客户身份证号
	 */
    public String getKehuIdNumber() {
        return kehuIdNumber;
    }


    /**
	 * 设置：客户身份证号
	 */
    public void setKehuIdNumber(String kehuIdNumber) {
        this.kehuIdNumber = kehuIdNumber;
    }
    /**
	 * 获取：客户头像
	 */
    public String getKehuPhoto() {
        return kehuPhoto;
    }


    /**
	 * 设置：客户头像
	 */
    public void setKehuPhoto(String kehuPhoto) {
        this.kehuPhoto = kehuPhoto;
    }
    /**
	 * 获取：客户性别
	 */
    public Integer getSexTypes() {
        return sexTypes;
    }


    /**
	 * 设置：客户性别
	 */
    public void setSexTypes(Integer sexTypes) {
        this.sexTypes = sexTypes;
    }
    /**
	 * 获取：创建时间
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 设置：创建时间
	 */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    }
