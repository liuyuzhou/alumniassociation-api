package com.alumniassociation.common.utils;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author wangyan
 * @date:   2018年12月24日 上午10:46:06 
 */
public class MobileUtils {

	/**
	*判断是否是手机号
	*2018,各大运营商增加了新号段
	*目前已支持的匹配号段
	*中国电信号段
	*133、149、153、173、177、180、181、189、199
	
	*中国联通号段
	*130、131、132、145、155、156、166、175、176、185、186
	
	*中国移动号段
	*134(0-8)、135、136、137、138、139、147、150、151、152、157、158、159、178、182、183、184、187、188、198
	
	*其他号段
	
	*14号段以前为上网卡专属号段，如中国联通的是145，中国移动的是147等等。
	*虚拟运营商
	*电信：1700、1701、1702
	*移动：1703、1705、1706
	*联通：1704、1707、1708、1709、171
	* @param mobile
	* @return
	*/
	public static boolean isMobile(String mobile) {
		if(mobile == null || "".equals(mobile)){
			return false;
		}
	    // "[1]"代表第1位为数字1，"[358]"代表第二位可以为3、5、8中的一个，"\\d{9}"代表后面是可以是0～9的数字，有9位。
		String regex = "^((13[0-9])|(14[5,7])|(15[0-3,5-9])|(17[0,3,5-8])|(18[0-9])|166|198|199|(147))\\d{8}$";
		Pattern p = Pattern.compile(regex, Pattern.CASE_INSENSITIVE);
		Matcher m = p.matcher(mobile.trim());
		return m.matches();
	}
}
