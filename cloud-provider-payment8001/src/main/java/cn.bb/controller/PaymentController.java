package cn.bb.controller;

import cn.bb.entity.CommonResult;
import cn.bb.entity.Payment;
import cn.bb.service.PayMentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class PaymentController {
    @Autowired
    PayMentService payMentService;

  @PostMapping(value = "/payment/add")
public CommonResult addPayment(Payment payment){
      int result=payMentService.addPayment(payment);
      if(result>0){
          return new CommonResult(200,"success",payment);

      }

      return new CommonResult(500,"faild",null);
  }
  @GetMapping(value = "/payment/find/{id}")
  public CommonResult findPayment(@PathVariable long id){
Payment payment=payMentService.findPaymentById(id);
      System.out.println("---------------"+payment);
      if(payment!=null){
          return new CommonResult(200,"success/查询id"+id,payment);
      }
      return new CommonResult(500,"faild",null);
  }
}
