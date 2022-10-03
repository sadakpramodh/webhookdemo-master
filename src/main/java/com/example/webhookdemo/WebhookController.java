package com.example.webhookdemo;


import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.*;
//
//@RestController
//@RequestMapping("/api/webhook")
//public class WebhookController {
//


//    @PostMapping // http://localhost:8080/api/webhook
//    public ResponseEntity<String> print(@RequestBody String requestBody) {
//        System.out.println("###### Webhook #####" + requestBody);
//        return new ResponseEntity<String >(requestBody, HttpStatus.OK);
//    }

//    @RequestMapping(value="/welcome",method= RequestMethod.GET)
//    public String hello(){
//        return "Hello World";
//    }

//    @RequestMapping(value="/webhook",method= RequestMethod.GET)
//    public String web(
//            @RequestParam String  web
//            @RequestParam String  hubchallenge,@RequestParam String hubverify_token
//            ){

//        return "welcome to webhook "+web+" ";
//    }
//    @RequestMapping(value="/webhook",method= RequestMethod.POST)
//    public String web1(@RequestParam String  hub.mode, @RequestParam String  hub.challenge,@RequestParam hub.verify_token){
//
//        return "welcome to webhook My Name is"+hub.mode+" "+hub.challenge+" "+ hub.verify_token+"";
//    }

//    @RequestMapping(value="user", method = RequestMethod.GET)
//    public @ResponseBody WebhookDto webhook getItem(){
//
//        Item i = itemDao.findOne(itemid);
//        String itemName = i.getItemName();
//        String price = i.getPrice();
//        return i;
//    }


//}
