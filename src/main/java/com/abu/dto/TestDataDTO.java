package com.abu.dto;

import lombok.ToString;

import java.math.BigDecimal;
import java.util.Date;
import java.util.concurrent.TimeUnit;

/**
 * 测试用DO
 */
@SuppressWarnings("serial")
@ToString
public class TestDataDTO {

    private Long id;

    private Date gmtCreate;

    private BigDecimal lat;

    private String merchant;

    private String name;

    private Long timestamp;

    private Integer category;

    private Integer barShowStatus;

    public TestDataDTO() {
    }

    public TestDataDTO(Long id, Date gmtCreate, BigDecimal lat, String merchant, String name, Long timestamp,
            Integer category, Integer barShowStatus) {
        this.id = id;
        this.gmtCreate = gmtCreate;
        this.lat = lat;
        this.merchant = merchant;
        this.name = name;
        this.timestamp = timestamp;
        this.category = category;
        this.barShowStatus = barShowStatus;

    }

    public Long getId() {
        return id;
    }

    public TestDataDTO setId(Long id) {
        this.id = id;
        return this;
    }

    public Date getGmtCreate() {
        return gmtCreate;
    }

    public TestDataDTO setGmtCreate(Date gmtCreate) {
        this.gmtCreate = gmtCreate;
        return this;
    }

    public BigDecimal getLat() {
        return lat;
    }

    public TestDataDTO setLat(BigDecimal lat) {
        this.lat = lat;
        return this;
    }

    public String getMerchant() {
        return merchant;
    }

    public TestDataDTO setMerchant(String merchant) {
        this.merchant = merchant;
        return this;
    }

    public String getName() {
        return name;
    }

    public TestDataDTO setName(String name) {
        this.name = name;
        return this;
    }

    public Long getTimestamp() {

        return timestamp;
    }

    public void setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
    }

    public Integer getCategory() {
        return category;
    }

    public TestDataDTO setCategory(Integer category) {
        this.category = category;
        return this;
    }

    public Integer getBarShowStatus() {
        return barShowStatus;
    }

    public TestDataDTO setBarShowStatus(Integer barShowStatus) {
        this.barShowStatus = barShowStatus;
        return this;
    }

    public static TestDataDTO generateData(Long id, boolean needDelay) {

        if (needDelay) {
            try {
                TimeUnit.MILLISECONDS.sleep(2);
            } catch (InterruptedException e) {
                //do nothing

            }
        }
        // long deltaTime = id%131*5000;
        long deltaTime = 0;
        Date now = new Date(System.currentTimeMillis()+deltaTime);



        return new TestDataDTO(id, now, new BigDecimal("12.344569987"), "mer_321", "my name ccc",
                now.getTime(), 9, 1);
    }


}