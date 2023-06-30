package com.example.demo.service;

import com.example.demo.entity.Wallet;
/**
 * <p>
 *  服务类
 * </p>
 *
 * @author hjh
 * @since 2023-02-15
 */
public interface IWalletService {

    //查询用户信息
    Wallet findWallet(int id);
}
