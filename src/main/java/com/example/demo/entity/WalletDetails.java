package com.example.demo.entity;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.io.Serializable;

import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 * 
 * </p>
 *
 * @author hjh
 * @since 2023-02-15
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class WalletDetails implements Serializable {


    /**
     * 钱包id
     */
    private Long id;

    /**
     * 钱包余额
     */
    private BigDecimal balance;

    /**
     * 金额变动
     */
    private BigDecimal changeBalance;

    /**
     * 更新创建时间
     */
    private LocalDateTime updateTime;

    /**
     * 1为消费，0为存钱
     */
    private int type;

    /**
     * 用户id
     */
    private int Userid;
}
