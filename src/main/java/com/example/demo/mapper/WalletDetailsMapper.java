package com.example.demo.mapper;


import com.example.demo.entity.WalletDetails;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author hjh
 * @since 2023-02-15
 */
@Mapper
public interface WalletDetailsMapper {
     //查询余额
    int findWalletDatails(int id);

     //添加金额变动信息
     void addWalletDatails(WalletDetails walletDetails);

     //查询金额变动详细
     List<WalletDetails> findAllWalletDatails();
}
