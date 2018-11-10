package com.zj.data.web;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;

import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import com.zj.data.util.sdk.union.SDKConfig;


/**
 * 功能：从应用的classpath下加载acp_sdk.properties属性文件并将该属性文件中的键值对赋值到SDKConfig类中 <br>
 * 声明：以下代码只是为了方便接入方测试而提供的样例代码，商户可以根据自己需要，按照技术文档编写。该代码仅供参考，不提供编码，性能，规范性等方面的保障
 */
@Configuration
public class AutoLoadServlet extends HttpServlet {
	
	@Override
	public void init(ServletConfig config) throws ServletException {
		
		SDKConfig.getConfig().loadPropertiesFromSrc();
		
		super.init();
	}
}
