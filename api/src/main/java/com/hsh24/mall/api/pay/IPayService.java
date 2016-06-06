package com.hsh24.mall.api.pay;

import com.hsh24.mall.api.trade.bo.OrderRefund;
import com.hsh24.mall.framework.bo.BooleanResult;

/**
 * 
 * @author JiakunXu
 * 
 */
public interface IPayService {

	String PAY_TYPE_ALIPAY = "alipay";

	String PAY_TYPE_WXPAY = "wxpay";

	/**
	 * 支付.
	 * 
	 * @param userId
	 * @param shopId
	 * @param tradeNo
	 * @param remark
	 * @param payType
	 * @param ip
	 * @param openId
	 *            用户在商户appid下的唯一标识.
	 * @return
	 */
	BooleanResult pay(Long userId, Long shopId, String tradeNo, String remark, String payType, String ip, String openId);

	/**
	 * 申请退款.
	 * 
	 * @param userId
	 * @param shopId
	 * @param tradeNo
	 * @param orderId
	 * @param orderRefund
	 *            退款信息.
	 * @return
	 */
	BooleanResult refund(Long userId, Long shopId, String tradeNo, String orderId, OrderRefund orderRefund);

	// >>>>>>>>>>以下是第三方交易平台<<<<<<<<<<

	/**
	 * 支付通知.
	 * 
	 * @param wxNotify
	 * @return
	 */
	BooleanResult notify(String wxNotify);

}
