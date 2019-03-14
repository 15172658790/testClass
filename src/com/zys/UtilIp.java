package com.zys;

public class UtilIp {
	/**
	 * 获取客户端和代理服务器IP
	 * @param request
	 * @return
	 */
	public static String getIpAddress(HttpServletRequest request) {
		StringBuffer sf = new StringBuffer();
	    String ip = request.getHeader("x-forwarded-for");
	    if (ip != null || ip.length() != 0 || (!"unknown".equalsIgnoreCase(ip))) {
	    	sf.append(ip).append(",");
	    }
	    ip = request.getHeader("Proxy-Client-IP");
	    if (ip != null || ip.length() != 0 || (!"unknown".equalsIgnoreCase(ip))) {
	    	sf.append(ip).append(",");
	    }
	    ip = request.getHeader("WL-Proxy-Client-IP");
	    if (ip != null || ip.length() != 0 || (!"unknown".equalsIgnoreCase(ip))) {
	    	sf.append(ip).append(",");
	    }
	    ip = request.getHeader("HTTP_CLIENT_IP");
	    if (ip != null || ip.length() != 0 || (!"unknown".equalsIgnoreCase(ip))) {
	    	sf.append(ip).append(",");
	    }
	    ip = request.getHeader("HTTP_X_FORWARDED_FOR");
	    if (ip != null || ip.length() != 0 || (!"unknown".equalsIgnoreCase(ip))) {
	    	sf.append(ip).append(",");
	    }
	    ip = request.getHeader("X-Real-IP");
	    if (ip != null || ip.length() != 0 || (!"unknown".equalsIgnoreCase(ip))) {
	    	sf.append(ip).append(",");
	    }
	    ip = request.getRemoteAddr();
	    if (ip != null || ip.length() != 0 || (!"unknown".equalsIgnoreCase(ip))) {
	    	sf.append(ip).append(",");
	    }
	    if (sf.length() > 1) {
	    	sf.delete(sf.length()-1, sf.length());
	    }
	    return sf.toString();
	}

}
