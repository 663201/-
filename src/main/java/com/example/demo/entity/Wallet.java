package com.example.demo.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;
import java.time.LocalDateTime;

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
public class Wallet implements Serializable {


    private Long id;
    /**
     * 用户名
     */
    private String username;

    /**
     * 钱包id
     */
    private Long walletId;

    /**
     * 更新创建时间
     */
    private LocalDateTime updateTime;

    private WalletDetails[] walletDetails;
}
