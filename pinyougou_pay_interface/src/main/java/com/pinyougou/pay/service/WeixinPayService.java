package com.pinyougou.pay.service;

import java.util.Map;

public interface WeixinPayService {

	/**
	 * 生成微信支付二维码
	 * @param out_trade_no 商户订单号 为外部系统校验
	 * @param total_fee 二维码金额，金额(分)
	 * @return
	 */
	public Map createNative(String out_trade_no,String total_fee);


	/**
	 * 查询支付订单状态
	 * @param out_trade_no 商户订单号
	 * @return
	 */
	public Map queryPayStatus(String out_trade_no);

	/**
	 * 关闭订单
	 * @param out_trade_no 商户订单号
	 * @return
	 */
	public Map closePay(String out_trade_no);
	
}
