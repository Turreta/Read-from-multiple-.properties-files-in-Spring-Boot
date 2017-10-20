package com.turreta.spring.multiple.properties.demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;
import org.springframework.stereotype.Component;

@Component
@PropertySources(
		{
		@PropertySource("classpath:config001.properties"),
		@PropertySource("classpath:config002.properties")
		}
)
public class AllConfig
{

	@Value("${config001.field001}")
	private String config001Field001;

	@Value("${config001.field002}")
	private String config001Field002;

	@Value("${config001.field003}")
	private String config001Field003;

	@Value("${config002.field001}")
	private String config002Field001;

	@Value("${config002.field002}")
	private String config002Field002;

	@Value("${config002.field003}")
	private String config002Field003;

	@Value("${com.turreta.app.descripion}")
	private String appDescription;

	public String getConfig001Field001()
	{
		return config001Field001;
	}

	public String getConfig001Field002()
	{
		return config001Field002;
	}

	public String getConfig001Field003()
	{
		return config001Field003;
	}

	public String getConfig002Field001()
	{
		return config002Field001;
	}

	public String getConfig002Field002()
	{
		return config002Field002;
	}

	public String getConfig002Field003()
	{
		return config002Field003;
	}

	public String getAppDescription()
	{
		return appDescription;
	}
}
