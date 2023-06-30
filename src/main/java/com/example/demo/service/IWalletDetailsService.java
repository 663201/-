package com.example.demo.service;


import com.example.demo.entity.WalletDetails;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author hjh
 * @since 2023-02-15
 */
public interface IWalletDetailsService {

    //查询余额
    int findWalletDatails(int id);

    //添加金额变动信息
    void insertWalletDatails(WalletDetails walletDetails);

    //查询金额变动详细
    List<WalletDetails> findAllWalletDatails();

}
