package com.practia.asm.core.configuration;


import org.apache.commons.configuration.ConfigurationException;
import org.apache.commons.configuration.PropertiesConfiguration;
import org.apache.commons.configuration.reloading.FileChangedReloadingStrategy;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.InitializingBean;

public class ApplicationProperties implements InitializingBean {

	private static Logger logger = LogManager.getLogger();
	
	private PropertiesConfiguration configuration;

	private String filePath;
	
	private FileChangedReloadingStrategy fileChangedReloadingStrategy;

	public void afterPropertiesSet() throws Exception {
		configuration.setReloadingStrategy(fileChangedReloadingStrategy);
	}

	public PropertiesConfiguration getConfiguration() {
		return configuration;
	}

	public void setConfiguration(PropertiesConfiguration configuration) {
		this.configuration = configuration;
	}

	public String getFilePath() {
		return filePath;
	}

	public void setFilePath(String filePath) {
		this.filePath = filePath;
	}

	public String getProperty(String key) {
		return (String) configuration.getProperty(key);
	}

	public void setProperty(String key, Object value) {
		configuration.setProperty(key, value);
	}

	public FileChangedReloadingStrategy getFileChangedReloadingStrategy() {
		return fileChangedReloadingStrategy;
	}

	public void setFileChangedReloadingStrategy(FileChangedReloadingStrategy fileChangedReloadingStrategy) {
		this.fileChangedReloadingStrategy = fileChangedReloadingStrategy;
	}

    /**
     * Save the configuration. Before this method can be called a valid file
     * name must have been set.
     *
     * @throws ConfigurationException if an error occurs or no file name has
     * been set yet
     */
	public void save() {
		try {
			configuration.save();
		} catch (ConfigurationException e) {
			logger.error("Error configuring ApplicationProperties :", e);
		}
	}

}