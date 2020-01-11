package com.vip.video.controller;

import com.vip.video.service.BackService;
import com.vip.video.repository.entity.Ball;
import com.vip.video.repository.entity.BallDate;
import com.vip.video.repository.entity.OpenPrice;
import com.vip.video.repository.entity.Status;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * Created by lenovo on 2018/11/19.
 */
@Controller
public class IndexController {

    @Autowired
    private BackService backService;

    @RequestMapping(value = "/pageIndex")
    public String pageIndex() {
        int a = 1;
        return "index";

    }


    @RequestMapping(value = "/back/end")
    public String page_houduan(Model model) {
        List<Ball> result = backService.selectAll();
        Status status = new Status();
        status.setId(1);
        status.setNumers(1);
        int row = backService.updateStatus(status);
        model.addAttribute("list", result);
        return "data";

    }

    @ResponseBody
    @RequestMapping(value = "/updateBalls", method = RequestMethod.GET)
    public String updateBall(@RequestParam("ballValues") String ballValues) {
        BallDate ballDate = new BallDate();
        ballDate.setId(1);
        ballDate.setTimeData(ballValues);
        int row = backService.updateBallDate(ballDate);
        if (row > 0) {
            return "ok";
        } else {
            return "false";
        }

    }


    @ResponseBody
    @RequestMapping(value = "/openPrice", method = RequestMethod.GET)
    public String openPrice(@RequestParam("priceDate") String priceDate) {
        //2018-11-15T22:11
        String[] result = priceDate.split("-");
        String year = result[0];
        String month = result[1];
        //int month = Integer.parseInt(result[1]);
        String day = result[2].split("T")[0];
        String numbers = priceDate.substring(11, 16);
        String dates = numbers.split(":")[0];
        String menus = numbers.split(":")[1];
        String time_number=year+"-"+month+"-"+day+"-"+dates+":"+menus;
        System.out.println(time_number);
        OpenPrice openPrice = new OpenPrice();
        openPrice.setId(1);
        openPrice.setOpenTime(time_number);

        int row = backService.openPrice(openPrice);
        if (row > 0) {
            return "ok";
        } else {
            return "false";
        }

    }

    @ResponseBody
    @RequestMapping(value = "/updateBall", method = RequestMethod.POST)
    public String updateBall(Ball ball) {
        int row = backService.updateBall(ball);
        if (row == 1) {
            return "ok";

        } else {
            return "false";
        }

    }


    @RequestMapping(value = "/listAll", method = RequestMethod.GET)
    public String select_all(Model model) {
//        System.out.println(statues);
//        if (statues==null){
//            List<Ball> result = backService.selectAll();
//            OpenPrice openPrice = backService.select_openPrice();
//            String openTime = openPrice.getOpenTime();
//            BallDate ballDate = backService.select_ballDate();
//            String timeData = ballDate.getTimeData();
//            model.addAttribute("opentime",openTime);
//            model.addAttribute("list", result);
//            model.addAttribute("timeData",timeData);
//            return "index";
//        }else if (statues){
//            List<Ball> result = backService.selectAll();
//            OpenPrice openPrice = backService.select_openPrice();
//            String openTime = openPrice.getOpenTime();
//            BallDate ballDate = backService.select_ballDate();
//            String timeData = ballDate.getTimeData();
//            model.addAttribute("opentime",openTime);
//            model.addAttribute("list", result);
//            model.addAttribute("timeData",timeData);
//            return "index";
//        }else {
//            return "nodata";
//        }
return null;
    }

//    @RequestMapping(value = "/noselect")
//    public String no_select(){
//
//    }


    @RequestMapping(value = "/selectOpen",method = RequestMethod.GET)
    public String selectDates(Model model){
        OpenPrice openPrice = backService.select_openPrice();
        String openTime = openPrice.getOpenTime();
        model.addAttribute("opentime",openTime);
        return "index";
    }

    @RequestMapping(value = "/updateStatus",method = RequestMethod.GET)
    public String status(Model model,@RequestParam(value = "priceDate",required =false)Boolean statues){
        if (statues==null){

            Status status = backService.selectStatus();
            Integer numers = status.getNumers();
            if (numers==1){
                List<Ball> result = backService.selectAll();
                OpenPrice openPrice = backService.select_openPrice();
                String openTime = openPrice.getOpenTime();
                BallDate ballDate = backService.select_ballDate();
                String timeData = ballDate.getTimeData();
                model.addAttribute("opentime",openTime);
                model.addAttribute("list", result);
                model.addAttribute("timeData",timeData);
                return "index";
            }else {
                return "nodata";
            }
        }else if(statues){
            Status status = new Status();
            status.setId(1);
            status.setNumers(1);
            int row = backService.updateStatus(status);
            if(row==1){
                List<Ball> result = backService.selectAll();
                OpenPrice openPrice = backService.select_openPrice();
                String openTime = openPrice.getOpenTime();
                BallDate ballDate = backService.select_ballDate();
                String timeData = ballDate.getTimeData();
                model.addAttribute("opentime",openTime);
                model.addAttribute("list", result);
                model.addAttribute("timeData",timeData);
                return "index";
            }else {
                return "nodata";
            }

        }else {
            //更新数据库字段
            Status status = new Status();
            status.setId(1);
            status.setNumers(2);
            int row = backService.updateStatus(status);
            if (row>0){
                return "nodata";
            }
            //跳转页面
            return "nodata";
        }

    }

}
