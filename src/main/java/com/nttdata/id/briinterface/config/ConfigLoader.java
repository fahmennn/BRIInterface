package com.nttdata.id.briinterface.config;

import com.nttdata.id.briinterface.model.mysql.MySQLModel;
import com.nttdata.id.briinterface.repository.mysql.MySQLRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.core.env.ConfigurableEnvironment;
import org.springframework.core.env.MapPropertySource;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Component
public class ConfigLoader {

	@Autowired
	private MySQLRepository mysqlRepository;
	
	@Autowired
    private ConfigurableEnvironment environment;
	
	@PostConstruct
	@Bean(name = "ConfigLoader")
    public void loadConfigurations() {
		List<MySQLModel> configList = mysqlRepository.findAll();
        Map<String, Object> configMap = new HashMap<>();
        for (MySQLModel config : configList) {
            configMap.put(config.getSystemParameterId(), config.getData());
        }
        
        MapPropertySource propertySource = new MapPropertySource("databaseConfig", configMap);
        environment.getPropertySources().addLast(propertySource);
    }
	
}
