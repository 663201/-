package com.example.demo.service.impl;


import com.example.demo.entity.Wallet;
import com.example.demo.mapper.WalletMapper;
import com.example.demo.service.IWalletService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author hjh
 * @since 2023-02-15
 */
@Service
public class WalletServiceImpl implements IWalletService {

    @Autowired
    WalletMapper walletMapper;


    @Override
    public Wallet findWallet(int id) {
        return walletMapper.findWallet(id);
    }
}
