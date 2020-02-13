package com.qa.pom.utils;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.yaml.YAMLFactory;
import com.fasterxml.jackson.databind.DeserializationFeature;
import java.io.File;
import java.io.IOException;

public class YamlParser {

    /**
     * Parse yaml configuration file
     *
     * @return YamlFile that represents content from yaml file
     */
    public static YamlFile getYamlData() throws IOException {
        YamlFile yamlFile = null;
        ObjectMapper objectMapper = new ObjectMapper(new YAMLFactory());
       // objectMapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        yamlFile =
                objectMapper.readValue(
                        new File("src/main/resources/configuration.yaml"), YamlFile.class);
        return yamlFile;
    }
}
