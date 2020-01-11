package com.vip.video.service;

import com.vip.video.repository.entity.Ball;
import com.vip.video.repository.entity.BallDate;
import com.vip.video.repository.entity.OpenPrice;
import com.vip.video.repository.entity.Status;
import com.vip.video.repository.mapper.BallDateMapper;
import com.vip.video.repository.mapper.BallMapper;
import com.vip.video.repository.mapper.OpenPriceMapper;
import com.vip.video.repository.mapper.StatusMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by lenovo on 2018/11/19.
 */
@Service
public class BackService {
    @Autowired
    private BallMapper ballMapper;
    @Autowired
    private BallDateMapper ballDataMapper;

    @Autowired
    private OpenPriceMapper openPriceMapper;

    @Autowired
    private StatusMapper statusMapper;

    public List<Ball> selectAll(){
        List<Ball> balls = ballMapper.selectAll();
        if(balls!=null || balls.size()>0){
            return balls;
        }else {
            return null;
        }
    }


    public int updateBall(Ball ball){
        int row = ballMapper.updateByPrimaryKey(ball);
        if (row>0){
            return 1;
        }else {
            return 0;
        }
    }



    public int updateBallDate(BallDate ballDate){
        int row = ballDataMapper.updateByPrimaryKey(ballDate);
        return row;
    }

    public int openPrice(OpenPrice openPrice){
        int row = openPriceMapper.updateByPrimaryKey(openPrice);
        return row;
    }


    public OpenPrice select_openPrice(){
        OpenPrice openPrice = openPriceMapper.selectAll();
        return openPrice;
    }

    public BallDate select_ballDate(){
        BallDate ballDate = ballDataMapper.selectAll();
        return ballDate;
    }


    public Status selectStatus(){
        Status status = statusMapper.selectByPrimaryKey(1);
        return status;
    }


    public int updateStatus(Status status){
        int row = statusMapper.updateByPrimaryKey(status);
        return row;

    }



}
