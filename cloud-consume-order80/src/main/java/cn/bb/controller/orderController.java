package cn.bb.controller;

import cn.bb.entity.CommonResult;
import cn.bb.entity.Payment;
import org.omg.CORBA.PUBLIC_MEMBER;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.client.RestTemplate;

@Controller
public class orderController {
    private static final String PAYMENTURL =" http://localhost:8001";
    @Autowired
    RestTemplate restTemplate;
    @GetMapping(value = "/consume/order/{id}")
    public CommonResult orderFind(@PathVariable long id){
return restTemplate.getForObject(PAYMENTURL+"/payment/find"+id,CommonResult.class,id);

    }
    @PostMapping(value = "/consume/add")
    public  CommonResult orderadd(@RequestBody Payment payment){
return restTemplate.postForObject(PAYMENTURL+"/payment/add",payment,CommonResult.class);

    }
}
