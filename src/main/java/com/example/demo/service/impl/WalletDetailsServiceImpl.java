package com.example.demo.service.impl;

import com.example.demo.entity.WalletDetails;
import com.example.demo.mapper.WalletDetailsMapper;
import com.example.demo.service.IWalletDetailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author hjh
 * @since 2023-02-15
 */
@Service
public class WalletDetailsServiceImpl implements IWalletDetailsService {

    @Autowired
    WalletDetailsMapper walletDetailsMapper;


    @Override
    public int  findWalletDatails(int id) {
        return walletDetailsMapper.findWalletDatails(id);
    }

    @Override
    public void insertWalletDatails(WalletDetails walletDetails) {
        walletDetailsMapper.addWalletDatails(walletDetails);
    }

    @Override
    public List<WalletDetails> findAllWalletDatails() {
        return walletDetailsMapper.findAllWalletDatails();
    }
}
