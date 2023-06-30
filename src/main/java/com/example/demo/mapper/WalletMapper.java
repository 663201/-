package com.example.demo.mapper;

import com.example.demo.entity.Wallet;
import org.apache.ibatis.annotations.Mapper;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author hjh
 * @since 2023-02-15
 */
@Mapper
public interface WalletMapper {

    //查询用户信息
    Wallet findWallet(int id);
}
