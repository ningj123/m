package com.wideka.mall.api.weixin;

import com.wideka.mall.framework.bo.BooleanResult;
import com.wideka.weixin.api.callback.bo.Content;

/**
 * 
 * @author JiakunXu
 * 
 */
public interface IMsgVideoService {

	/**
	 * 
	 * @param content
	 * @return
	 */
	BooleanResult createMsgVideo(Content content);

}