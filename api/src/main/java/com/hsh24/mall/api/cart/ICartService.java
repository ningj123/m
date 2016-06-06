package com.hsh24.mall.api.cart;

import java.util.List;

import com.hsh24.mall.api.cart.bo.Cart;
import com.hsh24.mall.framework.bo.BooleanResult;

/**
 * 
 * @author JiakunXu
 * 
 */
public interface ICartService {

	String STATE_FINISH = "E";

	String STATE_REMOVE = "D";

	/**
	 * 
	 * @param userId
	 * @param shopId
	 * @param itemId
	 * @param skuId
	 * @param quantity
	 * @return
	 */
	BooleanResult createCart(Long userId, Long shopId, String itemId, String skuId, String quantity);

	/**
	 * 
	 * @param userId
	 * @param shopId
	 * @return
	 */
	int getCartCount(Long userId, Long shopId);

	/**
	 * 获取用户购物车.
	 * 
	 * @param userId
	 * @param shopId
	 * @return
	 */
	List<Cart> getCartList(Long userId, Long shopId);

	/**
	 * 移除购物车.
	 * 
	 * @param userId
	 * @param shopId
	 * @param cartId
	 * @return
	 */
	BooleanResult removeCart(Long userId, Long shopId, String[] cartId);

	/**
	 * 
	 * @param userId
	 * @param shopId
	 * @param cartId
	 * @param quantity
	 * @return
	 */
	BooleanResult updateQuantity(Long userId, Long shopId, String cartId, String quantity);

	/**
	 * 统计商品总金额 运费.
	 * 
	 * @param userId
	 * @param shopId
	 * @param cartId
	 * @return
	 */
	Cart getCartStats(Long userId, Long shopId, String[] cartId);

	/**
	 * 根据购物车完成订单.
	 * 
	 * @param userId
	 * @param shopId
	 * @param cartId
	 * @return
	 */
	BooleanResult finishCart(Long userId, Long shopId, String[] cartId);

}
