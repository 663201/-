package com.example.demo.controller;


import com.example.demo.entity.WalletDetails;
import com.example.demo.service.IWalletDetailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author hjh
 * @since 2023-02-15
 */
@RestController
@RequestMapping("/demo/wallet-details")
public class WalletDetailsController {

    @Autowired
    IWalletDetailsService iWalletDetailsService;
    /**
     * 1.查询用户钱包余额的接口，钱包id
     * @param id
     * @return
     */
    @GetMapping("/{id}")
    public String getBalance(Module module, @PathVariable int  id){

        return "WalletDetails";
    }

    // 2. 用户消费的接口，id为钱包id，jine为消费金额
    @GetMapping("/xiaofei/{id}/{jine}")
    public String sub(@PathVariable("id") int id,
                          @PathVariable("jine") BigDecimal jine){

        return "WalletDetails";
    }

    // 3. 用户退款接口,钱包id，jine为退款金额
    @GetMapping("/add/{id}/{jine}")
    public String add(@PathVariable("id") Long id,
                      @PathVariable("jine") BigDecimal jine){

        return "WalletDetails";
    }


    // 4. 查询用户钱包金额变动明细的接口
    @GetMapping("/mingxi")
    public String allfind(Module module, WalletDetails walletDetails){

        return "WalletDetails";
    }
}
