package com.example.demo.controller;


import com.example.demo.service.IWalletService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;


/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author hjh
 * @since 2023-02-15
 */
@RestController
@RequestMapping("/wallet")
public class WalletController {

    @Autowired
    private IWalletService walletService;


}
